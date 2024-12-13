package _20010310038_Kubilay_Karakaya;

public class _20010310038_Tablo {
	public String [] StateNames;
	public String [] gAlfabe;
	public String [] gama;
	public String [] fonksiyon;
	public String [][] tablo;
	public String [] GecısAlfabe;
	public String head;
	public char  []input;
   int i=0;
   int column;
   int index=0;
   _20010310038_Machine machine=new _20010310038_Machine();
	
	public void TabloUzunluk()
	
	{
		this.tablo=new String [StateNames.length*gAlfabe.length][3];
	this. column=gAlfabe.length;
	
		
	}
	
	public void  Tablo()
	{
		
		for(int b=i;i<column;i++)
		{
			tablo[i][0] =  fonksiyon[0];
			tablo[i][1] = GecısAlfabe[index];
			tablo[i][2] = fonksiyon[index+1];
			index++;
			
			 
			if(index==gAlfabe.length) {
				index=0;
			}
			this.i=i;
		
		}
		
		column+=gAlfabe.length;
	
	}
	public void yazdır()
	{
		 for (int i = 0; i <StateNames.length*gAlfabe.length ; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tablo[i][j] + "\t");
	            }
	            System.out.println();
	        }
		
	}
	
	
}
