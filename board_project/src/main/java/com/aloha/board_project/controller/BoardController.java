package com.aloha.board_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aloha.board_project.dto.Board;
import com.aloha.board_project.dto.Page;
import com.aloha.board_project.service.BoardService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
    
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String list(Model model, Page page) throws Exception {
        // 서비스 호출을 통해 게시글 목록 가져오기
        List<Board> boardList = boardService.list(page);

        // 모델에 데이터 추가
        model.addAttribute("boardList", boardList);
        model.addAttribute("rows", page.getRows());
        model.addAttribute("page", page);

        // 페이지 URL 생성
        String pageUrl = UriComponentsBuilder.fromPath("/board/list")
                // .queryParam("page", page.getPage())
                .queryParam("rows", page.getRows())
                .build()
                .toUriString();
        model.addAttribute("pageUrl", pageUrl);

        return "/board/list";
    }

    @GetMapping("/read")
    public String select(@RequestParam("id") String id, Model model) throws Exception {
        Board board = boardService.select(id);
        model.addAttribute("board", board);
        return "/board/read";
    }

    @GetMapping("/insert")
    public String insert() {
        
        return "/board/insert";
    }

    @PostMapping("/insert")
    public String insertPro(Board board) throws Exception {
        log.info("board : " + board);
        int result = boardService.insert(board);
        if( result > 0 ) {
            return "redirect:/board/list";
        }
        return "redirect:/board/insert?error";  
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") String id, Model model) throws Exception {
        Board board = boardService.select(id);
        model.addAttribute("board", board);
        return "/board/update";
    }

    @PostMapping("/update")
    public String updatePro(Board board) throws Exception {
        int result = boardService.update(board);
        
        if(result > 0){
            return "redirect:/board/list";
        }
        String id = board.getId();
        return "redirect:/board/update?id="+ id + "&error";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") String id, Model model) throws Exception {
        int result = boardService.delete(id);

        if(result > 0){
            return "redirect:/board/list";
        }
        return "redirect:/board/update?id="+ id + "&error";
    }
    
    
    
    
    
    
}
