package com.test.restapi.services.file;

import java.io.File;
import java.io.FileOutputStream;

public class FileBasicTest {
    
    public static void main(String[] args){
        File orgFlile = new File("D:\\temp\\test.txt");   

        try{  
            System.out.println("Absolute Path=" + orgFlile.getAbsolutePath());
            System.out.println("Name=" + orgFlile.getName());
            System.out.println("Path=" + orgFlile.getPath());
            System.out.println("Free Space=" + orgFlile.getFreeSpace());
            System.out.println("Canonical Path=" + orgFlile.getCanonicalPath());   
            System.out.println("Parent=" + orgFlile.getParent());   
            System.out.println("Parent File=" + orgFlile.getParentFile());   

            if(orgFlile.exists()){  
                System.out.println("File exists");      
            } else {   
                System.out.println("File does not exists");      
            }

            FileOutputStream outStream = new FileOutputStream(orgFlile); 

        } catch(Exception e) {
            e.printStackTrace();  
        }

    }
}
