package com.ssi.collection;

public class Project {
	private int projectCode;
	private String projectTitle;
	private int duration;
	private String clientName;
	public Project(int projectCode, String projectTitle, int duration, String clientName) {
		super();
		this.projectCode = projectCode;
		this.projectTitle = projectTitle;
		this.duration = duration;
		this.clientName = clientName;
	}
	public Project() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectTitle=" + projectTitle + ", duration=" + duration
				+ ", clientName=" + clientName + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + projectCode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (projectCode != other.projectCode)
			return false;
		return true;
	}
	public int getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	
	

}
