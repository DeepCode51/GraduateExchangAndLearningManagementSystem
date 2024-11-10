package com.dao;

import com.entity.KaoyanziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyanziliaoVO;
import com.entity.view.KaoyanziliaoView;


/**
 * 考研资料
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface KaoyanziliaoDao extends BaseMapper<KaoyanziliaoEntity> {
	
	List<KaoyanziliaoVO> selectListVO(@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);
	
	KaoyanziliaoVO selectVO(@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);
	
	List<KaoyanziliaoView> selectListView(@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);

	List<KaoyanziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);
	
	KaoyanziliaoView selectView(@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);
	
}
