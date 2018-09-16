package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamAreaDao;
import io.renren.modules.exam.entity.ExamAreaEntity;
import io.renren.modules.exam.service.ExamAreaService;


@Service("examAreaService")
public class ExamAreaServiceImpl extends ServiceImpl<ExamAreaDao, ExamAreaEntity> implements ExamAreaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamAreaEntity> page = this.selectPage(
                new Query<ExamAreaEntity>(params).getPage(),
                new EntityWrapper<ExamAreaEntity>()
        );

        return new PageUtils(page);
    }

}
