package com.jsp.portfolio;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/contact")
public class Contact extends HttpServlet {
	
	static List<Utility> users = new ArrayList<>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String msg = req.getParameter("msg");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		Utility utility = new Utility();
		utility.setName(name);
		utility.setEmail(email);
		utility.setMsg(msg);
		utility.setDateTime();
		
		users.add(utility);
		utility.setUtilities(users);
		
		PrintWriter printWriter = resp.getWriter();
		if (name.isEmpty() && email.isEmpty() && email.isEmpty()) {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>Contact</title>\r\n"
					+ "    <style>\r\n"
					+ "        body {\r\n"
					+ "            font-family: 'Arial', sans-serif;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast {\r\n"
					+ "            display: none;\r\n"
					+ "            position: absolute;\r\n"
					+ "            top: 50px;\r\n"
					+ "            right: 50px;\r\n"
					+ "            background-color: #f16667;\r\n"
					+ "            color: #fff;\r\n"
					+ "            padding: 15px;\r\n"
					+ "            border-radius: 5px;\r\n"
					+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast .column {\r\n"
					+ "            display: inline;\r\n"
					+ "            align-items: center;\r\n"
					+ "            \r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast span {\r\n"
					+ "            margin-left: 10px;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast i {\r\n"
					+ "            margin-left: 10px;\r\n"
					+ "            cursor: pointer;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        @media screen and (max-width: 600px) {\r\n"
					+ "            .toast {\r\n"
					+ "                width: 80%;\r\n"
					+ "            }\r\n"
					+ "        }\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <div id=\"welcomeToast\" class=\"toast\">\r\n"
					+ "        <div class=\"column\">\r\n"
					+ "            <span>Please enter the details</span>\r\n"
					+ "        </div>\r\n"
					+ "        <i class=\"fa-solid fa-xmark\" onclick=\"removeToast(this.parentElement)\"></i>\r\n"
					+ "    </div>\r\n"
					+ "\r\n"
					+ "    <script>\r\n"
					+ "        document.addEventListener('DOMContentLoaded', function () {\r\n"
					+ "            const welcomeToast = document.getElementById(\"welcomeToast\");\r\n"
					+ "\r\n"
					+ "            const removeToast = (toast) => {\r\n"
					+ "                toast.style.animation = 'hide_toast 0.3s ease forwards';\r\n"
					+ "                setTimeout(() => {\r\n"
					+ "                    toast.style.display = 'none';\r\n"
					+ "                    toast.style.animation = '';\r\n"
					+ "                }, 300);\r\n"
					+ "            }\r\n"
					+ "\r\n"
					+ "            // Function to show the welcome toast\r\n"
					+ "            const showWelcomeToast = () => {\r\n"
					+ "                welcomeToast.style.display = 'flex';\r\n"
					+ "                welcomeToast.style.animation = 'show_toast 0.3s ease forwards';\r\n"
					+ "\r\n"
					+ "                setTimeout(() => {\r\n"
					+ "                    removeToast(welcomeToast);\r\n"
					+ "                }, 3000); // Display for 5 seconds (adjust as needed)\r\n"
					+ "            }\r\n"
					+ "\r\n"
					+ "            // Show the welcome toast when the page loads\r\n"
					+ "            showWelcomeToast();\r\n"
					+ "        });\r\n"
					+ "    </script>\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("contact.html");
			requestDispatcher.include(req, resp);
			
			
		} else {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>Contact</title>\r\n"
					+ "    <style>\r\n"
					+ "        body {\r\n"
					+ "            font-family: 'Arial', sans-serif;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast {\r\n"
					+ "            display: none;\r\n"
					+ "            position: absolute;\r\n"
					+ "            top: 50px;\r\n"
					+ "            right: 50px;\r\n"
					+ "            background-color: #04aa6d;\r\n"
					+ "            color: #fff;\r\n"
					+ "            padding: 15px;\r\n"
					+ "            border-radius: 5px;\r\n"
					+ "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast .column {\r\n"
					+ "            display: flex;\r\n"
					+ "            align-items: center;\r\n"
					+ "            \r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast span {\r\n"
					+ "            margin-left: 10px;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        .toast i {\r\n"
					+ "            margin-left: 10px;\r\n"
					+ "            cursor: pointer;\r\n"
					+ "        }\r\n"
					+ "\r\n"
					+ "        @media screen and (max-width: 600px) {\r\n"
					+ "            .toast {\r\n"
					+ "                width: 80%;\r\n"
					+ "            }\r\n"
					+ "        }\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <div id=\"welcomeToast\" class=\"toast\">\r\n"
					+ "        <div class=\"column\">\r\n"
					+ "            <span>Message Sent</span>\r\n"
					+ "        </div>\r\n"
					+ "        <i class=\"fa-solid fa-xmark\" onclick=\"removeToast(this.parentElement)\"></i>\r\n"
					+ "    </div>\r\n"
					+ "\r\n"
					+ "    <script>\r\n"
					+ "        document.addEventListener('DOMContentLoaded', function () {\r\n"
					+ "            const welcomeToast = document.getElementById(\"welcomeToast\");\r\n"
					+ "\r\n"
					+ "            const removeToast = (toast) => {\r\n"
					+ "                toast.style.animation = 'hide_toast 0.3s ease forwards';\r\n"
					+ "                setTimeout(() => {\r\n"
					+ "                    toast.style.display = 'none';\r\n"
					+ "                    toast.style.animation = '';\r\n"
					+ "                }, 300);\r\n"
					+ "            }\r\n"
					+ "\r\n"
					+ "            // Function to show the welcome toast\r\n"
					+ "            const showWelcomeToast = () => {\r\n"
					+ "                welcomeToast.style.display = 'flex';\r\n"
					+ "                welcomeToast.style.animation = 'show_toast 0.3s ease forwards';\r\n"
					+ "\r\n"
					+ "                setTimeout(() => {\r\n"
					+ "                    removeToast(welcomeToast);\r\n"
					+ "                }, 3000); // Display for 5 seconds (adjust as needed)\r\n"
					+ "            }\r\n"
					+ "\r\n"
					+ "            // Show the welcome toast when the page loads\r\n"
					+ "            showWelcomeToast();\r\n"
					+ "        });\r\n"
					+ "    </script>\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("contact.html");
			requestDispatcher.include(req, resp);
		}
		
	}
}
