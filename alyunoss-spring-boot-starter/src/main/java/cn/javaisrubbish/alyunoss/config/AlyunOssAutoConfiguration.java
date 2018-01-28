//package cn.javaisrubbish.alyunoss.config;
//
//import cn.aion.swagger.priperties.Swagger2Properties;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @author chenhai
// * @detail Swagger2 配置类
// * @date 2017/10/12
// */
//
//@Configuration
//@EnableConfigurationProperties(value = Swagger2Properties.class)
//@ConditionalOnClass({Docket.class,ApiInfoBuilder.class})
//@ConditionalOnProperty(prefix = "swagger2",name ="enable",havingValue = "true")
//@Setter
//@Getter
//public class AlyunOssAutoConfiguration {
////    @Autowired
////    private Swagger2Properties swagger2Properties;
//    //
//    @Bean
//    public Docket api() {
//
//    }
//
//}
