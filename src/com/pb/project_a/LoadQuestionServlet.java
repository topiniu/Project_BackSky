package com.pb.project_a;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LoadQuestionServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoadQuestionServlet() {
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
		SessionFactory sf = HibernateSessionFactory.getSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Question");
		
		List<Question> list = query.list();
		
		System.out.println("question isze:"+list.size());

		res.setHeader("Access-Control-Allow-Origin", "*");
		
	}
}
