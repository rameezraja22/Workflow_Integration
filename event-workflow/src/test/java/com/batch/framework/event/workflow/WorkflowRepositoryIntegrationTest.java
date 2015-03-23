package com.batch.framework.event.workflow;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.batch.framework.workflow.entity.EventBatchConfig;
import com.batch.framework.workflow.repository.WorkflowJobRepository;
import com.thoughtworks.xstream.XStream;

public class WorkflowRepositoryIntegrationTest extends AbstractIntegrationTest {

	@Autowired
	private WorkflowJobRepository workflowJobRepository;
	
	XStream obj = new XStream();
			
	@Test
	public void findAll() {
		Iterable<EventBatchConfig> results = workflowJobRepository.findAll();
		Assert.notNull(results);
		System.out.println("WorkFlow History Response :"+obj.toXML(results));
	}
	
}
