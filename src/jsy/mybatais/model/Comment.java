package jsy.mybatais.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable{
	private Long CommentNo;
	private String userId;
	private Date regDate;
	private String commentContent;
	public Long getCommentNo() {
		return CommentNo;
	}
	public void setCommentNo(Long commentNo) {
		CommentNo = commentNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	@Override
	public String toString() {
		return "Comment [CommentNo=" + CommentNo + ", userId=" + userId + ", regDate=" + regDate + ", commentContent="
				+ commentContent + "]";
	}
	
}
