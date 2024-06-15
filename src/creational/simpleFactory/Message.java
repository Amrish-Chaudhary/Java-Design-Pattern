package creational.simpleFactory;

import java.time.LocalDate;

public abstract class Message {
	
	private int id;
	private String title;
	private String content;
	private LocalDate createdOn;
	private LocalDate postedOn;
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", title=" + title + ", content=" + content + ", createdOn=" + createdOn
				+ ", postedOn=" + postedOn + "]";
	}
	
	

}
