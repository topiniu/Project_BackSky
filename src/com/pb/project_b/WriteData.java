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
//		new FileDao().writeData("黄焖鸡," +
//				"盖浇饭,砂锅面,麻辣小面," +
//				"山西刀削面,御味烤鸡饭,饺子," +
//				"一升米,麻辣香锅,好运来米饭," +
//				"港式烧腊,铁板饭,重庆鸡公煲," +
//				"老狼大盘鸡,大火锅," +
//				"小火锅,旋转小火锅,包子与其他小吃," +
//				"黄焖茄子,韩式烤肉饭,鱼粉面," +
//				"三味泡馍,麻辣烫,一号饭堂,民族餐厅," +
//				"麻辣串,超市里面零食,江西瓦罐," +
//				"煲仔饭,这顿省了谢谢,");
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
