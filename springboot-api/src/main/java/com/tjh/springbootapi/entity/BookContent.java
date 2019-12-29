package com.tjh.springbootapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * Generated on 2019-12-29
 * 
 */
public class BookContent implements Serializable {

    //  - bigint(20)
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //  - bigint(20)
    private Long bookId;

    //  - bigint(20)
    private Long indexId;

    //  - int(5)
    private Integer indexNum;

    //  - mediumtext
    private String content;


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

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    public Integer getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(Integer indexNum) {
        this.indexNum = indexNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BookContent{" +
            "id=" + id +
            ", bookId=" + bookId +
            ", indexId=" + indexId +
            ", indexNum=" + indexNum +
            ", content=" + content +
        "}";
    }
}








