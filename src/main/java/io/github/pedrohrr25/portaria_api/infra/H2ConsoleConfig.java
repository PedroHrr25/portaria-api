//package io.github.pedrohrr25.portaria_api.infra;
//
//import org.h2.server.web.WebServlet;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import jakarta.servlet.Servlet;
//
//@Configuration
//public class H2ConsoleConfig {
//
//    @Bean
//    public ServletRegistrationBean<Servlet> h2ServletRegistration() {
//        ServletRegistrationBean<Servlet> registrationBean =
//                new ServletRegistrationBean<>(new WebServlet());
//        registrationBean.addUrlMappings("/h2-console/*");
//        registrationBean.setLoadOnStartup(1);
//        return registrationBean;
//    }
//}