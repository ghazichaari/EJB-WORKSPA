package com.esprit.Traducteur.log;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Logger {

	OutputStream fos;
	
	public Logger() {
		
		
	
		
	}
	
	public void info(String message){
		
		try {
			
			String tempDir=System.getenv("temp");
			fos=
					new FileOutputStream(new File(tempDir+"/log.txt"),true);
			
			Calendar calendar
			=Calendar.getInstance();

			Date now=calendar.getTime();
			
			
			SimpleDateFormat sdf=
					new SimpleDateFormat("dd:MM:yyyy/hh:mm:ss");
			
			String formattedDate=sdf.format(now);
			
			fos.write(("\n INFO: "+formattedDate+" :"+message).getBytes());
			
			
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
