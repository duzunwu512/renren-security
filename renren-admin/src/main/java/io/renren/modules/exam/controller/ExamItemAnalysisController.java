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

import io.renren.modules.exam.entity.ExamItemAnalysisEntity;
import io.renren.modules.exam.service.ExamItemAnalysisService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 解题分析表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/examitemanalysis")
public class ExamItemAnalysisController {
    @Autowired
    private ExamItemAnalysisService examItemAnalysisService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:examitemanalysis:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examItemAnalysisService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:examitemanalysis:info")
    public R info(@PathVariable("id") Long id){
        ExamItemAnalysisEntity examItemAnalysis = examItemAnalysisService.selectById(id);

        return R.ok().put("examItemAnalysis", examItemAnalysis);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:examitemanalysis:save")
    public R save(@RequestBody ExamItemAnalysisEntity examItemAnalysis){
        examItemAnalysisService.insert(examItemAnalysis);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:examitemanalysis:update")
    public R update(@RequestBody ExamItemAnalysisEntity examItemAnalysis){
        ValidatorUtils.validateEntity(examItemAnalysis);
        examItemAnalysisService.updateAllColumnById(examItemAnalysis);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:examitemanalysis:delete")
    public R delete(@RequestBody Long[] ids){
        examItemAnalysisService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
