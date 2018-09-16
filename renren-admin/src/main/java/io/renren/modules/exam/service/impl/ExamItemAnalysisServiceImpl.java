package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamItemAnalysisDao;
import io.renren.modules.exam.entity.ExamItemAnalysisEntity;
import io.renren.modules.exam.service.ExamItemAnalysisService;


@Service("examItemAnalysisService")
public class ExamItemAnalysisServiceImpl extends ServiceImpl<ExamItemAnalysisDao, ExamItemAnalysisEntity> implements ExamItemAnalysisService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamItemAnalysisEntity> page = this.selectPage(
                new Query<ExamItemAnalysisEntity>(params).getPage(),
                new EntityWrapper<ExamItemAnalysisEntity>()
        );

        return new PageUtils(page);
    }

}
