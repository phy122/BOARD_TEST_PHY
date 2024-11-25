package com.aloha.board_project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.aloha.board_project.dto.Board;
import com.aloha.board_project.dto.Page;

@Mapper
public interface BoardMapper {

    int count();

    public List<Board> list();

    public Board select(String id) throws Exception;
    
    public int insert(Board board) throws Exception;

    public int update(Board board) throws Exception;

    public int delete(String id) throws Exception;

    public List<Board> list(@Param("page") Page page) throws Exception;
}
