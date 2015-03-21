package com.batch.framework.workflow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="EVENT_BATCH_JOB_PARAMS")
public class EventBatchJobParams {
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="JOB_ID",nullable=false)
	private String jobId;
	
	@Column(name="JOB_PARAM_KEY")
	private String jobParamKey;
	
	@Column(name="JOB_PARAM_VALUE")
	private String jobParamValue;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobParamKey() {
		return jobParamKey;
	}

	public void setJobParamKey(String jobParamKey) {
		this.jobParamKey = jobParamKey;
	}

	public String getJobParamValue() {
		return jobParamValue;
	}

	public void setJobParamValue(String jobParamValue) {
		this.jobParamValue = jobParamValue;
	}
	
}
