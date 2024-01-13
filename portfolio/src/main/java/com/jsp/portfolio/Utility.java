package com.jsp.portfolio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Utility {

	private String name;
	private String email;
	private String msg;
	private LocalDateTime dateTime;
	static List<Utility> utilities;
	
	public Utility() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Utility> getUtilities() {
		return utilities;
	}

	public static void setUtilities(List<Utility> utilities) {
		Utility.utilities = utilities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime() {
		this.dateTime = LocalDateTime.now();
	}
	 public String getFormattedTimestamp() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	        return dateTime.format(formatter);
	    }
}
