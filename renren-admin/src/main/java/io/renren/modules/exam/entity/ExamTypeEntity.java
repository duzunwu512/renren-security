package io.renren.modules.exam.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 考题类型表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@TableName("exam_type")
public class ExamTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 试题类型名称
	 */
	private String name;
	/**
	 * 题型 作用不大 只是为了说明
	 */
	private Integer examType;
	/**
	 * 描述
	 */
	private String descr;
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
	 * 设置：试题类型名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：试题类型名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：题型 作用不大 只是为了说明
	 */
	public void setExamType(Integer examType) {
		this.examType = examType;
	}
	/**
	 * 获取：题型 作用不大 只是为了说明
	 */
	public Integer getExamType() {
		return examType;
	}
	/**
	 * 设置：描述
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
	/**
	 * 获取：描述
	 */
	public String getDescr() {
		return descr;
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
