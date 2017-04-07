package com.pb.all;

import java.io.*;

public class FileDao {
	public void writeData(String dataString) {		
		try {
			File file = new File("data.txt");
			
			if(file.exists())
				file.delete();
			
			file.createNewFile();
			

			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			
			
			bw.write(dataString);
			
			bw.flush();
			bw.close();
			writer.close();
			
			System.out.println("data.txt has been saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String readData(){

		try {
			File file = new File("data.txt");
			String dataString = "";
			if(!file.exists()){
				return null;
			}else{
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String line = null;
				while((line=br.readLine())!=null){
					dataString += line;
					dataString += ",";
				}
				
				br.close();
				fr.close();
			}
			
			return dataString;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
//	public static void main(String[] args) {
//		new FileDao().writeData("what???");
//	}
}
