package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamItemLogDao;
import io.renren.modules.exam.entity.ExamItemLogEntity;
import io.renren.modules.exam.service.ExamItemLogService;


@Service("examItemLogService")
public class ExamItemLogServiceImpl extends ServiceImpl<ExamItemLogDao, ExamItemLogEntity> implements ExamItemLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamItemLogEntity> page = this.selectPage(
                new Query<ExamItemLogEntity>(params).getPage(),
                new EntityWrapper<ExamItemLogEntity>()
        );

        return new PageUtils(page);
    }

}
