package io.renren.modules.exam.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.exam.entity.ExamItemLogEntity;

import java.util.Map;

/**
 * 纠错日志表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:10
 */
public interface ExamItemLogService extends IService<ExamItemLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

