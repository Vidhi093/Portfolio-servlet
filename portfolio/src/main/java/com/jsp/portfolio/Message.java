package com.jsp.portfolio;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Message")
public class Message extends HttpServlet{
	
	List<Utility> utilities = Utility.getUtilities();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();
		if (utilities!=null) {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>Message</title>\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
					+ "    <link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\">\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
					+ "    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap\" rel=\"stylesheet\">\r\n"
					+ "    <link rel=\"stylesheet\" href=\"./resources/font-awesome-4.7.0/css/font-awesome.css\">\r\n"
					+ "    <style>\r\n"
					+ "        body {\r\n"
					+ "    margin: 0;\r\n"
					+ "    color: #f7f5f2 ;\r\n"
					+ "    font-family: 'Poppins', sans-serif;\r\n"
					+ "    background-color: #0c4448;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "#header{\r\n"
					+ "    text-transform: uppercase;\r\n"
					+ "    text-align: center;\r\n"
					+ "    position: relative;\r\n"
					+ "    margin-bottom: 20px;\r\n"
					+ "}\r\n"
					+ "#header h1{\r\n"
					+ "    font-size: 110px;\r\n"
					+ "    letter-spacing: 12px;\r\n"
					+ "    opacity: 0.1;\r\n"
					+ "    display: inline;\r\n"
					+ "    margin: 0px auto;\r\n"
					+ "    color: #547577 ;\r\n"
					+ "    padding: 0px;\r\n"
					+ "}\r\n"
					+ "#header h2{\r\n"
					+ "    position: absolute;\r\n"
					+ "    left: 35%;\r\n"
					+ "    top: 19%;\r\n"
					+ "    z-index: 5;\r\n"
					+ "    font-size: 70px;\r\n"
					+ "    display: inline;\r\n"
					+ "    text-align: center;\r\n"
					+ "    margin: 0px auto;\r\n"
					+ "    letter-spacing: 5px;\r\n"
					+ "    color: #d89f6b;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "#MenuSection {\r\n"
					+ "    display: inline;\r\n"
					+ "    position: fixed;\r\n"
					+ "    top: 110px;\r\n"
					+ "    right: 25px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "#MenuSection a{\r\n"
					+ "    display: flex ;\r\n"
					+ "    text-decoration: none;\r\n"
					+ "    margin-bottom: 20px;\r\n"
					+ "    font-size: 25px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".hide i{\r\n"
					+ "    padding: 15px;\r\n"
					+ "    border-radius: 100%;\r\n"
					+ "    font-size: 25px;\r\n"
					+ "    color: white;\r\n"
					+ "    background-color: #37666b;\r\n"
					+ "}\r\n"
					+ ".hide .fa-briefcase{\r\n"
					+ "    background-color: #d89f6b;\r\n"
					+ "}\r\n"
					+ ".hide .fa-user{\r\n"
					+ "    background-color: #37666b;\r\n"
					+ "    padding: 15px 18px;\r\n"
					+ "    border-radius: 100%;\r\n"
					+ "    font-size: 25px;\r\n"
					+ "    color: white;\r\n"
					+ "}\r\n"
					+ ".hide .text{\r\n"
					+ "    opacity: 0;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "}\r\n"
					+ ".hide {\r\n"
					+ "    border-radius: 50px;\r\n"
					+ "    color: black;\r\n"
					+ "    border: none;\r\n"
					+ "    padding: 0px 0px 0px 20px;\r\n"
					+ "    background-color: #0c4448;\r\n"
					+ "    color: black;\r\n"
					+ "    font-size: 16px;\r\n"
					+ "    cursor: pointer;\r\n"
					+ "    margin: 0% auto;\r\n"
					+ "}\r\n"
					+ ".hide:hover{\r\n"
					+ "    background-color: #d89f6b;\r\n"
					+ "    transition:  .6s ease; \r\n"
					+ "    padding: 0px 0px 0px 20px;\r\n"
					+ "    color: black;\r\n"
					+ "    font-size: 16px;\r\n"
					+ "    cursor: pointer;\r\n"
					+ "    margin: 0% auto;\r\n"
					+ "}\r\n"
					+ ".hide:hover i{\r\n"
					+ "    background-color: #d89f6b;\r\n"
					+ "    transition:  .6s ease; \r\n"
					+ "}\r\n"
					+ ".hide:hover .text{\r\n"
					+ "    opacity: 1;\r\n"
					+ "    color: white;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "    transition:  .6s ease; \r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "#msg{\r\n"
					+ "    display: grid;\r\n"
					+ "    grid-template-columns: repeat(2, 1fr);\r\n"
					+ "    gap: 10px;\r\n"
					+ "    width: 75%;\r\n"
					+ "    margin-left: 100px;\r\n"
					+ "}\r\n"
					+ ".griditem{\r\n"
					+ "    border: 1px solid #eee;\r\n"
					+ "\r\n"
					+ "}\r\n"
					+ ".griditem h3,h4,p{\r\n"
					+ "    margin: 0%;\r\n"
					+ "    padding: 5px 10px 5px ;\r\n"
					+ "}\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <div id=\"header\">\r\n"
					+ "        <h1>Admin</h1>\r\n"
					+ "        <h2><span>Message</span></h2>\r\n"
					+ "    </div>\r\n"
					+ "    <div id=\"msg\">\r\n"
					+ "");
			
			for (Utility utility : utilities) {
				printWriter.print("<div class=\"griditem\">\r\n"
						+ "				<p>"+utility.getFormattedTimestamp() + "</p>\n"
						+ "            <h3>Email : " +utility.getEmail()+" </h3>\r\n"
						+ "            <h4>Name : "+utility.getName()+"</h4>\r\n"
						+ "            <p>Message : "+utility.getMsg()+" </p>\r\n"
						+ "        </div>");
			}
			printWriter.print("    </div>\r\n"
					+ "    <div id=\"MenuSection\">\r\n"
					+ "        <a href=\"index.html\" id=\"home\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">Home</span>\r\n"
					+ "                <i class=\"fa fa-home\" aria-hidden=\"true\"></i></button></a> \r\n"
					+ "        <a href=\"about.html\" id=\"about\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">About</span>\r\n"
					+ "                <i class=\"fa fa-user\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "        <a href=\"project.html\" id=\"project\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">Project</span>\r\n"
					+ "                <i class=\"fa fa-briefcase\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "        <a href=\"contact.html\" id=\"contact\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">Contact</span>\r\n"
					+ "                <i class=\"fa fa-comments\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "                <a href=\"login.html\" id=\"contact\">\r\n"
					+ "                    <button class=\"hide\">\r\n"
					+ "                        <span class=\"text\">Login </span>\r\n"
					+ "                        <i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "    </div>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		} else {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>Message</title>\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
					+ "    <link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\">\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
					+ "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
					+ "    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap\" rel=\"stylesheet\">\r\n"
					+ "    <link rel=\"stylesheet\" href=\"./resources/font-awesome-4.7.0/css/font-awesome.css\">\r\n"
					+ "    <style>\r\n"
					+ "        body {\r\n"
					+ "    margin: 0;\r\n"
					+ "    color: #f7f5f2 ;\r\n"
					+ "    font-family: 'Poppins', sans-serif;\r\n"
					+ "    background-color: #0c4448;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "#header{\r\n"
					+ "    text-transform: uppercase;\r\n"
					+ "    text-align: center;\r\n"
					+ "    position: relative;\r\n"
					+ "    margin-bottom: 20px;\r\n"
					+ "}\r\n"
					+ "#header h1{\r\n"
					+ "    font-size: 110px;\r\n"
					+ "    letter-spacing: 12px;\r\n"
					+ "    opacity: 0.1;\r\n"
					+ "    display: inline;\r\n"
					+ "    margin: 0px auto;\r\n"
					+ "    color: #547577 ;\r\n"
					+ "    padding: 0px;\r\n"
					+ "}\r\n"
					+ "#header h2{\r\n"
					+ "    position: absolute;\r\n"
					+ "    left: 35%;\r\n"
					+ "    top: 19%;\r\n"
					+ "    z-index: 5;\r\n"
					+ "    font-size: 70px;\r\n"
					+ "    display: inline;\r\n"
					+ "    text-align: center;\r\n"
					+ "    margin: 0px auto;\r\n"
					+ "    letter-spacing: 5px;\r\n"
					+ "    color: #d89f6b;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "#MenuSection {\r\n"
					+ "    display: inline;\r\n"
					+ "    position: fixed;\r\n"
					+ "    top: 110px;\r\n"
					+ "    right: 25px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "#MenuSection a{\r\n"
					+ "    display: flex ;\r\n"
					+ "    text-decoration: none;\r\n"
					+ "    margin-bottom: 20px;\r\n"
					+ "    font-size: 25px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".hide i{\r\n"
					+ "    padding: 15px;\r\n"
					+ "    border-radius: 100%;\r\n"
					+ "    font-size: 25px;\r\n"
					+ "    color: white;\r\n"
					+ "    background-color: #37666b;\r\n"
					+ "}\r\n"
					+ ".hide .fa-briefcase{\r\n"
					+ "    background-color: #d89f6b;\r\n"
					+ "}\r\n"
					+ ".hide .fa-user{\r\n"
					+ "    background-color: #37666b;\r\n"
					+ "    padding: 15px 18px;\r\n"
					+ "    border-radius: 100%;\r\n"
					+ "    font-size: 25px;\r\n"
					+ "    color: white;\r\n"
					+ "}\r\n"
					+ ".hide .text{\r\n"
					+ "    opacity: 0;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "}\r\n"
					+ ".hide {\r\n"
					+ "    border-radius: 50px;\r\n"
					+ "    color: black;\r\n"
					+ "    border: none;\r\n"
					+ "    padding: 0px 0px 0px 20px;\r\n"
					+ "    background-color: #0c4448;\r\n"
					+ "    color: black;\r\n"
					+ "    font-size: 16px;\r\n"
					+ "    cursor: pointer;\r\n"
					+ "    margin: 0% auto;\r\n"
					+ "}\r\n"
					+ ".hide:hover{\r\n"
					+ "    background-color: #d89f6b;\r\n"
					+ "    transition:  .6s ease; \r\n"
					+ "    padding: 0px 0px 0px 20px;\r\n"
					+ "    color: black;\r\n"
					+ "    font-size: 16px;\r\n"
					+ "    cursor: pointer;\r\n"
					+ "    margin: 0% auto;\r\n"
					+ "}\r\n"
					+ ".hide:hover i{\r\n"
					+ "    background-color: #d89f6b;\r\n"
					+ "    transition:  .6s ease; \r\n"
					+ "}\r\n"
					+ ".hide:hover .text{\r\n"
					+ "    opacity: 1;\r\n"
					+ "    color: white;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "    transition:  .6s ease; \r\n"
					+ "}\r\n"
					+ "#msg{\r\n"
					+ "    text-align: center;\r\n"
					+ "    width: 75%;\r\n"
					+ "    margin-left: 100px;\r\n"
					+ "}\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <div id=\"header\">\r\n"
					+ "        <h1>Admin</h1>\r\n"
					+ "        <h2><span>Message</span></h2>\r\n"
					+ "    </div>\r\n"
					+ "    <div id=\"msg\">\r\n"
					+ "        <h1>No Message Available</h1>\r\n"
					+ "    </div>\r\n"
					+ "    <div id=\"MenuSection\">\r\n"
					+ "        <a href=\"index.html\" id=\"home\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">Home</span>\r\n"
					+ "                <i class=\"fa fa-home\" aria-hidden=\"true\"></i></button></a> \r\n"
					+ "        <a href=\"about.html\" id=\"about\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">About</span>\r\n"
					+ "                <i class=\"fa fa-user\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "        <a href=\"project.html\" id=\"project\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">Project</span>\r\n"
					+ "                <i class=\"fa fa-briefcase\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "        <a href=\"contact.html\" id=\"contact\">\r\n"
					+ "            <button class=\"hide\">\r\n"
					+ "                <span class=\"text\">Contact</span>\r\n"
					+ "                <i class=\"fa fa-comments\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "                <a href=\"login.html\" id=\"contact\">\r\n"
					+ "                    <button class=\"hide\">\r\n"
					+ "                        <span class=\"text\">Login </span>\r\n"
					+ "                        <i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i></button></a>\r\n"
					+ "    </div>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
		
		
	}
}
