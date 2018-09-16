package io.renren.modules.exam.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 试卷类型关系表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@TableName("exam_paper_relation")
public class ExamPaperRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 试卷ID
	 */
	private Long paperId;
	/**
	 * 试题ID
	 */
	private Long typeId;
	/**
	 * 分值
	 */
	private Integer scroe;
	/**
	 * 时长
	 */
	private Integer duration;
	/**
	 * 说明
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
	 * 设置：试卷ID
	 */
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	/**
	 * 获取：试卷ID
	 */
	public Long getPaperId() {
		return paperId;
	}
	/**
	 * 设置：试题ID
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：试题ID
	 */
	public Long getTypeId() {
		return typeId;
	}
	/**
	 * 设置：分值
	 */
	public void setScroe(Integer scroe) {
		this.scroe = scroe;
	}
	/**
	 * 获取：分值
	 */
	public Integer getScroe() {
		return scroe;
	}
	/**
	 * 设置：时长
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	/**
	 * 获取：时长
	 */
	public Integer getDuration() {
		return duration;
	}
	/**
	 * 设置：说明
	 */
	public void setDescr(String descr) {
		this.descr = descr;
	}
	/**
	 * 获取：说明
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
