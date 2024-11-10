package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenxianziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenxianziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenxianziliaoView;


/**
 * 文献资料
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface WenxianziliaoService extends IService<WenxianziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenxianziliaoVO> selectListVO(Wrapper<WenxianziliaoEntity> wrapper);
   	
   	WenxianziliaoVO selectVO(@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);
   	
   	List<WenxianziliaoView> selectListView(Wrapper<WenxianziliaoEntity> wrapper);
   	
   	WenxianziliaoView selectView(@Param("ew") Wrapper<WenxianziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenxianziliaoEntity> wrapper);
   	
}

