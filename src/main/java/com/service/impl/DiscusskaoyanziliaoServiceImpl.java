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


import com.dao.DiscusskaoyanziliaoDao;
import com.entity.DiscusskaoyanziliaoEntity;
import com.service.DiscusskaoyanziliaoService;
import com.entity.vo.DiscusskaoyanziliaoVO;
import com.entity.view.DiscusskaoyanziliaoView;

@Service("discusskaoyanziliaoService")
public class DiscusskaoyanziliaoServiceImpl extends ServiceImpl<DiscusskaoyanziliaoDao, DiscusskaoyanziliaoEntity> implements DiscusskaoyanziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskaoyanziliaoEntity> page = this.selectPage(
                new Query<DiscusskaoyanziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscusskaoyanziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskaoyanziliaoEntity> wrapper) {
		  Page<DiscusskaoyanziliaoView> page =new Query<DiscusskaoyanziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskaoyanziliaoVO> selectListVO(Wrapper<DiscusskaoyanziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskaoyanziliaoVO selectVO(Wrapper<DiscusskaoyanziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskaoyanziliaoView> selectListView(Wrapper<DiscusskaoyanziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskaoyanziliaoView selectView(Wrapper<DiscusskaoyanziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
