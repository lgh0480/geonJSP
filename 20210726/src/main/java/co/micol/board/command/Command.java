package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//명령어를 받아서 처리
	public String execute(
			HttpServletRequest request, 
			HttpServletResponse response); 
		
	
}
