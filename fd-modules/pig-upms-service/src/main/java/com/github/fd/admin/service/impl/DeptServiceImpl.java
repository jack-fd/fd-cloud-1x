package com.github.fd.admin.service.impl;

import com.github.fd.admin.mapper.SysDeptMapper;
import com.github.fd.admin.model.entity.SysDept;
import com.github.fd.admin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mq
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public int deleteByPrimaryKey(Integer deptId) {
        return sysDeptMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int insert(SysDept sysDept) {
        return sysDeptMapper.insert(sysDept);
    }

    @Override
    public int insertSelective(SysDept sysDept) {
        return sysDeptMapper.insertSelective(sysDept);
    }

    @Override
    public SysDept selectByPrimaryKey(Integer deptId) {
        return sysDeptMapper.selectByPrimaryKey(deptId);
    }

    @Override
    public int updateByPrimaryKeySelective(SysDept sysDept) {
        return sysDeptMapper.updateByPrimaryKeySelective(sysDept);
    }

    @Override
    public int updateByPrimaryKey(SysDept sysDept) {
        return sysDeptMapper.updateByPrimaryKey(sysDept);
    }
}
