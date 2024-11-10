package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 简历投递
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:54:31
 */
@TableName("jianlitoudi")
public class JianlitoudiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianlitoudiEntity() {
		
	}
	
	public JianlitoudiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 昵称
	 */
					
	private String nicheng;
	
	/**
	 * 所在学校
	 */
					
	private String suozaixuexiao;
	
	/**
	 * 院系专业
	 */
					
	private String yuanxizhuanye;
	
	/**
	 * 简历信息
	 */
					
	private String jianlixinxi;
	
	/**
	 * 投递时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date toudishijian;
	
	/**
	 * 备注信息
	 */
					
	private String beizhuxinxi;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 招聘岗位
	 */
					
	private String zhaopingangwei;
	
	/**
	 * 招聘人数
	 */
					
	private String zhaopinrenshu;
	
	/**
	 * 公司封面
	 */
					
	private String gongsifengmian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：昵称
	 */
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
	/**
	 * 获取：昵称
	 */
	public String getNicheng() {
		return nicheng;
	}
	/**
	 * 设置：所在学校
	 */
	public void setSuozaixuexiao(String suozaixuexiao) {
		this.suozaixuexiao = suozaixuexiao;
	}
	/**
	 * 获取：所在学校
	 */
	public String getSuozaixuexiao() {
		return suozaixuexiao;
	}
	/**
	 * 设置：院系专业
	 */
	public void setYuanxizhuanye(String yuanxizhuanye) {
		this.yuanxizhuanye = yuanxizhuanye;
	}
	/**
	 * 获取：院系专业
	 */
	public String getYuanxizhuanye() {
		return yuanxizhuanye;
	}
	/**
	 * 设置：简历信息
	 */
	public void setJianlixinxi(String jianlixinxi) {
		this.jianlixinxi = jianlixinxi;
	}
	/**
	 * 获取：简历信息
	 */
	public String getJianlixinxi() {
		return jianlixinxi;
	}
	/**
	 * 设置：投递时间
	 */
	public void setToudishijian(Date toudishijian) {
		this.toudishijian = toudishijian;
	}
	/**
	 * 获取：投递时间
	 */
	public Date getToudishijian() {
		return toudishijian;
	}
	/**
	 * 设置：备注信息
	 */
	public void setBeizhuxinxi(String beizhuxinxi) {
		this.beizhuxinxi = beizhuxinxi;
	}
	/**
	 * 获取：备注信息
	 */
	public String getBeizhuxinxi() {
		return beizhuxinxi;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：招聘岗位
	 */
	public void setZhaopingangwei(String zhaopingangwei) {
		this.zhaopingangwei = zhaopingangwei;
	}
	/**
	 * 获取：招聘岗位
	 */
	public String getZhaopingangwei() {
		return zhaopingangwei;
	}
	/**
	 * 设置：招聘人数
	 */
	public void setZhaopinrenshu(String zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	/**
	 * 获取：招聘人数
	 */
	public String getZhaopinrenshu() {
		return zhaopinrenshu;
	}
	/**
	 * 设置：公司封面
	 */
	public void setGongsifengmian(String gongsifengmian) {
		this.gongsifengmian = gongsifengmian;
	}
	/**
	 * 获取：公司封面
	 */
	public String getGongsifengmian() {
		return gongsifengmian;
	}

}
