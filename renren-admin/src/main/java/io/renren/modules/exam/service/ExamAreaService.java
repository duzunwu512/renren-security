package io.renren.modules.exam.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.exam.entity.ExamAreaEntity;

import java.util.Map;

/**
 * 考题地区
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
public interface ExamAreaService extends IService<ExamAreaEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

