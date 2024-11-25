package com.aloha.board_project.service;

import java.util.List;

import com.aloha.board_project.dto.Board;
import com.aloha.board_project.dto.Page;

public interface BoardService {

    public List<Board> list() throws Exception;

    public Board select(String id) throws Exception;

    public int insert(Board board) throws Exception;

    public int update(Board board) throws Exception;

    public int delete(String id) throws Exception;

    public List<Board> list(Page page) throws Exception;
    
}
