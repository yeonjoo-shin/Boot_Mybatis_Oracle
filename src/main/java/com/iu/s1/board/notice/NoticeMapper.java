package com.iu.s1.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.iu.s1.board.BoardMapper;

//@Repository
@Mapper
public interface NoticeMapper extends BoardMapper {
		//serInsert가 안보이지만 있음.
		//interface 라서 객체 생성을 못함 그래서 mapper annotation 주기
}
