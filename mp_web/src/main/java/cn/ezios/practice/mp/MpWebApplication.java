package cn.ezios.practice.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ezios.practice.mp.dao")
public class MpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpWebApplication.class, args);
    }

}
