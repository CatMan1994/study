package cn.zhongguochu.mango.service.impl;

import cn.zhongguochu.mango.dao.SysUserMapper;
import cn.zhongguochu.mango.model.SysUser;
import cn.zhongguochu.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
