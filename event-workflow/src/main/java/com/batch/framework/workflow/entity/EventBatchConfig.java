package com.batch.framework.workflow.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EVENT_BATCH_CONFIG")
public class EventBatchConfig {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="JOB_ID", unique=true,nullable=false)
	private String jobId;
	
	@Column(name="JOB_NAME")
	private String jobName;
	
	@Column(name="CRON_TRIGGER")
	private String cronTrigger;
	
	@Column(name="BATCH_ENPOINT")
	private String batchEndPoint;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD_EY")
	private String passwordKey;
	
	@OneToMany(mappedBy = "eventBatchConfig", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private Set<EventBatchJobParams> batchJobParams = new HashSet<EventBatchJobParams>();

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getCronTrigger() {
		return cronTrigger;
	}

	public void setCronTrigger(String cronTrigger) {
		this.cronTrigger = cronTrigger;
	}

	public String getBatchEndPoint() {
		return batchEndPoint;
	}

	public void setBatchEndPoint(String batchEndPoint) {
		this.batchEndPoint = batchEndPoint;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordKey() {
		return passwordKey;
	}

	public void setPasswordKey(String passwordKey) {
		this.passwordKey = passwordKey;
	}

	public Set<EventBatchJobParams> getBatchJobParams() {
		return batchJobParams;
	}

	public void setBatchJobParams(Set<EventBatchJobParams> batchJobParams) {
		this.batchJobParams = batchJobParams;
	}

	
}
