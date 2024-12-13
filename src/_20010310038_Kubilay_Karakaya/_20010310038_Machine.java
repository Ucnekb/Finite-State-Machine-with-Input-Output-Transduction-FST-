	package _20010310038_Kubilay_Karakaya;

public class _20010310038_Machine
{
	public char  []input;
	public 	String head;
	public  String [][] tablo;

	
	
	 public static String[] cozumleVeri(String veri) 
	 	{
	       
	        String[] parcalar = veri.substring(1, veri.length() - 1).split(", ");
	        
	        return parcalar;
	    }
	 
	 
	 public void start(String headd) 
	 {
		 String durum =headd + " ";
		 String çıktı=" ";
		 System.out.println();
		 for(int i=0;i<input.length;i++)
		   {
			 
			   
			   for(int j=0;j<tablo.length;j++) 
			   {
				  
				  
				   
				   if (tablo[j][0].equals(head) && tablo[j][1].charAt(0) == input[i] ) 
				   {
					   
					   String a = tablo[j][2];
						   String [] son =cozumleVeri(a);					   					  
						   this.head=son[0];
						  durum+= head +",";					   
						  çıktı+= " " +son[1];
						
						  break;		   
		        }
		      }
			   
		    }
		 cıktı(çıktı,durum);
	 	}
	 public void  cıktı(String çıktı, String durum)
	 {
		 
	            System.out.println("çıktı: " + çıktı);
	            System.out.println("durum : " + durum);
			  
	 }
	 
	 public void yazdır()
		{
			 for (int i = 0; i <16 ; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(tablo[i][j] + "\t");
		            }
		            System.out.println();
		        }
			
		}
	 

}

