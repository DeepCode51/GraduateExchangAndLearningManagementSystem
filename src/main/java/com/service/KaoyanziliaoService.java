package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoyanziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoyanziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoyanziliaoView;


/**
 * 考研资料
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface KaoyanziliaoService extends IService<KaoyanziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoyanziliaoVO> selectListVO(Wrapper<KaoyanziliaoEntity> wrapper);
   	
   	KaoyanziliaoVO selectVO(@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);
   	
   	List<KaoyanziliaoView> selectListView(Wrapper<KaoyanziliaoEntity> wrapper);
   	
   	KaoyanziliaoView selectView(@Param("ew") Wrapper<KaoyanziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoyanziliaoEntity> wrapper);
   	
}

