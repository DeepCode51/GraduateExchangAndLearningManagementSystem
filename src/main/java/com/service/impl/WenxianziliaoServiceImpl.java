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


import com.dao.WenxianziliaoDao;
import com.entity.WenxianziliaoEntity;
import com.service.WenxianziliaoService;
import com.entity.vo.WenxianziliaoVO;
import com.entity.view.WenxianziliaoView;

@Service("wenxianziliaoService")
public class WenxianziliaoServiceImpl extends ServiceImpl<WenxianziliaoDao, WenxianziliaoEntity> implements WenxianziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenxianziliaoEntity> page = this.selectPage(
                new Query<WenxianziliaoEntity>(params).getPage(),
                new EntityWrapper<WenxianziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenxianziliaoEntity> wrapper) {
		  Page<WenxianziliaoView> page =new Query<WenxianziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenxianziliaoVO> selectListVO(Wrapper<WenxianziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenxianziliaoVO selectVO(Wrapper<WenxianziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenxianziliaoView> selectListView(Wrapper<WenxianziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenxianziliaoView selectView(Wrapper<WenxianziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
