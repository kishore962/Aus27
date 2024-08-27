package org.one;
import java.io.*;
import java.util.*;

import org.apache.commons.io.FileUtils;


public class FileOperationOne {
	public static void main(String[] args)throws IOException{
		File k =new File("D:\\tm\\java\\java1\\file1.txt");
	        boolean mkdir = k.mkdir();
	        System.out.println(mkdir);
	        boolean mkdirs = k.mkdirs();
	    System.out.println(mkdirs);
	        boolean newFile = k.createNewFile();
	        System.out.println(newFile);
	        boolean canRead = k.canRead();
	        System.out.println(canRead);
	        boolean canWrite = k.canWrite();
	        System.out.println(canWrite);
	        boolean canExecute = k.canExecute();
	        System.out.println(canExecute);
	        boolean exists = k.exists();
	        System.out.println(exists);
	        try {
	        	String[] list = k.list();
		        for (String string : list) {
					System.out.println(string);
					
				}
		        File[] listFiles = k.listFiles();
		        for (File file : listFiles) {
		        	System.out.println(file);
	        	
		        }
	        }
		        catch(NullPointerException e) {
		        	System.out.println(e.getMessage());
		        
		        }
		        
	        FileUtils.write(k,"hello");
	        List<String> readlines = FileUtils.readLines(k);
	        for (String u: readlines) {
	        	System.out.println(u);
				
			}
	        
	        
	       
		
	}
		
	}
	        
			
		
		
		
		





