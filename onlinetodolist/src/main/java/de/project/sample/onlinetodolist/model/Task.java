package de.project.sample.onlinetodolist.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tasks")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Task {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private int id;

	@Column(name = "create_dt")
	@JsonProperty("createDate")
	private Date createDate;

	@Column(name = "description")
	@JsonProperty("description")
	private String description;

	@Column(name = "status")
	@JsonProperty("status")
	private String status;

	@Column(name = "user_id")
	@JsonProperty("userId")
	private String userId;
	
	@Column(name = "last_update_date")
	@JsonProperty("lastUpdatedDate")
	private Date lastUpdatedDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date date) {
		this.createDate = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Task{" + "id=" + id + ", date=" + createDate + ", Description='" + description + '\'' + ", status="
				+ status + "userid="+userId+"lastUpdatedDate="+lastUpdatedDate+ '}';
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}
