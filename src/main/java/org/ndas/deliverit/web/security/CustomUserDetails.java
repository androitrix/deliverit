package org.ndas.deliverit.web.security;

import java.util.Collection;

import org.ndas.deliverit.persistence.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails extends User implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9040558592762344943L;

	public CustomUserDetails(User user) {
		this.setFirstName(user.getFirstName());
		this.setLastName(user.getLastName());
		this.setId(user.getId());
		this.setPassword(user.getPassword());
		this.setUserName(user.getUserName());
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_USER");
	}

	public String getUsername() {
		return super.getUserName();
	}
	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}

}

