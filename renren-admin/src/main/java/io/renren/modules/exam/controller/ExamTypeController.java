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

import io.renren.modules.exam.entity.ExamTypeEntity;
import io.renren.modules.exam.service.ExamTypeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 考题类型表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/examtype")
public class ExamTypeController {
    @Autowired
    private ExamTypeService examTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:examtype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:examtype:info")
    public R info(@PathVariable("id") Long id){
        ExamTypeEntity examType = examTypeService.selectById(id);

        return R.ok().put("examType", examType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:examtype:save")
    public R save(@RequestBody ExamTypeEntity examType){
        examTypeService.insert(examType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:examtype:update")
    public R update(@RequestBody ExamTypeEntity examType){
        ValidatorUtils.validateEntity(examType);
        examTypeService.updateAllColumnById(examType);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:examtype:delete")
    public R delete(@RequestBody Long[] ids){
        examTypeService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
