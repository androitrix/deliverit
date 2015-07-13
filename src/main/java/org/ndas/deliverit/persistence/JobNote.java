package org.ndas.deliverit.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job_note")
public class JobNote extends IdentityEntity {
	
	@Column(name = "when_created")
	private Date whenCreated;
	
	@Lob
	@Column(name = "text", length=65525)
	private String text;
	
	@OneToOne
	@JoinColumn(name = "created_by")
	private User createdBy;

	public Date getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(Date whenCreated) {
		this.whenCreated = whenCreated;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
