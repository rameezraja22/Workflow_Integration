package com.batch.framework.workflow.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.batch.framework.workflow.entity.id.EventBatchJobParamsKey;


@Entity
@Table(name="EVENT_BATCH_JOB_PARAMS")
public class EventBatchJobParams {
	
	@EmbeddedId
	private EventBatchJobParamsKey eventBatchJobParams;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "JOB_ID", insertable = false, updatable = false)
	private EventBatchConfig eventBatchConfig;
	
	@Column(name="JOB_PARAM_VALUE")
	private String jobParamValue;

	public EventBatchJobParamsKey getEventBatchJobParams() {
		return eventBatchJobParams;
	}

	public void setEventBatchJobParams(EventBatchJobParamsKey eventBatchJobParams) {
		this.eventBatchJobParams = eventBatchJobParams;
	}

	public EventBatchConfig getEventBatchConfig() {
		return eventBatchConfig;
	}

	public void setEventBatchConfig(EventBatchConfig eventBatchConfig) {
		this.eventBatchConfig = eventBatchConfig;
	}

	public String getJobParamValue() {
		return jobParamValue;
	}

	public void setJobParamValue(String jobParamValue) {
		this.jobParamValue = jobParamValue;
	}

	
}