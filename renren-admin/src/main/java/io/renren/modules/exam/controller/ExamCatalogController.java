package io.renren.modules.exam.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.exam.entity.ExamCatalogEntity;
import io.renren.modules.exam.service.ExamCatalogService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 考题类别
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/examcatalog")
public class ExamCatalogController {
    @Autowired
    private ExamCatalogService examCatalogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:examcatalog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examCatalogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:examcatalog:info")
    public R info(@PathVariable("id") Long id){
        ExamCatalogEntity examCatalog = examCatalogService.selectById(id);

        return R.ok().put("examCatalog", examCatalog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:examcatalog:save")
    public R save(@RequestBody ExamCatalogEntity examCatalog){
        examCatalogService.insert(examCatalog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:examcatalog:update")
    public R update(@RequestBody ExamCatalogEntity examCatalog){
        ValidatorUtils.validateEntity(examCatalog);
        examCatalogService.updateAllColumnById(examCatalog);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:examcatalog:delete")
    public R delete(@RequestBody Long[] ids){
        examCatalogService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
