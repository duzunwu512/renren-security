package io.renren.modules.exam.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.exam.dao.ExamCatalogDao;
import io.renren.modules.exam.entity.ExamCatalogEntity;
import io.renren.modules.exam.service.ExamCatalogService;


@Service("examCatalogService")
public class ExamCatalogServiceImpl extends ServiceImpl<ExamCatalogDao, ExamCatalogEntity> implements ExamCatalogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ExamCatalogEntity> page = this.selectPage(
                new Query<ExamCatalogEntity>(params).getPage(),
                new EntityWrapper<ExamCatalogEntity>()
        );

        return new PageUtils(page);
    }

}
