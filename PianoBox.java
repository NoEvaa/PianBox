package autopiano;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
public class MusicPlay {
	
	static int tim=200;
	static void driverp() {
		Runtime run=Runtime.getRuntime();
		try {
			Process process=run.exec("freepiano/freepiano.exe /k start");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void play_music() throws AWTException{
		File filer = new File("recor.txt");
		BufferedReader coread = null; 
        try {   
            coread = new BufferedReader(new FileReader(filer));  
            String tempStrin = null;   
            while ((tempStrin = coread.readLine()) != null) {   
            	if(tempStrin !=""){
            		String bob = tempStrin;           
            		int aa=Integer.parseInt(bob);
            		keypre(aa);
            		}   
            }  
            coread.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (coread != null) {  
                try { 
                	coread.close();                    
                } catch (IOException e1) {  
                }  
            }  
        }  
	}
	static void keypre(int aa) throws AWTException{
		Robot robot = new Robot();
		
        if(aa==3000) {
        	robot.delay(1000);
        	robot.keyPress(145);
        	robot.keyRelease(145);
        }
        else if(aa==2000) {
        	robot.delay(5000);
        	robot.keyPress(145);
        	robot.keyRelease(145);
		}
		else if(aa==1000) {
			robot.delay(tim);			
		}
		else if(aa<0) {
            aa = - aa;
            robot.keyRelease(aa);
        }
		else if(aa>=0&&aa<=1000) {
			robot.keyPress(aa);
		}
	}
	public static void main(String[] args) throws AWTException {
		JOptionPane.showMessageDialog( null,"欢迎使用皮安盒子，请确保您已经认真阅读过用户须知，您将对您使用该程序所产出的如何作品或问题负责！","welcome", JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog( null,"当前节拍时长为："+tim+"ms（注：此时长为一拍时长的1/4）","提示", JOptionPane.PLAIN_MESSAGE );
		JOptionPane  d_inpu = new JOptionPane();
   	     String str = d_inpu.showInputDialog(null, "时长修改：请输入50-2000内的整数，如不修改请输入200");
   	    try {
   		 int numb = Integer.parseInt( str );
   		 if(numb>=50&&numb<=2000) {tim=numb;JOptionPane.showMessageDialog( null,"节拍时长设定成功，点击确定开始弹奏，弹奏期间请勿操作电脑！！","警告", JOptionPane.PLAIN_MESSAGE );}
   		 else{JOptionPane.showMessageDialog( null,"输入数值超出给定范围，时长修改失败，程序终止","警告", JOptionPane.PLAIN_MESSAGE );System.exit(0);}
   		 }catch(NumberFormatException ex) {
   		 JOptionPane.showMessageDialog( null,"异常错误，程序终止","警告", JOptionPane.PLAIN_MESSAGE );
   		  System.exit(0);
   		 //NoEvaa 
   		 };     
		driverp();		
		play_music();
		JOptionPane.showMessageDialog( null,"乐曲弹奏完毕，感谢您的使用，记得保存您的音乐哦~","皮安盒子", JOptionPane.PLAIN_MESSAGE );
	
 }

}