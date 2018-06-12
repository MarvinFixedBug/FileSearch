package com.cj.file_manager.controller;

import com.cj.file_manager.entity.Book;
import com.cj.file_manager.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("/getList")
    @ResponseBody
    public List<Book> getList(){

        return bookService.findAll();
    }
}
