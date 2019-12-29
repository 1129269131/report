package com.tjh.springbootapi.service;

import com.koala.apiprototype.db.BaseService;
import com.tjh.springbootapi.entity.Book;
import com.tjh.springbootapi.entity.BookIndex;
import com.tjh.springbootapi.mapper.BookIndexMapper;
import com.tjh.springbootapi.mapper.BookMapper;
import com.tjh.springbootapi.view.response.BookIndexExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务类
 * Generated on 2019-12-29
 */
@Service
public class BookService extends BaseService<BookMapper, Book> {

    @Autowired
    private BookIndexMapper bookIndexMapper;

    public List<BookIndex> queryNewIndexList(Long bookId) {
        BookIndexExample example = new BookIndexExample();
        example.createCriteria().andBookIdEqualTo(bookId);
        example.setOrderByClause("index_num DESC");
        return bookIndexMapper.selectByExample(example);

    }
}
