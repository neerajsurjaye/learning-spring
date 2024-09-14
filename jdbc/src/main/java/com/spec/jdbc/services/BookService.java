package com.spec.jdbc.services;

import com.spec.jdbc.domain.BookEntity;

import java.util.List;

public interface BookService {

    BookEntity createBook(String isbn , BookEntity book);

    List<BookEntity> findAll();
}
