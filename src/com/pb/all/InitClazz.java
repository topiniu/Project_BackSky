package com.pb.all;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitClazz implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		new FileDao().writeData("���˼�," +
				"�ǽ���,ɰ����,����С��," +
				"ɽ��������,��ζ������,����," +
				"һ����,�������,�������׷�," +
				"��ʽ����,���巹,���켦����," +
				"���Ǵ��̼�,����," +
				"С���,��תС���,����������С��," +
				"��������,��ʽ���ⷹ,�����," +
				"��ζ����,������,һ�ŷ���,�������," +
				"������,����������ʳ,�����߹�," +
				"���з�,���ʡ��лл");
		
	}

}
