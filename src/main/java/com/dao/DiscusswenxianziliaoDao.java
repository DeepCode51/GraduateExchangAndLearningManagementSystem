package com.dao;

import com.entity.DiscusswenxianziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenxianziliaoVO;
import com.entity.view.DiscusswenxianziliaoView;


/**
 * 文献资料评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface DiscusswenxianziliaoDao extends BaseMapper<DiscusswenxianziliaoEntity> {
	
	List<DiscusswenxianziliaoVO> selectListVO(@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);
	
	DiscusswenxianziliaoVO selectVO(@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);
	
	List<DiscusswenxianziliaoView> selectListView(@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);

	List<DiscusswenxianziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);
	
	DiscusswenxianziliaoView selectView(@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);
	
}
