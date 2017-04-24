package com.pb.project_a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
		
		String[] answers = req.getParameter("answers").split(",");
		String[] rightAnswers = req.getParameter("rightAnswers").split(",");
		String questionId = req.getParameter("questionId");
		
		SessionFactory sf = HibernateSessionFactory.getSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		if(answers!=null)
			for(int i=0;i<answers.length;i++){
				Answer a = new Answer(answers[i],questionId);
				session.save(a);
				
			}
		if(rightAnswers!=null)
			for(int i=0;i<rightAnswers.length;i++){
				RightAnswer a = new RightAnswer(rightAnswers[i],questionId);
				session.save(a);
			}
		
		session.getTransaction().commit();
		session.close();
		
		
		System.out.println(questionId);
	}

}
