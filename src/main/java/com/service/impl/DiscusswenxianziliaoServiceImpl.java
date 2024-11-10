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


import com.dao.DiscusswenxianziliaoDao;
import com.entity.DiscusswenxianziliaoEntity;
import com.service.DiscusswenxianziliaoService;
import com.entity.vo.DiscusswenxianziliaoVO;
import com.entity.view.DiscusswenxianziliaoView;

@Service("discusswenxianziliaoService")
public class DiscusswenxianziliaoServiceImpl extends ServiceImpl<DiscusswenxianziliaoDao, DiscusswenxianziliaoEntity> implements DiscusswenxianziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenxianziliaoEntity> page = this.selectPage(
                new Query<DiscusswenxianziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscusswenxianziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenxianziliaoEntity> wrapper) {
		  Page<DiscusswenxianziliaoView> page =new Query<DiscusswenxianziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenxianziliaoVO> selectListVO(Wrapper<DiscusswenxianziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenxianziliaoVO selectVO(Wrapper<DiscusswenxianziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenxianziliaoView> selectListView(Wrapper<DiscusswenxianziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenxianziliaoView selectView(Wrapper<DiscusswenxianziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
