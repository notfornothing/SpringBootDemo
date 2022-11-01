package cn.leijiba.config.MyConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class EnableLeijiba {
    @Value("leijiba")
    private String name;

    @Bean("area")
    private String getArea() {
        return "shenzhen";
    }

    @Bean
    public String getLeijibaName() {
        System.out.println("leijiba name is " + name);
        return name;
    }

    @Bean
    public String getAreaName(String area111) {
        System.out.println("area name is " + area111);
        return area111;
    }

}
