package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaogongziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaogongziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaogongziliaoView;


/**
 * 考公资料
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
public interface KaogongziliaoService extends IService<KaogongziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaogongziliaoVO> selectListVO(Wrapper<KaogongziliaoEntity> wrapper);
   	
   	KaogongziliaoVO selectVO(@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);
   	
   	List<KaogongziliaoView> selectListView(Wrapper<KaogongziliaoEntity> wrapper);
   	
   	KaogongziliaoView selectView(@Param("ew") Wrapper<KaogongziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaogongziliaoEntity> wrapper);
   	
}

