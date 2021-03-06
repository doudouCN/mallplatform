package com.doudouj.dao.sysconfig;

import com.doudouj.dto.sysconfig.SysRoleMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}