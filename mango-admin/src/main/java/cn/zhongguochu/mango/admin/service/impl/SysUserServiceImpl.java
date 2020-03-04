package cn.zhongguochu.mango.admin.service.impl;

import cn.zhongguochu.mango.admin.model.SysUser;
import cn.zhongguochu.mango.admin.service.SysUserService;
import cn.zhongguochu.mango.admin.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService
{
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
