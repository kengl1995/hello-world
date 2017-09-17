// Name:Keng Lin
// USC NetID:kengl
// CS 455 PA1
// Fall 2017
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class CoinSimComponent extends JComponent{
	private int temp;
	private int ranFactor;
	public CoinSimComponent(int t,int r)
	{
		this.temp=t;
		ranFactor=r;
	}
	
	public void paintComponent(Graphics g)
	{
		
		CoinTossSimulator PA1=new CoinTossSimulator(ranFactor);
		PA1.run(temp);
		double per2=(float)PA1.getTwoHeads()/PA1.getNumTrials();
		double per1=(float)PA1.getHeadTails()/PA1.getNumTrials();
		double per0=(float)PA1.getTwoTails()/PA1.getNumTrials();
		int barH2=PA1.getTwoHeads();
		int barH1=PA1.getHeadTails();
		int barH0=PA1.getTwoTails();
		int h2=(int)(500.0*per2);
		int h1=(int)(500.0*per1);
		int h0=(int)(500.0*per0);
		Graphics2D g2=(Graphics2D) g;
		int h=getHeight();
		int w=getWidth();
		int wid=60;
		Bar box2 = new Bar(h-50-h2,(int)(w-wid*3)/4,wid,barH2,h2,Color.red,"Two Heads: "+barH2+"("+(int)(100.0*per2)+"%)");
		box2.draw(g2);
		Bar box1 = new Bar(h-50-h1,(int)((w-wid*3)/2+wid),wid,barH1,h1,Color.green,"A Heads and a Tail: "+barH1+"("+(int)(100.0*per1)+"%)");
		box1.draw(g2);
		Bar box0 = new Bar(h-50-h0,(int)(3*(w-wid*3)/4+2*wid),wid,barH0,h0,Color.blue,"Two Tails:: "+barH0+"("+(int)(100.0*per0)+"%)");
		box0.draw(g2);
		String label = "Hello, world!";   // suppose this is the label you want to display
		Font font = g2.getFont();
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D labelBounds = font.getStringBounds(label, context);
		double widthOfLabel = labelBounds.getWidth();
		double heightOfLabel = labelBounds.getHeight();
	}
}
