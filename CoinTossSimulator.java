// Name:Keng Lin
// USC NetID:kengl
// CS 455 PA1
// Fall 2017
import java.util.Random;
/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {
	private int numOfTrials=0;
	private int randFactor;
	private int TwoHeads=0;
	private int TwoTails=0;
	private int HeadTails=0;

   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator(int r) {
	   randFactor=r;
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
	   int temp1=0;
	   int temp2=0;
	   Random rand=new Random(randFactor);
	   for (int i=0;i<numTrials;i++)
	   {
		   numOfTrials++;
		   temp1=rand.nextInt(2);
		   temp2=rand.nextInt(2);
		   if (temp1+temp2==2)
		   {
			   TwoHeads++;
		   }
		   else if (temp1+temp2==1)
		   {
			   HeadTails++;
		   }
		   else TwoTails++;		   		   
	   }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return this.numOfTrials; 
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return this.TwoHeads; 
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return this.TwoTails; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return this.HeadTails; 
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   	numOfTrials=0;
		TwoHeads=0;
		TwoTails=0;
		HeadTails=0;
   }

}
