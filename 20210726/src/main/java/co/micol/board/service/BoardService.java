package co.micol.board.service;

import java.util.List;

import co.micol.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardSelectList(); // 전체 조회(R)
	
	BoardVO boardSelect(BoardVO vo); // 한건 조회(R)
	
	int boardInsert(BoardVO vo); // 추가 (C)
	
	int boardDelete(BoardVO vo); // 게시글 삭제(D)

	int boardUpdate(BoardVO vo); // 게시글 수정(U)
}
