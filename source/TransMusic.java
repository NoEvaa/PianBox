package autopiano;
import java.awt.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane; 


class Iptmatch{
	String idd;
	int codee;
	String keyy;
	public Iptmatch()
    {
       super();
    }

    public Iptmatch(String name, int vk) 
    {
       super();
       this.idd = name;
       this.codee = vk;
    }
    public void setkeyy(String keyy) 
    {
        this.keyy = keyy;
    }

}
public class TransMusic {
	static void keyyget() {
		File file = new File("freepiano/keymap/freepiano.map");
		BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            int reco = 0;
            while ((tempString = reader.readLine()) != null) {
            	if(line<9) {line++;continue;}
            	else {
            		String pattern = ".*In_7.*";            	 
                    boolean isMatch = Pattern.matches(pattern, tempString);
            	    if(isMatch) {line++;continue;}
            	    else {           	    	
            	    	String patternn = "Keydown	([^\\\\v]*)	Note	In_\\d	([^\\\\v]*)";
            	    	Pattern r = Pattern.compile(patternn);
            	    	Matcher m = r.matcher( tempString);
            	        if (m.find( )) {
            	        	String iddd=m.group(1);
            	        	String keyyy=m.group(2);
            	        	if(iddd.equals(keylist[reco].idd)) {
            	        	keylist[reco].setkeyy(keyyy);          	        	
            	        	reco++;}
            	        	else {reco+=2;}
            	        }
            	    	
                        line++;
            	    }
                
            	}
            	
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
	}
	static void writtxt() {
		try {			
	         BufferedWriter out = new BufferedWriter(new FileWriter("recor.txt"));	         
	 		 BufferedReader rea = new BufferedReader(new FileReader("NoEv.txt"));
	             String tempStr = null;
	             String af1="0",af2="0",af3="0",af4="0",af5="0";
	             String bf1,bf2,bf3,bf4,bf5;
	             out.write(Integer.toString(2000));
	             while ((tempStr = rea.readLine()) != null) {
	            	    String[] split = tempStr.split(" ");
	             	    bf1=split[0];
	             	    bf2=split[1];
	             	    bf3=split[2];
	             	    bf4=split[3];
	             	    bf5=split[4];
	             	    if(bf1.equals("0")) {
	             	    	if(!af1.equals("0")) {
	             	    		af1="-"+af1;
	             	    		out.write("\r\n");
	             	    		out.write(af1);	             	    		
	             	    		af1=bf1;	             	    		
	             	    	}
	             	    }else if(bf1.equals("-")) {
	             	    	bf1="0";
	             	    }else {
	             	    	boolean booo=false;
	             	    	for(int i=0;i<62;i++) {
	             	    	 if(bf1.equals(keylist[i].keyy))
	             	    	  {bf1=Integer.toString(keylist[i].codee);booo=true;break;}
	             	    	}
	             	    	 if(booo) {
	             	    		 if(af1.equals("0")) {
	             	    			out.write("\r\n");
		             	    		out.write(bf1);	             	    		
		             	    		af1=bf1;
	             	    		 }else {
	             	    			af1="-"+af1;
		             	    		out.write("\r\n");
		             	    		out.write(af1);
		             	    		out.write("\r\n");
		             	    		out.write(bf1);
		             	    		af1=bf1;
	             	    		 }
	             	    	 }	             	        	             	    	
	             	    }
	             	    
	             	    
	             	   if(bf2.equals("0")) {
	             	    	if(!af2.equals("0")) {
	             	    		af2="-"+af2;
	             	    		out.write("\r\n");
	             	    		out.write(af2);	             	    		
	             	    		af2=bf2;	             	    		
	             	    	}
	             	    }else if(bf2.equals("-")) {
	             	    	bf2="0";
	             	    }else {
	             	    	boolean booo=false;
	             	    	for(int i=0;i<62;i++) {
	             	    	 if(bf2.equals(keylist[i].keyy))
	             	    	  {bf2=Integer.toString(keylist[i].codee);booo=true;break;}}
	             	    	 if(booo) {
	             	    		 if(af2.equals("0")) {
	             	    			out.write("\r\n");
		             	    		out.write(bf2);	             	    		
		             	    		af2=bf2;
	             	    		 }else {
	             	    			af2="-"+af2;
		             	    		out.write("\r\n");
		             	    		out.write(af2);
		             	    		out.write("\r\n");
		             	    		out.write(bf2);
		             	    		af2=bf2;
	             	    		 }
	             	    	 }	             	        	             	    	
	             	    }
	             	   
	             	  if(bf3.equals("0")) {
	             	    	if(!af3.equals("0")) {
	             	    		af3="-"+af3;
	             	    		out.write("\r\n");
	             	    		out.write(af3);	             	    		
	             	    		af3=bf3;	             	    		
	             	    	}
	             	    }else if(bf3.equals("-")) {
	             	    	bf3="0";
	             	    }else {
	             	    	boolean booo=false;
	             	    	for(int i=0;i<62;i++) {
	             	    	 if(bf3.equals(keylist[i].keyy))
	             	    	  {bf3=Integer.toString(keylist[i].codee);booo=true;break;}}
	             	    	 if(booo) {
	             	    		 if(af3.equals("0")) {
	             	    			out.write("\r\n");
		             	    		out.write(bf3);	             	    		
		             	    		af3=bf3;
	             	    		 }else {
	             	    			af3="-"+af3;
		             	    		out.write("\r\n");
		             	    		out.write(af3);
		             	    		out.write("\r\n");
		             	    		out.write(bf3);
		             	    		af3=bf3;
	             	    		 }
	             	    	 }	             	        
	             	    	
	             	    }
	             	  
	             	 if(bf4.equals("0")) {
	             	    	if(!af4.equals("0")) {
	             	    		af4="-"+af4;
	             	    		out.write("\r\n");
	             	    		out.write(af4);	             	    		
	             	    		af4=bf4;	             	    		
	             	    	}
	             	    }else if(bf4.equals("-")) {
	             	    	bf4="0";
	             	    }else {
	             	    	boolean booo=false;
	             	    	for(int i=0;i<62;i++) {
	             	    	 if(bf4.equals(keylist[i].keyy))
	             	    	  {bf4=Integer.toString(keylist[i].codee);booo=true;break;}}
	             	    	 if(booo) {
	             	    		 if(af4.equals("0")) {
	             	    			out.write("\r\n");
		             	    		out.write(bf4);	             	    		
		             	    		af4=bf4;
	             	    		 }else {
	             	    			af4="-"+af4;
		             	    		out.write("\r\n");
		             	    		out.write(af4);
		             	    		out.write("\r\n");
		             	    		out.write(bf4);
		             	    		af4=bf4;
	             	    		 }
	             	    	 }	             	        	             	    	
	             	    }
	             	 
	             	if(bf5.equals("0")) {
             	    	if(!af5.equals("0")) {
             	    		af5="-"+af5;
             	    		out.write("\r\n");
             	    		out.write(af5);	             	    		
             	    		af5=bf5;	             	    		
             	    	}
             	    }else if(bf5.equals("-")) {
             	    	bf5="0";
             	    }else {
             	    	boolean booo=false;
             	    	for(int i=0;i<62;i++) {
             	    	 if(bf5.equals(keylist[i].keyy))
             	    	  {bf5=Integer.toString(keylist[i].codee);booo=true;break;}}
             	    	 if(booo) {
             	    		 if(af5.equals("0")) {
             	    			out.write("\r\n");
	             	    		out.write(bf5);	             	    		
	             	    		af5=bf5;
             	    		 }else {
             	    			af5="-"+af5;
	             	    		out.write("\r\n");
	             	    		out.write(af5);
	             	    		out.write("\r\n");
	             	    		out.write(bf5);
	             	    		af5=bf5;
             	    		 }
             	    	 }
             	        
             	    	
             	    }	             		             	    	
	             	out.write("\r\n");
     	    		out.write(Integer.toString(1000));	             	        	         	        	
	             	        	
	             }
	             if(!af1.equals("0")) {
      	    		af1="-"+af1;
      	    		out.write("\r\n");
      	    		out.write(af1);	             	    		
      	    		af1="0";	             	    		
      	    	}
	             if(!af2.equals("0")) {
	      	    		af2="-"+af2;
	      	    		out.write("\r\n");
	      	    		out.write(af2);	             	    		
	      	    		af2="0";	             	    		
	      	    	}
	             if(!af3.equals("0")) {
      	    		af3="-"+af3;
      	    		out.write("\r\n");
      	    		out.write(af3);	             	    		
      	    		af3="0";	             	    		
      	    	}
	             if(!af4.equals("0")) {
	      	    		af4="-"+af4;
	      	    		out.write("\r\n");
	      	    		out.write(af4);	             	    		
	      	    		af4="0";	             	    		
	      	    	}
	             if(!af5.equals("0")) {
	      	    		af5="-"+af5;
	      	    		out.write("\r\n");
	      	    		out.write(af5);	             	    		
	      	    		af5="0";	             	    		
	      	    	}
	             out.write("\r\n");
	        	 out.write(Integer.toString(3000));
	        	 
	         
	         rea.close();
	         out.close();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	
	}
	static Iptmatch[] keylist = new Iptmatch[62];
	public static void main(String[] args) throws AWTException {
		keylist[0] = new Iptmatch("~", 192);
		keylist[1] = new Iptmatch("1", 49);
		keylist[2] = new Iptmatch("2", 50);
		keylist[3] = new Iptmatch("3", 51);
		keylist[4] = new Iptmatch("4", 52);
		keylist[5] = new Iptmatch("5", 53);
		keylist[6] = new Iptmatch("6", 54);
		keylist[7] = new Iptmatch("7", 55);
		keylist[8] = new Iptmatch("8", 56);
		keylist[9] = new Iptmatch("9", 57);
		keylist[10] = new Iptmatch("0", 48);
		keylist[11] = new Iptmatch("-", 45);
		keylist[12] = new Iptmatch("Backspace", 8);
		keylist[13] = new Iptmatch("Tab", 9);
		keylist[14] = new Iptmatch("Q", 81);
		keylist[15] = new Iptmatch("W", 87);
		keylist[16] = new Iptmatch("E", 69);
		keylist[17] = new Iptmatch("R", 82);
		keylist[18] = new Iptmatch("T", 84);
		keylist[19] = new Iptmatch("Y", 89);
		keylist[20] = new Iptmatch("U", 85);
		keylist[21] = new Iptmatch("I", 73);
		keylist[22] = new Iptmatch("O", 79);
		keylist[23] = new Iptmatch("P", 80);
		keylist[24] = new Iptmatch("A", 65);
		keylist[25] = new Iptmatch("S", 83);
		keylist[26] = new Iptmatch("D", 68);
		keylist[27] = new Iptmatch("F", 70);
		keylist[28] = new Iptmatch("G", 71);
		keylist[29] = new Iptmatch("H", 72);
		keylist[30] = new Iptmatch("J", 74);
		keylist[31] = new Iptmatch("K", 75);
		keylist[32] = new Iptmatch("L", 76);
		keylist[33] = new Iptmatch("Enter", 10);
		keylist[34] = new Iptmatch("Shift", 16);
		keylist[35] = new Iptmatch("Z", 90);
		keylist[36] = new Iptmatch("X", 88);
		keylist[37] = new Iptmatch("C", 67);
		keylist[38] = new Iptmatch("V", 86);
		keylist[39] = new Iptmatch("B", 66);
		keylist[40] = new Iptmatch("N", 78);
		keylist[41] = new Iptmatch("M", 77);
		keylist[42] = new Iptmatch("<", 44);
		keylist[43] = new Iptmatch(">", 46);
		keylist[44] = new Iptmatch("?", 47);
		keylist[45] = new Iptmatch("Space", 32);
		keylist[46] = new Iptmatch("NumLock", 114);
		keylist[47] = new Iptmatch("Num/", 111);
		keylist[48] = new Iptmatch("Num*", 106);
		keylist[49] = new Iptmatch("Num-", 109);
		keylist[50] = new Iptmatch("Num7", 103);
		keylist[51] = new Iptmatch("Num8", 104);
		keylist[52] = new Iptmatch("Num9", 105);
		keylist[53] = new Iptmatch("Num+", 107);
		keylist[54] = new Iptmatch("Num4", 100);
		keylist[55] = new Iptmatch("Num5", 101);
		keylist[56] = new Iptmatch("Num6", 102);
		keylist[57] = new Iptmatch("Num1", 97);
		keylist[58] = new Iptmatch("Num2", 98);
		keylist[59] = new Iptmatch("Num3", 99);
		keylist[60] = new Iptmatch("Num0", 96);
		keylist[61] = new Iptmatch("Num.", 110);
		keyyget();
		writtxt();
		JOptionPane.showMessageDialog(null, "曲谱解析完成 !" );
        System.exit(0);
		
	}

}