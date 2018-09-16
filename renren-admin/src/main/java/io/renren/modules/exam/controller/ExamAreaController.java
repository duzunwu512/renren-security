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

import io.renren.modules.exam.entity.ExamAreaEntity;
import io.renren.modules.exam.service.ExamAreaService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 考题地区
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/examarea")
public class ExamAreaController {
    @Autowired
    private ExamAreaService examAreaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:examarea:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examAreaService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:examarea:info")
    public R info(@PathVariable("id") Long id){
        ExamAreaEntity examArea = examAreaService.selectById(id);

        return R.ok().put("examArea", examArea);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:examarea:save")
    public R save(@RequestBody ExamAreaEntity examArea){
        examAreaService.insert(examArea);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:examarea:update")
    public R update(@RequestBody ExamAreaEntity examArea){
        ValidatorUtils.validateEntity(examArea);
        examAreaService.updateAllColumnById(examArea);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:examarea:delete")
    public R delete(@RequestBody Long[] ids){
        examAreaService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
