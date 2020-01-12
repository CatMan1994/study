package cn.zhongguochu.mango.service;

import cn.zhongguochu.mango.model.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysUserService {
    List<SysUser> findAll();
}
