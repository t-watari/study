package com.example.study.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "member")
public class MemberEntity implements UserDetails{

	private static final long serialVersionUID = 1667698003975566301L;

	/** userId */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
	/** userName */
    @Column(nullable = false, unique = true)
    private String username;
    /** nickname */
    @Column(nullable = false)
    private String nickname;
    /** passwordHash */
    @Column(nullable = false)
    private String passwordHash;
    
    /** Lock状態かどうか */
	private Boolean isLock;
	
	/** superUserかどうか */
	private Boolean isSuperUser;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return null;
    }
    
    public Long getUserId()
    {
        return this.userId;
    }

    @Override
    public String getPassword()
    {
        return this.passwordHash;
    }

    @Override
    public String getUsername()
    {
        return this.username;
    }
    
    public String getNickname()
    {
        return this.nickname;
    }
    
    public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Boolean getIsSuperUser() {
		return isSuperUser;
	}

	public void setIsSuperUser(Boolean isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

	@Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    public boolean isEnabled()
    {
        return true;
    }
    
  //------------------------------------------------------
  	// method
  	//------------------------------------------------------
  	/**
  	 * 同一の存在であるかどうか比較します。
  	 * ※userIdが同じであれば、同一と見なす
  	 */
  	public boolean equals(Object target) {

  		// 対象のデータがnull または MUserでなければ、同じ存在ではない
  		if(target == null || !(target instanceof MemberEntity)) {
  			return false;
  		}

  		// userIdが同じであれば、同じ存在と見なす
  		return this.userId == ((MemberEntity)target).getUserId();
  	}

  	public String getAvatarChar() {

  		if(this.nickname == null || this.nickname.isEmpty()) {
  			return "";
  		}

  		char firstChar = this.nickname.toCharArray()[0];
  		if (String.valueOf(firstChar).getBytes().length < 2) {
  			return this.nickname.substring(0, 2);
  		} else {
  			return this.nickname.substring(0, 1);
  		}
  	}
	
}
