package io.renren.modules.exam.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 试卷名称
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@TableName("exam_paper")
public class ExamPaperEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 区域ID
	 */
	private Long areaId;
	/**
	 * 种类ID
	 */
	private Long catalogId;
	/**
	 * 试卷名称
	 */
	private String name;
	/**
	 * 时长
	 */
	private Integer duration;
	/**
	 * 分值
	 */
	private Integer score;
	/**
	 * 考试类型，0开卷 1闭卷
	 */
	private Integer closed;
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
	 * 设置：区域ID
	 */
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：区域ID
	 */
	public Long getAreaId() {
		return areaId;
	}
	/**
	 * 设置：种类ID
	 */
	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}
	/**
	 * 获取：种类ID
	 */
	public Long getCatalogId() {
		return catalogId;
	}
	/**
	 * 设置：试卷名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：试卷名称
	 */
	public String getName() {
		return name;
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
	 * 设置：分值
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
	/**
	 * 获取：分值
	 */
	public Integer getScore() {
		return score;
	}
	/**
	 * 设置：考试类型，0开卷 1闭卷
	 */
	public void setClosed(Integer closed) {
		this.closed = closed;
	}
	/**
	 * 获取：考试类型，0开卷 1闭卷
	 */
	public Integer getClosed() {
		return closed;
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
