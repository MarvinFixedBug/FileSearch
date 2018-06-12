package com.cj.file_manager.service.impl;

import com.cj.file_manager.entity.Book;
import com.cj.file_manager.mapper.IBookMapper;
import com.cj.file_manager.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("BookService")
@Transactional
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookMapper bookMapper;

    @Override
    public List<Book> findAll() {

        return bookMapper.findAll();
    }
}
