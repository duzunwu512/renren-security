package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamTypeDao;
import io.renren.modules.exam.entity.ExamTypeEntity;
import io.renren.modules.exam.service.ExamTypeService;


@Service("examTypeService")
public class ExamTypeServiceImpl extends ServiceImpl<ExamTypeDao, ExamTypeEntity> implements ExamTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamTypeEntity> page = this.selectPage(
                new Query<ExamTypeEntity>(params).getPage(),
                new EntityWrapper<ExamTypeEntity>()
        );

        return new PageUtils(page);
    }

}
