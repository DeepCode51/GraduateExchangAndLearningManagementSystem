package com.entity.view;

import com.entity.KaogongziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考公资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
@TableName("kaogongziliao")
public class KaogongziliaoView  extends KaogongziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaogongziliaoView(){
	}
 
 	public KaogongziliaoView(KaogongziliaoEntity kaogongziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, kaogongziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
