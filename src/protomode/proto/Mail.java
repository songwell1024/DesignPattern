package protomode.proto;

import protomode.EventTemplate;

import java.util.ArrayList;


public class Mail implements Cloneable {
	private String receiver;
	private String subject;
	private String content;
	private String tail;
	private ArrayList<String> ars;
	public Mail(EventTemplate et) {
		this.tail = et.geteventContent();
		this.subject = et.geteventSubject();
	
	}

	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
			mail.ars = (ArrayList<String>)this.ars.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

}
