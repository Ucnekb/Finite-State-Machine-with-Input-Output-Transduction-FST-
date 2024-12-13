package _20010310038_Kubilay_Karakaya;

import java.util.Scanner;

public class _20010310038_FST {
	public Scanner scanner;
	 _20010310038_Tablo   tablo=new _20010310038_Tablo();
	 _20010310038_Machine   machine=new _20010310038_Machine();
	 public _20010310038_FST(Scanner scanner)
	 {
		 this.scanner=scanner;
		 
		 
		 okuma();	 
	 }
	 
	 public void okuma()
	 { 
		 String qData = "";
		  while (scanner.hasNextLine()) {
              String line = scanner.nextLine();
              if (line.contains("Q = {")  ) {
                  qData = line;
                  qData = qData.substring(qData.indexOf("{") + 1, qData.indexOf("}"));
                  String[] qValues = qData.split(", ");
                  String[] qArray = qValues;
                  tablo.StateNames=qValues;
                
                  
              }
              
              if (line.contains("Σ = {")|| line.contains("Î£ = {") ) {
                  String sigmaData = line;
                  if (sigmaData != null) {
                      sigmaData = sigmaData.substring(sigmaData.indexOf("{") + 1, sigmaData.indexOf("}"));
                      String[] sigmaValues = sigmaData.split(", ");
                      String[] sigmaArray = sigmaValues;
                      tablo.gAlfabe=sigmaValues;  
                      
              }}
              if (line.contains("Γ = {")|| line.contains("Î“ = {") ) {
                  String gamaData = line;
                  if (gamaData != null) {
                  	gamaData = gamaData.substring(gamaData.indexOf("{") + 1, gamaData.indexOf("}"));
                      String[] gamaValues = gamaData.split(", ");
                      String[] gamaArray = gamaValues;
                      tablo.GecısAlfabe=gamaArray;
                      tablo.TabloUzunluk();
              }}
              
              if (line.trim().startsWith("δ") || line.trim().startsWith("Î´") ) {
                  String[] veriler = line.trim().split("\\s+");
                  String[] istenenVeriler = new String[veriler.length - 1];
                  for (int i = 1; i < veriler.length; i++) {
                      istenenVeriler[i - 1] = veriler[i];
                  }
                  tablo.GecısAlfabe=istenenVeriler;
                  
              }
              
              
              int uzunluk=tablo.StateNames.length;
              for(int i=0; i<uzunluk;i++) {
            	   String isimler =tablo.StateNames[i];
            	   if(line.startsWith(isimler)){
                   	String[] partss = line.split("\t");
                   tablo.fonksiyon=partss;
                    
                   tablo.Tablo();
                   
              }
              }
              
              if (line.startsWith("q0 = ")) {
                 
                  String[] parts = line.split("=");
               
                   String   q1Value = parts[1].trim();
                   tablo.head=q1Value;
                   
         
                      break;
                //  }
              }
              
              
              
              
		  
	 }
		  
		  
		 
		  scanner.close();
		 // tablo.yazdır();
		  machine.tablo=tablo.tablo;
		  machine.head=tablo.head;
		// tablo.yazdır();
		  
		 
		  
		  	 
	 }
	 public void kullanıcı(String input) {
		 char[] charArray = input.toCharArray();
		 machine.input=charArray;
		 machine.start(tablo.head);
		
	
		 
	 }
}
