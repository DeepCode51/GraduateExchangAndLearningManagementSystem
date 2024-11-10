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


import com.dao.KaoyanziliaoDao;
import com.entity.KaoyanziliaoEntity;
import com.service.KaoyanziliaoService;
import com.entity.vo.KaoyanziliaoVO;
import com.entity.view.KaoyanziliaoView;

@Service("kaoyanziliaoService")
public class KaoyanziliaoServiceImpl extends ServiceImpl<KaoyanziliaoDao, KaoyanziliaoEntity> implements KaoyanziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyanziliaoEntity> page = this.selectPage(
                new Query<KaoyanziliaoEntity>(params).getPage(),
                new EntityWrapper<KaoyanziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyanziliaoEntity> wrapper) {
		  Page<KaoyanziliaoView> page =new Query<KaoyanziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyanziliaoVO> selectListVO(Wrapper<KaoyanziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyanziliaoVO selectVO(Wrapper<KaoyanziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyanziliaoView> selectListView(Wrapper<KaoyanziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyanziliaoView selectView(Wrapper<KaoyanziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
