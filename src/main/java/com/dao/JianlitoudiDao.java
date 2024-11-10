package com.dao;

import com.entity.JianlitoudiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianlitoudiVO;
import com.entity.view.JianlitoudiView;


/**
 * 简历投递
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface JianlitoudiDao extends BaseMapper<JianlitoudiEntity> {
	
	List<JianlitoudiVO> selectListVO(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
	JianlitoudiVO selectVO(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
	List<JianlitoudiView> selectListView(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);

	List<JianlitoudiView> selectListView(Pagination page,@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
	JianlitoudiView selectView(@Param("ew") Wrapper<JianlitoudiEntity> wrapper);
	
}
