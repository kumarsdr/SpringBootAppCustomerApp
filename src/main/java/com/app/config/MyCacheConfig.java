package com.app.config;

import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import com.hazelcast.config.MaxSizeConfig.MaxSizePolicy;

@Configuration
public class MyCacheConfig {

	public Config cacheConfig()
	{
		return new Config().setInstanceName("hazel-Instance")
				.addMapConfig(new MapConfig().setName("emp-cache")
				.setTimeToLiveSeconds(2000)
				.setMaxSizeConfig(new MaxSizeConfig(2000,MaxSizePolicy.FREE_HEAP_SIZE))
				.setEvictionPolicy(EvictionPolicy.LRU));
	}
}
 