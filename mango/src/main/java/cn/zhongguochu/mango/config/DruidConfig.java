package cn.zhongguochu.mango.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class DruidConfig {
    @Bean
    @ConditionalOnMissingBean
    public ServletRegistrationBean<Servlet> druidServlet() {
        ServletRegistrationBean<Servlet> servletServletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        // 白名单
        servletServletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        servletServletRegistrationBean.addInitParameter("deny", "192.168.1.119");
        servletServletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletServletRegistrationBean.addInitParameter("loginPassword", "admin");
        servletServletRegistrationBean.addInitParameter("resetEnable", "true");
        return servletServletRegistrationBean;
    }
}
