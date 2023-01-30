package com.moura.sistemadepedidos.servicies;

import org.springframework.security.core.context.SecurityContextHolder;

import com.moura.sistemadepedidos.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		try {
		return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
