package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.common.Command;

public class Home implements Command {

	@Override
	public String excute(HttpServletRequest request, HttpServletResponse response) {
		
		return "home/home";
	}

}