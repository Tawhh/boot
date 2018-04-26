/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: Application.java 
 *
 * @Date:  2018年1月9日  下午4:04:51
 *
 * @Package com.dossp
 */


package com.dossp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年1月9日 下午4:04:51
 * </p>
 * 描述：
 *
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class Application extends SpringBootServletInitializer {
	
	   public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	    }

}
