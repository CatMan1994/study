package cn.zhongguochu.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.zhongguochu.mango"})
public class MangoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoApplication.class, args);
	}

}
