package com.iu.s1.board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.s1.board.notice.NoticeMapper;
import com.iu.s1.board.notice.NoticeVO;
@SpringBootTest
class NoticeMapperTest {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	
	@Test
	public void setInsertTest() throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setTitle("test1");
		noticeVO.setContents("contents1");
		noticeVO.setWriter("writer1");
		int result = noticeMapper.setInsert(noticeVO);
		
		assertEquals(1, result);
	}
	
	
	@Test
	public void setDelete() throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(1);
		int result = noticeMapper.setDelete(noticeVO);
		assertEquals(1, result);
	}
	
}
