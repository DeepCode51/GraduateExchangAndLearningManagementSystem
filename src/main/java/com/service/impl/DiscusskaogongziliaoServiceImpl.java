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


import com.dao.DiscusskaogongziliaoDao;
import com.entity.DiscusskaogongziliaoEntity;
import com.service.DiscusskaogongziliaoService;
import com.entity.vo.DiscusskaogongziliaoVO;
import com.entity.view.DiscusskaogongziliaoView;

@Service("discusskaogongziliaoService")
public class DiscusskaogongziliaoServiceImpl extends ServiceImpl<DiscusskaogongziliaoDao, DiscusskaogongziliaoEntity> implements DiscusskaogongziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskaogongziliaoEntity> page = this.selectPage(
                new Query<DiscusskaogongziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscusskaogongziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskaogongziliaoEntity> wrapper) {
		  Page<DiscusskaogongziliaoView> page =new Query<DiscusskaogongziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskaogongziliaoVO> selectListVO(Wrapper<DiscusskaogongziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskaogongziliaoVO selectVO(Wrapper<DiscusskaogongziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskaogongziliaoView> selectListView(Wrapper<DiscusskaogongziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskaogongziliaoView selectView(Wrapper<DiscusskaogongziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
