/*
package io.security.oauth2.ratest02basic;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class CustomSecurityConfiguerer extends AbstractHttpConfigurer<CustomSecurityConfiguerer, HttpSecurity> {

    private boolean isSecure;


    @Override
    public void init(HttpSecurity builder) throws Exception {
        super.init(builder);
        System.out.println("init method started...");
    }

    @Override
    public void configure(HttpSecurity builder) throws Exception {
       super.configure(builder);
        System.out.println("configure method started..");
        if(isSecure){
            System.out.println("http 필요");
        }else{
            System.out.println("http optional");
        }
    }

    public CustomSecurityConfiguerer setFlag(boolean isSecure){
        this.isSecure = isSecure;
        return this;
    }
}
*/
