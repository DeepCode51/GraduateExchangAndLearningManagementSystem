package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenxianziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenxianziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenxianziliaoView;


/**
 * 文献资料评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface DiscusswenxianziliaoService extends IService<DiscusswenxianziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenxianziliaoVO> selectListVO(Wrapper<DiscusswenxianziliaoEntity> wrapper);
   	
   	DiscusswenxianziliaoVO selectVO(@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);
   	
   	List<DiscusswenxianziliaoView> selectListView(Wrapper<DiscusswenxianziliaoEntity> wrapper);
   	
   	DiscusswenxianziliaoView selectView(@Param("ew") Wrapper<DiscusswenxianziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenxianziliaoEntity> wrapper);
   	
}

