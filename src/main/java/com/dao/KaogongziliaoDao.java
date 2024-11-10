package com.dao;

import com.entity.KaogongziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaogongziliaoVO;
import com.entity.view.KaogongziliaoView;


/**
 * 考公资料
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface KaogongziliaoDao extends BaseMapper<KaogongziliaoEntity> {
	
	List<KaogongziliaoVO> selectListVO(@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);
	
	KaogongziliaoVO selectVO(@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);
	
	List<KaogongziliaoView> selectListView(@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);

	List<KaogongziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);
	
	KaogongziliaoView selectView(@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);
	
}
