package com.github.fd.admin.mapper;

import com.github.fd.admin.model.entity.SysLog;
import com.github.fd.admin.model.entity.SysLogWithBLOBs;

public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    SysLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);
}