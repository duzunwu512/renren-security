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

import io.renren.modules.exam.entity.ExamItemEntity;
import io.renren.modules.exam.service.ExamItemService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 考题表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:11
 */
@RestController
@RequestMapping("sys/examitem")
public class ExamItemController {
    @Autowired
    private ExamItemService examItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:examitem:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:examitem:info")
    public R info(@PathVariable("id") Long id){
        ExamItemEntity examItem = examItemService.selectById(id);

        return R.ok().put("examItem", examItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:examitem:save")
    public R save(@RequestBody ExamItemEntity examItem){
        examItemService.insert(examItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:examitem:update")
    public R update(@RequestBody ExamItemEntity examItem){
        ValidatorUtils.validateEntity(examItem);
        examItemService.updateAllColumnById(examItem);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:examitem:delete")
    public R delete(@RequestBody Long[] ids){
        examItemService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
