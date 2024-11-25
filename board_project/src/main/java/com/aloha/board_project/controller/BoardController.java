package com.aloha.board_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aloha.board_project.dto.Board;
import com.aloha.board_project.service.BoardService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/board")
public class BoardController {
    
    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String list(Model model) throws Exception{
        List<Board> boardList = boardService.list();
        model.addAttribute("boardList", boardList);
        return "/board/list";
    }

    @GetMapping("/select")
    public String select(@RequestParam("id") String id, Model model) throws Exception {
        Board board = boardService.select(id);
        model.addAttribute("board", board);
        return "/board/select";
    }

    @GetMapping("/insert")
    public String insert() {
        
        return "/board/insert";
    }

    @PostMapping("/insert")
    public String insertPro(Board board) throws Exception {
        int result = boardService.insert(board);
        
        if(result > 0){
            return "redirect:/board/list";
        }
        return "redirect:/board/insert";

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
