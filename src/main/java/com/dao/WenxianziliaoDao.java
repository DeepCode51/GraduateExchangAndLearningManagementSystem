package com.dao;

import com.entity.WenxianziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenxianziliaoVO;
import com.entity.view.WenxianziliaoView;


/**
 * 文献资料
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface WenxianziliaoDao extends BaseMapper<WenxianziliaoEntity> {
	
	List<WenxianziliaoVO> selectListVO(@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);
	
	WenxianziliaoVO selectVO(@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);
	
	List<WenxianziliaoView> selectListView(@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);

	List<WenxianziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);
	
	WenxianziliaoView selectView(@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);
	
}
