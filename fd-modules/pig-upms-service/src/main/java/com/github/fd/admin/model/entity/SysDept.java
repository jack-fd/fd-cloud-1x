package com.github.fd.admin.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysDept {

    private static final long serialVersionUID = 1L;

    private Integer deptId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 是否删除  -1：已删除  0：正常
     */
    private String delFlag;

    private Integer parentId;
}
