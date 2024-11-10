package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskaoyanziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskaoyanziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskaoyanziliaoView;


/**
 * 考研资料评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface DiscusskaoyanziliaoService extends IService<DiscusskaoyanziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskaoyanziliaoVO> selectListVO(Wrapper<DiscusskaoyanziliaoEntity> wrapper);
   	
   	DiscusskaoyanziliaoVO selectVO(@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);
   	
   	List<DiscusskaoyanziliaoView> selectListView(Wrapper<DiscusskaoyanziliaoEntity> wrapper);
   	
   	DiscusskaoyanziliaoView selectView(@Param("ew") Wrapper<DiscusskaoyanziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskaoyanziliaoEntity> wrapper);
   	
}

