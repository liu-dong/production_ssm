package org.hqu.production_ms.mapper.authority;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.authority.SysUser;
import org.hqu.production_ms.domain.authority.SysUserRole;
import org.hqu.production_ms.domain.authority.SysUserRoleExample;
import org.hqu.production_ms.domain.po.UserPO;

public interface SysUserRoleMapper {
	
	//扩展的mapper接口方法
	int deleteBatchByUserId(String[] ids);
	
	
    int countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    SysUserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}