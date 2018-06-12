package com.cj.file_manager.mapper;

import com.cj.file_manager.entity.Book;

import java.util.List;

public interface IBookMapper {
    List<Book> findAll();
}
