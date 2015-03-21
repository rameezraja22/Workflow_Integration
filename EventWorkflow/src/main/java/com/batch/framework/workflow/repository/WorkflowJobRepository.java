package com.batch.framework.workflow.repository;

import org.springframework.data.repository.CrudRepository;

import com.batch.framework.workflow.entity.EventBatchConfig;

public interface WorkflowJobRepository extends CrudRepository<EventBatchConfig,String>{
	
	Iterable<EventBatchConfig> findByJobId(String jobId);

}
