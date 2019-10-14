package com.github.fd.admin.mapper;


import com.github.fd.admin.model.entity.SysDept;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDeptMapper {

    int deleteByPrimaryKey(Integer deptId);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
}
