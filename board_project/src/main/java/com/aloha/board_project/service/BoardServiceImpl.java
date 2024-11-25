package com.aloha.board_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.board_project.dto.Board;
import com.aloha.board_project.dto.Page;
import com.aloha.board_project.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;


    @Override
    public List<Board> list() {

        List<Board> boardList = boardMapper.list();
        return boardList;
    }

    @Override
    public Board select(String id) throws Exception {
        Board board = boardMapper.select(id);
        return board;
    }

    @Override
    public int insert(Board board) throws Exception {
        int result = boardMapper.insert(board);
        return result;
    }

    @Override
    public int update(Board board) throws Exception {
        int result = boardMapper.update(board);
        return result;
    }

    @Override
    public int delete(String id) throws Exception {
        int result = boardMapper.delete(id);
        return result;
    }

    @Override
    public List<Board> list(Page page) throws Exception {
 
        int total = boardMapper.count();
        page.setTotal(total);

        // 데이터 목록 가져오기
        return boardMapper.list(page);
    }
}
