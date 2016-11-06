package br.com.dashboard.model;

import java.util.Date;

public class Course {
	private Long id;
	private Long category;
	private String fullName;
	private String shortName;
	private Date startDate;
	private Integer timeCreated;
	private Integer timeModified;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCategory() {
		return category;
	}
	public void setCategory(Long category) {
		this.category = category;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Integer timeCreated) {
		this.timeCreated = timeCreated;
	}
	public Integer getTimeModified() {
		return timeModified;
	}
	public void setTimeModified(Integer timeModified) {
		this.timeModified = timeModified;
	}
	
}
