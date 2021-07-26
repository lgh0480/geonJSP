package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.service.BoardService;
import co.micol.board.serviceImpl.BoardServiceImpl;
import co.micol.board.vo.BoardVO;

public class UpdateForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 수정하는 폼 호출
		request.setAttribute("bId", request.getParameter("ubId"));
		request.setAttribute("bTitle", request.getParameter("uTitle"));
		request.setAttribute("bContent", request.getParameter("uContent"));
		
		
		return "board/updateForm";
	}

}
