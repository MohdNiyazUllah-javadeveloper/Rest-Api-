package com.example.appkubedeliveryservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="email")
public class EmailQueueEntity {
	
	
	@Id
	private Long id;
    private String frommsg;
    private String tomsg;
	public Long getId() {
		return id;
		
	}
	@Override
	public String toString() {
		return "EmailQueueEntity [id=" + id + ", frommsg=" + frommsg + ", tomsg=" + tomsg + ", getId()=" + getId()
				+ ", getFrommsg()=" + getFrommsg() + ", getTomsg()=" + getTomsg() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getFrommsg() {
		return frommsg;
	}
	public void setFrommsg(String frommsg) {
		this.frommsg = frommsg;
	}
	public String getTomsg() {
		return tomsg;
	}
	public void setTomsg(String tomsg) {
		this.tomsg = tomsg;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
