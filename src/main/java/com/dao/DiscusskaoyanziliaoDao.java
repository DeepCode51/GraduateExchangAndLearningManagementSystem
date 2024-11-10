package com.dao;

import com.entity.DiscusskaoyanziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskaoyanziliaoVO;
import com.entity.view.DiscusskaoyanziliaoView;


/**
 * 考研资料评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface DiscusskaoyanziliaoDao extends BaseMapper<DiscusskaoyanziliaoEntity> {
	
	List<DiscusskaoyanziliaoVO> selectListVO(@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);
	
	DiscusskaoyanziliaoVO selectVO(@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);
	
	List<DiscusskaoyanziliaoView> selectListView(@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);

	List<DiscusskaoyanziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);
	
	DiscusskaoyanziliaoView selectView(@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);
	
}
