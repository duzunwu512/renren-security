package io.renren.modules.exam.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 解题分析表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@TableName("exam_item_analysis")
public class ExamItemAnalysisEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 题类名称
	 */
	private Long itemId;
	/**
	 * 分析人
	 */
	private Long userId;
	/**
	 * 分析
	 */
	private String analysis;
	/**
	 * 是否删除  1：已删除  0：正常
	 */
	private Integer del;
	/**
	 * 
	 */
	private Long dcreateBy;
	/**
	 * 
	 */
	private Date dcreateDate;
	/**
	 * 
	 */
	private Long dupdateBy;
	/**
	 * 
	 */
	private Date updateDate;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：题类名称
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：题类名称
	 */
	public Long getItemId() {
		return itemId;
	}
	/**
	 * 设置：分析人
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：分析人
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：分析
	 */
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	/**
	 * 获取：分析
	 */
	public String getAnalysis() {
		return analysis;
	}
	/**
	 * 设置：是否删除  1：已删除  0：正常
	 */
	public void setDel(Integer del) {
		this.del = del;
	}
	/**
	 * 获取：是否删除  1：已删除  0：正常
	 */
	public Integer getDel() {
		return del;
	}
	/**
	 * 设置：
	 */
	public void setDcreateBy(Long dcreateBy) {
		this.dcreateBy = dcreateBy;
	}
	/**
	 * 获取：
	 */
	public Long getDcreateBy() {
		return dcreateBy;
	}
	/**
	 * 设置：
	 */
	public void setDcreateDate(Date dcreateDate) {
		this.dcreateDate = dcreateDate;
	}
	/**
	 * 获取：
	 */
	public Date getDcreateDate() {
		return dcreateDate;
	}
	/**
	 * 设置：
	 */
	public void setDupdateBy(Long dupdateBy) {
		this.dupdateBy = dupdateBy;
	}
	/**
	 * 获取：
	 */
	public Long getDupdateBy() {
		return dupdateBy;
	}
	/**
	 * 设置：
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
}
