package com.pb.project_b;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pb.all.Topiniu;

public class WriteData extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public WriteData() {
		super();
	}

//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("This is init method");
//		new FileDao().writeData("���˼�," +
//				"�ǽ���,ɰ����,����С��," +
//				"ɽ��������,��ζ������,����," +
//				"һ����,�������,�������׷�," +
//				"��ʽ����,���巹,���켦����," +
//				"���Ǵ��̼�,����," +
//				"С���,��תС���,����������С��," +
//				"��������,��ʽ���ⷹ,�����," +
//				"��ζ����,������,һ�ŷ���,�������," +
//				"������,����������ʳ,�����߹�," +
//				"���з�,���ʡ��лл,");
//	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setHeader("Access-Control-Allow-Origin", "*");
		FileDao fd = new FileDao();
		
		String data = request.getParameter("data");
		System.out.println(data);
		fd.writeData(data);
		
		new Topiniu().responseIt(response, "Data has been saved");
	}
	

	
}
