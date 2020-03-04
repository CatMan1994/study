package cn.zhongguochu.mango.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.zhongguochu.mango.admin"})
public class MangoAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(MangoAdminApplication.class, args);
	}
}
