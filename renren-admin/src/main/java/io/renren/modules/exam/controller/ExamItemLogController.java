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

import io.renren.modules.exam.entity.ExamItemLogEntity;
import io.renren.modules.exam.service.ExamItemLogService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 纠错日志表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-15 15:15:10
 */
@RestController
@RequestMapping("sys/examitemlog")
public class ExamItemLogController {
    @Autowired
    private ExamItemLogService examItemLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:examitemlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = examItemLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:examitemlog:info")
    public R info(@PathVariable("id") Long id){
        ExamItemLogEntity examItemLog = examItemLogService.selectById(id);

        return R.ok().put("examItemLog", examItemLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:examitemlog:save")
    public R save(@RequestBody ExamItemLogEntity examItemLog){
        examItemLogService.insert(examItemLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:examitemlog:update")
    public R update(@RequestBody ExamItemLogEntity examItemLog){
        ValidatorUtils.validateEntity(examItemLog);
        examItemLogService.updateAllColumnById(examItemLog);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:examitemlog:delete")
    public R delete(@RequestBody Long[] ids){
        examItemLogService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
