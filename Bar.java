// Name:Keng Lin
// USC NetID:kengl
// CS 455 PA1
// Fall 2017

// we included the import statements for you
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
   private int bot;
   private int lef;
   private int wid;
   private int barH;
   private double sca;
   private Color col;
   private String lab;


   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   public Bar(int bottom, int left, int width, int barHeight,
              double scale, Color color, String label) {
	   bot=bottom;
	   lef=left;
	   wid=width;
	   barH=barHeight;
	   sca=scale;
	   col=color;
	   lab=label;
   }
   
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
	   g2.setColor(this.col);
	   Rectangle rect=new Rectangle(lef,bot,wid,(int)sca);
	   g2.draw(rect);
	   g2.fill(rect);
	   int strlength = g2.getFontMetrics().stringWidth(lab);
	   g2.setColor(Color.black);
	   g2.drawString(lab,lef-strlength/3+15,bot+(int)sca+20);
   }
}
