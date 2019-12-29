package com.tjh.springbootapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * Generated on 2019-12-29
 * 
 */
public class Book implements Serializable {

    //  - bigint(20)
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //  - int(10)
    @TableField("catId")
    private Integer catId;

    //  - varchar(200)
    private String picUrl;

    //  - varchar(50)
    private String bookName;

    //  - varchar(50)
    private String author;

    //  - varchar(2000)
    private String bookDesc;

    //  - float
    private Float score;

    //  - varchar(10)
    private String bookStatus;

    //  - bigint(20)
    private Long visitCount;

    //  - datetime
    private LocalDateTime updateTime;

    //  - int(10)
    private Integer softCat;

    //  - varchar(255)
    private String softTag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Long visitCount) {
        this.visitCount = visitCount;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSoftCat() {
        return softCat;
    }

    public void setSoftCat(Integer softCat) {
        this.softCat = softCat;
    }

    public String getSoftTag() {
        return softTag;
    }

    public void setSoftTag(String softTag) {
        this.softTag = softTag;
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + id +
            ", catId=" + catId +
            ", picUrl=" + picUrl +
            ", bookName=" + bookName +
            ", author=" + author +
            ", bookDesc=" + bookDesc +
            ", score=" + score +
            ", bookStatus=" + bookStatus +
            ", visitCount=" + visitCount +
            ", updateTime=" + updateTime +
            ", softCat=" + softCat +
            ", softTag=" + softTag +
        "}";
    }
}








