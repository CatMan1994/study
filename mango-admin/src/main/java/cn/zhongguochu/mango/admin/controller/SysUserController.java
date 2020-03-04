package cn.zhongguochu.mango.admin.controller;

import cn.zhongguochu.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}
