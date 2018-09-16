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

import io.renren.modules.exam.entity.ExamPaperEntity;
import io.renren.modules.exam.service.ExamPaperService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 试卷名称
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/exampaper")
public class ExamPaperController {
    @Autowired
    private ExamPaperService examPaperService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:exampaper:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examPaperService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:exampaper:info")
    public R info(@PathVariable("id") Long id){
        ExamPaperEntity examPaper = examPaperService.selectById(id);

        return R.ok().put("examPaper", examPaper);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:exampaper:save")
    public R save(@RequestBody ExamPaperEntity examPaper){
        examPaperService.insert(examPaper);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:exampaper:update")
    public R update(@RequestBody ExamPaperEntity examPaper){
        ValidatorUtils.validateEntity(examPaper);
        examPaperService.updateAllColumnById(examPaper);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:exampaper:delete")
    public R delete(@RequestBody Long[] ids){
        examPaperService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
