package io.renren.modules.exam.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.exam.entity.ExamItemAnalysisEntity;

import java.util.Map;

/**
 * 解题分析表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
public interface ExamItemAnalysisService extends IService<ExamItemAnalysisEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

