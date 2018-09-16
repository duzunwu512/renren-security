package io.renren.modules.exam.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 考题表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@TableName("exam_item")
public class ExamItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 种类ID
	 */
	private Long catalogId;
	/**
	 * 区域ID
	 */
	private Long areaId;
	/**
	 * 试券ID
	 */
	private Long paperId;
	/**
	 * 类型ID
	 */
	private Long typeId;
	/**
	 * 考题类型 ，枚举，选择题，填写...
	 */
	private Integer questionType;
	/**
	 * 分值
	 */
	private Integer score;
	/**
	 * 内容，此内容为后台管理添加
	 */
	private String question;
	/**
	 * 内容，此内容为后台管理添加
	 */
	private String selections;
	/**
	 * 内容，此内容为后台管理添加
	 */
	private String answer;
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
	 * 设置：试券ID
	 */
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	/**
	 * 获取：试券ID
	 */
	public Long getPaperId() {
		return paperId;
	}
	/**
	 * 设置：类型ID
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：类型ID
	 */
	public Long getTypeId() {
		return typeId;
	}
	/**
	 * 设置：考题类型 ，枚举，选择题，填写...
	 */
	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}
	/**
	 * 获取：考题类型 ，枚举，选择题，填写...
	 */
	public Integer getQuestionType() {
		return questionType;
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
	 * 设置：内容，此内容为后台管理添加
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * 获取：内容，此内容为后台管理添加
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * 设置：内容，此内容为后台管理添加
	 */
	public void setSelections(String selections) {
		this.selections = selections;
	}
	/**
	 * 获取：内容，此内容为后台管理添加
	 */
	public String getSelections() {
		return selections;
	}
	/**
	 * 设置：内容，此内容为后台管理添加
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * 获取：内容，此内容为后台管理添加
	 */
	public String getAnswer() {
		return answer;
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
