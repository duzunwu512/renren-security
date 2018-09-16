package io.renren.modules.exam.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.exam.entity.ExamPaperEntity;

import java.util.Map;

/**
 * 试卷名称
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
public interface ExamPaperService extends IService<ExamPaperEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

