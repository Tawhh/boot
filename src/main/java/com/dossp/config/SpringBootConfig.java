/**
 * @copy right Dossp Company All rights reserved
 *
 * @Title: SpringBootConfig.java 
 *
 * @Date:  2018年1月9日  下午5:17:25
 *
 * @Package com.dossp.common.config
 */


package com.dossp.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.DefaultCookieSerializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.dossp.common.datasource.DynamicDataSource;
import com.dossp.common.interceptor.CheckPermissionInterceptor;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author yufenghui
 * </p>
 * 日期：2018年1月9日 下午5:17:25
 * </p>
 * 描述：
 *
 */
@Configuration
@EnableTransactionManagement
@EnableCaching
@EnableRedisHttpSession
@MapperScan(basePackages = {"com.dossp.crp.**.mapper", "com.dossp.pms.**.mapper"})
public class SpringBootConfig extends WebMvcConfigurerAdapter {

    @Bean
    public CookieHttpSessionStrategy cookieHttpSessionStrategy(){
        CookieHttpSessionStrategy strategy=new CookieHttpSessionStrategy();
        DefaultCookieSerializer cookieSerializer=new DefaultCookieSerializer();
        cookieSerializer.setCookieName("CRP_SESSION_ID");//cookies名称
        cookieSerializer.setCookieMaxAge(86400);//过期时间(秒)
        strategy.setCookieSerializer(cookieSerializer);
        return strategy;
    }
    
    /**
     * 重新配置RedisCacheManager
     * @param rd
     */
    @Autowired
    public void configRedisCacheManger(RedisCacheManager rd){
        rd.setDefaultExpiration(86400L);
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CheckPermissionInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
    
    @Bean(name = "dataSource")
    @Primary
    public DynamicDataSource dataSource(@Qualifier("crp")DataSource crp, 
    		@Qualifier("crp_quant")DataSource crp_quant,@Qualifier("crp_portal")DataSource crp_portal) {
    	
    	DynamicDataSource dataSource = new DynamicDataSource();
    	Map<Object, Object> targetDataSources = new HashMap<>();
    	targetDataSources.put("crp", crp);
    	targetDataSources.put("crp_quant", crp_quant);
    	targetDataSources.put("crp_portal", crp_portal);
    	dataSource.setTargetDataSources(targetDataSources);
    	
    	dataSource.setDefaultTargetDataSource(crp);
    	
    	return dataSource;
    }
    
    @Bean(name = "crp")
    @ConfigurationProperties(prefix = "spring.datasource.druid.crp")
    public DataSource dataSource_crp() {
        return DruidDataSourceBuilder.create().build();
    }


    @Bean(name = "crp_quant")
    @ConfigurationProperties(prefix = "spring.datasource.druid.crp_quant")
    public DataSource dataSource_crp_quant() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "crp_portal")
    @ConfigurationProperties(prefix = "spring.datasource.druid.crp_portal")
    public DataSource dataSource_crp_portal() {
        return DruidDataSourceBuilder.create().build();
    }


}
