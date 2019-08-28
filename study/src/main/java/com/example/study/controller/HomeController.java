package com.example.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.study.entity.MemberEntity;

/**
 * 初期表示画面
 * @author watari
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Home画面を表示します。
	 * @return
	 */
	@RequestMapping(value="/home", method = RequestMethod.GET)
	private String index(ModelAndView mav, Model model, @AuthenticationPrincipal MemberEntity loginMneber){
		
		model.addAttribute("myNickName", loginMneber.getNickname());
		
		return "/home/index";
	}
}
