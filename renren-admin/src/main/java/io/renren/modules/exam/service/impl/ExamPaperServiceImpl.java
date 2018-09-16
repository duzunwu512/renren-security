package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamPaperDao;
import io.renren.modules.exam.entity.ExamPaperEntity;
import io.renren.modules.exam.service.ExamPaperService;


@Service("examPaperService")
public class ExamPaperServiceImpl extends ServiceImpl<ExamPaperDao, ExamPaperEntity> implements ExamPaperService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamPaperEntity> page = this.selectPage(
                new Query<ExamPaperEntity>(params).getPage(),
                new EntityWrapper<ExamPaperEntity>()
        );

        return new PageUtils(page);
    }

}
