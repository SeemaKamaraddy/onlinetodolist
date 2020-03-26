
package de.project.sample.onlinetodolist;
import java.util.*; 
import java.io.*;
import java.net.*;

class Main {  
  public static void main (String[] args) { 
    System.setProperty("http.agent", "Chrome");
    try { 
      URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
      try {
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String inputLine = null;
        int totalAgeElements = 0;
        StringBuilder sb = new StringBuilder();
        while( (inputLine=br.readLine()) != null) {
        	sb.append(inputLine);
        }
        String keyData = sb.substring("\"data\":\"\"".length(),sb.length()-2);
        String elements[] = keyData.split(",");
        for(int index=0;index<elements.length;index++) {
        	String key = elements[index];
        	String age = elements[++index];
        	int ageInt = Integer.parseInt(age.substring("age=".length()+1,age.length()));
        	if(ageInt>=50){
        		totalAgeElements++;
        	}
        	
        }
        System.out.println(totalAgeElements);
      } catch (IOException ioEx) {
        System.out.println(ioEx);
      }
    } catch (MalformedURLException malEx) {
      System.out.println(malEx);
    }
  }   
}