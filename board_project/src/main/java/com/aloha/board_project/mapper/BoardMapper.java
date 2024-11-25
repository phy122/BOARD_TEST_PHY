package com.aloha.board_project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.board_project.dto.Board;

@Mapper
public interface BoardMapper {

    public List<Board> list();

    public Board select(String id) throws Exception;
    
    public int insert(Board board) throws Exception;

    public int update(Board board) throws Exception;

    public int delete(String id) throws Exception;
}
