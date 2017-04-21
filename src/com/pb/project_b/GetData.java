package com.pb.project_b;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetData extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetData() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println("Now get data for you");
		String dataString = "";
		FileDao fd = new FileDao();
		dataString = fd.readData();
		
		System.out.println(dataString);
		
		responseIt(response, dataString);
	}
	
	private void responseIt(HttpServletResponse response,String str) throws IOException{
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.write(str);
	}
}
