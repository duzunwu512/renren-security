package io.renren.modules.exam.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.exam.entity.ExamPaperRelationEntity;

import java.util.Map;

/**
 * 试卷类型关系表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
public interface ExamPaperRelationService extends IService<ExamPaperRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

