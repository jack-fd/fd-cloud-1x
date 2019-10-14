package com.github.fd.admin.controller;

import com.github.fd.admin.model.entity.SysDept;
import com.github.fd.admin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author mq
 */
@RestController
@RequestMapping("dept")
public class HelloController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/add")
    public int add() {
        SysDept sysDept = new SysDept();
        sysDept.setName("add");
        sysDept.setOrderNum(11);
        sysDept.setDelFlag("0");
        sysDept.setCreateTime(new Date());
        sysDept.setUpdateTime(new Date());
        deptService.insert(sysDept);
        return sysDept.getDeptId();
    }

    @GetMapping("/get")
    public SysDept get() {
        return deptService.selectByPrimaryKey(1);
    }

    @GetMapping("/update")
    public int update() {
        SysDept sysDept = new SysDept();
        sysDept.setDeptId(14);
        sysDept.setName("update1111");
        sysDept.setUpdateTime(new Date());
        return deptService.updateByPrimaryKey(sysDept);
    }

    @GetMapping("/delete")
    public int delete() {
        return deptService.deleteByPrimaryKey(14);
    }
}
