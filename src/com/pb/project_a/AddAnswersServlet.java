package com.pb.project_a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddAnswersServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddAnswersServlet() {
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

		System.out.println(">>addAnswersServlet");
		res.setHeader("Access-Control-Allow-Origin", "*");
		
		String[] answers = req.getParameterValues("answers");
		String[] rightAnswers = req.getParameterValues("rightAnswers");
		String questionId = req.getParameter("questionId");
		
		if(answers!=null)
			for(int i=0;i<answers.length;i++){
				System.out.println(answers[i]);
			}
		System.out.println(questionId);
	}

}
