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
 * 笔记分享
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-02 22:11:50
 */
@TableName("bijifenxiang")
public class BijifenxiangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BijifenxiangEntity() {
		
	}
	
	public BijifenxiangEntity(T t) {
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
	 * 笔记名称
	 */
					
	private String bijimingcheng;
	
	/**
	 * 笔记类型
	 */
					
	private String bijileixing;
	
	/**
	 * 笔记标题
	 */
					
	private String bijibiaoti;
	
	/**
	 * 笔记图片
	 */
					
	private String bijitupian;
	
	/**
	 * 笔记附件
	 */
					
	private String bijifujian;
	
	/**
	 * 笔记内容
	 */
					
	private String bijineirong;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：笔记名称
	 */
	public void setBijimingcheng(String bijimingcheng) {
		this.bijimingcheng = bijimingcheng;
	}
	/**
	 * 获取：笔记名称
	 */
	public String getBijimingcheng() {
		return bijimingcheng;
	}
	/**
	 * 设置：笔记类型
	 */
	public void setBijileixing(String bijileixing) {
		this.bijileixing = bijileixing;
	}
	/**
	 * 获取：笔记类型
	 */
	public String getBijileixing() {
		return bijileixing;
	}
	/**
	 * 设置：笔记标题
	 */
	public void setBijibiaoti(String bijibiaoti) {
		this.bijibiaoti = bijibiaoti;
	}
	/**
	 * 获取：笔记标题
	 */
	public String getBijibiaoti() {
		return bijibiaoti;
	}
	/**
	 * 设置：笔记图片
	 */
	public void setBijitupian(String bijitupian) {
		this.bijitupian = bijitupian;
	}
	/**
	 * 获取：笔记图片
	 */
	public String getBijitupian() {
		return bijitupian;
	}
	/**
	 * 设置：笔记附件
	 */
	public void setBijifujian(String bijifujian) {
		this.bijifujian = bijifujian;
	}
	/**
	 * 获取：笔记附件
	 */
	public String getBijifujian() {
		return bijifujian;
	}
	/**
	 * 设置：笔记内容
	 */
	public void setBijineirong(String bijineirong) {
		this.bijineirong = bijineirong;
	}
	/**
	 * 获取：笔记内容
	 */
	public String getBijineirong() {
		return bijineirong;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
