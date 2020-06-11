package com.iu.s1.board;

public interface BoardMapper {
	
	public int setInsert(BoardVO boardVO) throws Exception;
	
	//delete
	public int setDelete(BoardVO boardVO) throws Exception;

}
