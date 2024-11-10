package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KaogongziliaoDao;
import com.entity.KaogongziliaoEntity;
import com.service.KaogongziliaoService;
import com.entity.vo.KaogongziliaoVO;
import com.entity.view.KaogongziliaoView;

@Service("kaogongziliaoService")
public class KaogongziliaoServiceImpl extends ServiceImpl<KaogongziliaoDao, KaogongziliaoEntity> implements KaogongziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaogongziliaoEntity> page = this.selectPage(
                new Query<KaogongziliaoEntity>(params).getPage(),
                new EntityWrapper<KaogongziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaogongziliaoEntity> wrapper) {
		  Page<KaogongziliaoView> page =new Query<KaogongziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaogongziliaoVO> selectListVO(Wrapper<KaogongziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaogongziliaoVO selectVO(Wrapper<KaogongziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaogongziliaoView> selectListView(Wrapper<KaogongziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaogongziliaoView selectView(Wrapper<KaogongziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
