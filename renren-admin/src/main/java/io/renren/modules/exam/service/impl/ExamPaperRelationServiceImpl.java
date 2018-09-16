package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamPaperRelationDao;
import io.renren.modules.exam.entity.ExamPaperRelationEntity;
import io.renren.modules.exam.service.ExamPaperRelationService;


@Service("examPaperRelationService")
public class ExamPaperRelationServiceImpl extends ServiceImpl<ExamPaperRelationDao, ExamPaperRelationEntity> implements ExamPaperRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamPaperRelationEntity> page = this.selectPage(
                new Query<ExamPaperRelationEntity>(params).getPage(),
                new EntityWrapper<ExamPaperRelationEntity>()
        );

        return new PageUtils(page);
    }

}
