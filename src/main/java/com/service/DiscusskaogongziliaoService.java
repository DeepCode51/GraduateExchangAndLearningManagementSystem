package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskaogongziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskaogongziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskaogongziliaoView;


/**
 * 考公资料评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:54:32
 */
public interface DiscusskaogongziliaoService extends IService<DiscusskaogongziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskaogongziliaoVO> selectListVO(Wrapper<DiscusskaogongziliaoEntity> wrapper);
   	
   	DiscusskaogongziliaoVO selectVO(@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);
   	
   	List<DiscusskaogongziliaoView> selectListView(Wrapper<DiscusskaogongziliaoEntity> wrapper);
   	
   	DiscusskaogongziliaoView selectView(@Param("ew") Wrapper<DiscusskaogongziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskaogongziliaoEntity> wrapper);
   	
}

