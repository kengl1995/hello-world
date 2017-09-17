// Name:Keng Lin
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JFrame;
public class CoinSimViewer {
	public static void main(String[] args){
		Calendar calendar =Calendar.getInstance();
		int randomFactor=calendar.get(Calendar.SECOND);
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of trials:");
		int temp=-1;
		while (temp<=0)
		{
			temp=in.nextInt();
			if (temp<=0){ 
				System.out.println("ERROR: Number entered must be greater than 0.");
				System.out.println("Enter number of trials:");
			}
		}
		JFrame frame=new JFrame();
		frame.setSize(800, 500);
		frame.setTitle("CoinSim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CoinSimComponent component = new CoinSimComponent(temp,randomFactor);
		frame.add(component);
		frame.setVisible(true);
	}
}
