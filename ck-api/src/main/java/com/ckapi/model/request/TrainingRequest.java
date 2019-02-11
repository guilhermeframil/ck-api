package com.ckapi.model.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class TrainingRequest {

	private String name;
	private String duration;
	private String place;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalDate time;
	private String leader;
	private String url;

	public TrainingRequest() {
		super();
	}

	public TrainingRequest(String name, String duration, String place, LocalDate date, LocalDate time, String leader,
			String url) {
		super();
		this.name = name;
		this.duration = duration;
		this.place = place;
		this.date = date;
		this.time = time;
		this.leader = leader;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
