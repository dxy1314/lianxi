package lianxi.lianxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication

@MapperScan("lianxi.lianxi.mapper")
public class LianxiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LianxiApplication.class, args);
    }

}

