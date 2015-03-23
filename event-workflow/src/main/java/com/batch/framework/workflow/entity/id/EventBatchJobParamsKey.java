package com.batch.framework.workflow.entity.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EventBatchJobParamsKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6497250143351377169L;
	
	
	@Column(name="JOB_ID")
	private String jobId;
	
	
	@Column(name="JOB_PARAM_KEY")
	private String jobParamKey;


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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result
				+ ((jobParamKey == null) ? 0 : jobParamKey.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventBatchJobParamsKey other = (EventBatchJobParamsKey) obj;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (jobParamKey == null) {
			if (other.jobParamKey != null)
				return false;
		} else if (!jobParamKey.equals(other.jobParamKey))
			return false;
		return true;
	}

}
