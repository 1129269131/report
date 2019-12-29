package com.tjh.springbootapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * Generated on 2019-12-29
 * 
 */
public class BookIndex implements Serializable {

    //  - bigint(20)
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //  - bigint(20)
    private Long bookId;

    //  - int(5)
    private Integer indexNum;

    //  - varchar(100)
    private String indexName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(Integer indexNum) {
        this.indexNum = indexNum;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Override
    public String toString() {
        return "BookIndex{" +
            "id=" + id +
            ", bookId=" + bookId +
            ", indexNum=" + indexNum +
            ", indexName=" + indexName +
        "}";
    }
}








