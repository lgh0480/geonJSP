package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;

public class LoginForm implements Command {

	@Override
	public String excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Login으로 이동
		return "member/loginForm";
	}

}
