package com.cj.file_manager.service;

import com.cj.file_manager.entity.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
}
