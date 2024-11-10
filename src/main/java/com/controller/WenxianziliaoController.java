package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WenxianziliaoEntity;
import com.entity.view.WenxianziliaoView;

import com.service.WenxianziliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 文献资料
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
@RestController
@RequestMapping("/wenxianziliao")
public class WenxianziliaoController {
    @Autowired
    private WenxianziliaoService wenxianziliaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenxianziliaoEntity wenxianziliao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianend,
		HttpServletRequest request){

        EntityWrapper<WenxianziliaoEntity> ew = new EntityWrapper<WenxianziliaoEntity>();
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = wenxianziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenxianziliao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenxianziliaoEntity wenxianziliao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<WenxianziliaoEntity> ew = new EntityWrapper<WenxianziliaoEntity>();
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);
		PageUtils page = wenxianziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenxianziliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenxianziliaoEntity wenxianziliao){
       	EntityWrapper<WenxianziliaoEntity> ew = new EntityWrapper<WenxianziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenxianziliao, "wenxianziliao")); 
        return R.ok().put("data", wenxianziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenxianziliaoEntity wenxianziliao){
        EntityWrapper< WenxianziliaoEntity> ew = new EntityWrapper< WenxianziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenxianziliao, "wenxianziliao")); 
		WenxianziliaoView wenxianziliaoView =  wenxianziliaoService.selectView(ew);
		return R.ok("查询文献资料成功").put("data", wenxianziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenxianziliaoEntity wenxianziliao = wenxianziliaoService.selectById(id);
		wenxianziliao.setClicknum(wenxianziliao.getClicknum()+1);
		wenxianziliao.setClicktime(new Date());
		wenxianziliaoService.updateById(wenxianziliao);
        return R.ok().put("data", wenxianziliao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenxianziliaoEntity wenxianziliao = wenxianziliaoService.selectById(id);
		wenxianziliao.setClicknum(wenxianziliao.getClicknum()+1);
		wenxianziliao.setClicktime(new Date());
		wenxianziliaoService.updateById(wenxianziliao);
        return R.ok().put("data", wenxianziliao);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        WenxianziliaoEntity wenxianziliao = wenxianziliaoService.selectById(id);
        if(type.equals("1")) {
        	wenxianziliao.setThumbsupnum(wenxianziliao.getThumbsupnum()+1);
        } else {
        	wenxianziliao.setCrazilynum(wenxianziliao.getCrazilynum()+1);
        }
        wenxianziliaoService.updateById(wenxianziliao);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenxianziliaoEntity wenxianziliao, HttpServletRequest request){
    	wenxianziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenxianziliao);

        wenxianziliaoService.insert(wenxianziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenxianziliaoEntity wenxianziliao, HttpServletRequest request){
    	wenxianziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenxianziliao);

        wenxianziliaoService.insert(wenxianziliao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WenxianziliaoEntity wenxianziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenxianziliao);
        wenxianziliaoService.updateById(wenxianziliao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenxianziliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WenxianziliaoEntity> wrapper = new EntityWrapper<WenxianziliaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wenxianziliaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,WenxianziliaoEntity wenxianziliao, HttpServletRequest request,String pre){
        EntityWrapper<WenxianziliaoEntity> ew = new EntityWrapper<WenxianziliaoEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = wenxianziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenxianziliao), params), params));
        return R.ok().put("data", page);
    }


}
