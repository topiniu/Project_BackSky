package com.pb.project_a;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class AddQuestionServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddQuestionServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		res.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println("AddQuestionServlet");
//		var data = "id="+item._id+
//	            "&content="+item._content+
//	            "&answers="+item._answers+
//	            "&rightAnswers="+item._rightAnswers+
//	            "&managerId="+item._managerId;

		String frontId = req.getParameter("id");
		String content = req.getParameter("content");
		String managerId = req.getParameter("managerId");
		
		Question q = new Question(frontId,content,managerId);
		
		System.out.println(q.getContent());
		
	}
	
}
