package com.tjh.springbootapi.controller;

import com.tjh.springbootapi.entity.Book;
import com.tjh.springbootapi.entity.BookIndex;
import com.tjh.springbootapi.service.BookIndexService;
import com.tjh.springbootapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller
 * Generated on 2019-12-29
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookIndexService bookIndexService;

    /**
     * 按主键查询
     *
     * @param id 主键Id
     * @return 实体
     */
    @GetMapping("/find/{id}")
    public Book find(@PathVariable(value = "id") String id) {
        return bookService.findById(id);
    }

    @RequestMapping("{bookId}.html")
    public String detail(ModelMap modelMap) {
        Long bookId = 6412L;
        //查询最新目录信息
        List<BookIndex> indexList = bookService.queryNewIndexList(bookId);
        modelMap.put("indexList", indexList);
        return "books/book_detail";
    }
}



