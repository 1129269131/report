package com.tjh.springbootapi.controller;

import com.tjh.springbootapi.entity.BookIndex;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tjh.springbootapi.service.BookIndexService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
*  Controller
* Generated on 2019-12-29
*/
@RestController
@RequestMapping("/bookIndex")
public class BookIndexController {

    @Autowired
    private BookIndexService bookIndexService;

    /**
    * 按主键查询
    * @param id 主键Id
    * @return 实体
    */
    @GetMapping("/find/{id}")
    public BookIndex find(@PathVariable(value = "id") String id) {
    return bookIndexService.findById(id);
    }

}



