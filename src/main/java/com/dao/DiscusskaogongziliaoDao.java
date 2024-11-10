package com.dao;

import com.entity.DiscusskaogongziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskaogongziliaoVO;
import com.entity.view.DiscusskaogongziliaoView;


/**
 * 考公资料评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:32
 */
public interface DiscusskaogongziliaoDao extends BaseMapper<DiscusskaogongziliaoEntity> {
	
	List<DiscusskaogongziliaoVO> selectListVO(@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);
	
	DiscusskaogongziliaoVO selectVO(@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);
	
	List<DiscusskaogongziliaoView> selectListView(@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);

	List<DiscusskaogongziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);
	
	DiscusskaogongziliaoView selectView(@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);
	
}
