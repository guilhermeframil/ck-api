package com.ckapi.model.response;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class TrainingResponse {

	private String name;
	private String duration;
	private String place;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	private String time;
	private String leader;
	private String url;
	private String Links;

	public TrainingResponse() {
		super();
	}

	public TrainingResponse(String name, String duration, String place, LocalDate date, String time, String leader) {
		super();
		this.name = name;
		this.duration = duration;
		this.place = place;
		this.date = date;
		this.time = time;
		this.leader = leader;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
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

	public String getLinks() {
		return Links;
	}

	public void setLinks(String links) {
		Links = links;
	}

}
