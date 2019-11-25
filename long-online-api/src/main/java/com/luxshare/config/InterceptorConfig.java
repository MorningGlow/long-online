package com.luxshare.config;

import com.luxshare.interceptors.CompleteSqlPrintInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterceptorConfig {

//    @Bean
//    public Interceptor getInterceptor(){
//        return new CompleteSqlPrintInterceptor();
//    }

}
