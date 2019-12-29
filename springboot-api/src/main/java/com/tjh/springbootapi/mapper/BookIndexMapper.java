package com.tjh.springbootapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tjh.springbootapi.entity.BookIndex;
import com.tjh.springbootapi.view.response.BookIndexExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Mapper 接口
 * Generated on 2019-12-29
 */
@Mapper
public interface BookIndexMapper extends BaseMapper<BookIndex> {

    List<BookIndex> selectByExample(BookIndexExample example);

}
