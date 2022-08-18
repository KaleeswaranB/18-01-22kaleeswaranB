package com.filhandling.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;  
public class readlinebyline  
{  
public static void main(String args[])  
{  
	FileReader in=null;
try  
{  
  
	in=new FileReader("text.txt");
  BufferedReader br=new BufferedReader(in);   
  StringBuffer sb=new StringBuffer();      
  String line;  
  while((line=br.readLine())!=null)  
  {  
  sb.append(line); 
  sb.append("\n"); 
  }  
  in.close(); 
  System.out.println("Contents of File: ");  
  System.out.println(sb.toString());
  }  
  catch(IOException e)  
  {  
  e.printStackTrace();  
  }  
  } 
}