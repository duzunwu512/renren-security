package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamItemDao;
import io.renren.modules.exam.entity.ExamItemEntity;
import io.renren.modules.exam.service.ExamItemService;


@Service("examItemService")
public class ExamItemServiceImpl extends ServiceImpl<ExamItemDao, ExamItemEntity> implements ExamItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamItemEntity> page = this.selectPage(
                new Query<ExamItemEntity>(params).getPage(),
                new EntityWrapper<ExamItemEntity>()
        );

        return new PageUtils(page);
    }

}
