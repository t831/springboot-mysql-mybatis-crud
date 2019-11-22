package com.cos.crud.model;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Post {
	private int id;
	private String title;
	private String content;
	private int userId; // FK
	private Timestamp createDate;
	
	public Post() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Post(int id, String title, String content, int userId, Timestamp createDate) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.createDate = createDate;
	}
	
	
}
