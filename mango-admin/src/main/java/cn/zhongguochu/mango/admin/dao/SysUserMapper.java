package cn.zhongguochu.mango.admin.dao;

import java.util.List;

import cn.zhongguochu.mango.admin.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();
}