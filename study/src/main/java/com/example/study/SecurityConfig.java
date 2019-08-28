package com.example.study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.study.service.impl.MemberServiceImpl;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
	
	@Autowired
	private MemberServiceImpl memberService;
	
	/**
     * WebSecurityの設定
     */
    @Override
	public void configure(WebSecurity web) throws Exception {

    	logger.info("SecurityConfig.configure(WebSecurity)の実行");

    	// 静的リソース(images、css、javascript)とH2DBのコンソールに対するアクセスはセキュリティ設定を無視する
    	web.ignoring().antMatchers(
    				"/img/**",
    				"/fontawesome/**",
    				"/css/**",
    				"/js/**",
    				"/h2-console/**");
	}
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
		
    	// 認可の設定
        http.authorizeRequests()
            .antMatchers("/", "/index").permitAll() // indexは全ユーザーアクセス許可
            .anyRequest().authenticated();  // それ以外は全て認証無しの場合アクセス不許可
        
		//ログイン設定
        http.formLogin().loginProcessingUrl("/login").defaultSuccessUrl("/home", true).failureUrl("/login");
        
    }

    /**
	 * 認証設定
	 */
    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
	}

    /**
	 * パスワードエンコードの設定
	 * @return
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
