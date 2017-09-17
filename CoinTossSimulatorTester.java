// Name:Keng Lin
// USC NetID:kengl
// CS 455 PA1
// Fall 2017
import java.util.Calendar;
public class CoinTossSimulatorTester {
	public static void main(String[] args){
		Calendar calendar =Calendar.getInstance();
		int randomFactor=calendar.get(Calendar.SECOND);
		CoinTossSimulator test=new CoinTossSimulator(randomFactor);
		System.out.println("After constructor:");
		System.out.println("Number of trials [exp:0]:"+test.getNumTrials());
		System.out.println("Two-head tosses:"+test.getTwoHeads());
		System.out.println("Two-tail tosses:"+test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if(test.getNumTrials()==0) System.out.println("Tosses add up correctly? true");
		else System.out.println("Tosses add up correctly? false");
		//test.run(1)
		test.run(1);
		System.out.println("After run(1):");
		System.out.println("Number of trials [exp:1]:"+test.getNumTrials());
		System.out.println("Two-head tosses:"+test.getTwoHeads());
		System.out.println("Two-tail tosses:"+test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if(test.getNumTrials()==1) System.out.println("Tosses add up correctly? true");
		else System.out.println("Tosses add up correctly? false");
		//test.run(10)
		test.run(10);
		System.out.println("After run(10):");
		System.out.println("Number of trials [exp:11]:"+test.getNumTrials());
		System.out.println("Two-head tosses:"+test.getTwoHeads());
		System.out.println("Two-tail tosses:"+test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if(test.getNumTrials()==11) System.out.println("Tosses add up correctly? true");
		else System.out.println("Tosses add up correctly? false");
		//test.run(100)
		test.run(100);
		System.out.println("After run(100):");
		System.out.println("Number of trials [exp:111]:"+test.getNumTrials());
		System.out.println("Two-head tosses:"+test.getTwoHeads());
		System.out.println("Two-tail tosses:"+test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if(test.getNumTrials()==111) System.out.println("Tosses add up correctly? true");
		else System.out.println("Tosses add up correctly? false");
		//reset
		test.reset();
		System.out.println("After reset:");
		System.out.println("Number of trials [exp:0]:"+test.getNumTrials());
		System.out.println("Two-head tosses:"+test.getTwoHeads());
		System.out.println("Two-tail tosses:"+test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if(test.getNumTrials()==0) System.out.println("Tosses add up correctly? true");
		else System.out.println("Tosses add up correctly? false");
		//test.run(1000)
		test.run(1000);
		System.out.println("After run(1000):");
		System.out.println("Number of trials [exp:111]:"+test.getNumTrials());
		System.out.println("Two-head tosses:"+test.getTwoHeads());
		System.out.println("Two-tail tosses:"+test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if(test.getNumTrials()==1000) System.out.println("Tosses add up correctly? true");
		else System.out.println("Tosses add up correctly? false");
		
		
	}
}
