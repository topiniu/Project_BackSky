package com.pb.all;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Topiniu {

	public static void responseIt(HttpServletResponse response,String str) throws IOException{
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.write(str);
	}
}
