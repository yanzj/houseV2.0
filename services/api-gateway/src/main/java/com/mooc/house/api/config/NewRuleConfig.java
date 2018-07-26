package com.mooc.house.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class NewRuleConfig {
	
	@Autowired
	private IClientConfig ribbonClientConfig;

	/**
	 * 默认每10s进行健康监测
	 * @param config
	 * @return
	 */
	@Bean
	public IPing ribbonPing(IClientConfig config){
		return new PingUrl(false,"/health");
	}
	
	@Bean
	public IRule ribbonRule(IClientConfig config){
//		return new RandomRule();
		//可用的，更智能选择，负载均衡策略
		return new AvailabilityFilteringRule();
	}

}
