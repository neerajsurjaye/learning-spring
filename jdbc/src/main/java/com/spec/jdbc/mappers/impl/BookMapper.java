package com.spec.jdbc.mappers.impl;

import com.spec.jdbc.domain.BookEntity;
import com.spec.jdbc.domain.dto.BookDto;
import com.spec.jdbc.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class BookMapper implements Mapper<BookEntity , BookDto> {

    private ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity bookEntity) {
        return modelMapper.map(bookEntity , BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto , BookEntity.class);
    }
}
