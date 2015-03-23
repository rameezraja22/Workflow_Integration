/*package com.batch.framework.workflow.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.support.incrementer.OracleSequenceMaxValueIncrementer;

import com.batch.framework.workflow.entity.EventBatchConfig;
import com.batch.framework.workflow.entity.EventBatchJobParams;
import com.batch.framework.workflow.repository.WorkflowJobRepository;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@EntityScan(basePackageClasses = { EventBatchConfig.class,EventBatchJobParams.class })
@EnableJpaRepositories(basePackageClasses = { WorkflowJobRepository.class })
public class RepositoryConfiguration {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean(name = "messageSequence")
	public OracleSequenceMaxValueIncrementer getIncrementer() {
		OracleSequenceMaxValueIncrementer incrementer = new OracleSequenceMaxValueIncrementer();
		incrementer.setIncrementerName("EVENT_MESSAGE_SEQ");
		incrementer.setDataSource(dataSource);
		return incrementer;
	}

}*/