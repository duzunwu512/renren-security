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

import io.renren.modules.exam.entity.ExamPaperRelationEntity;
import io.renren.modules.exam.service.ExamPaperRelationService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 试卷类型关系表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/exampaperrelation")
public class ExamPaperRelationController {
    @Autowired
    private ExamPaperRelationService examPaperRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:exampaperrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examPaperRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:exampaperrelation:info")
    public R info(@PathVariable("id") Long id){
        ExamPaperRelationEntity examPaperRelation = examPaperRelationService.selectById(id);

        return R.ok().put("examPaperRelation", examPaperRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:exampaperrelation:save")
    public R save(@RequestBody ExamPaperRelationEntity examPaperRelation){
        examPaperRelationService.insert(examPaperRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:exampaperrelation:update")
    public R update(@RequestBody ExamPaperRelationEntity examPaperRelation){
        ValidatorUtils.validateEntity(examPaperRelation);
        examPaperRelationService.updateAllColumnById(examPaperRelation);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:exampaperrelation:delete")
    public R delete(@RequestBody Long[] ids){
        examPaperRelationService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
