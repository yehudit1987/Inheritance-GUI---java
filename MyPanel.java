import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class MyPanel extends JPanel
{
	//**************************************properties**************************************
	final int NUM =200; 
	ArrayList <MyShape> shapes;
	ArrayList <MyShape> copyShapes;
	Random rand=new Random();
	int red, blue, green;
	Color color;
	MyShape shape;
	MyLine copyLine;
	MyRectangle copyRect;
	MyOval copyOval;
	
	//*****************************************constructor*************************************
	public MyPanel()
	{
		shapes=new ArrayList <MyShape>();
		copyShapes=new ArrayList <MyShape>();
	}
	
	//*****************************************methods******************************************
	
	//create 2shapes of each type
	public void createShapes()
	{
		for (int i=0; i<6; i++)
		{
			red=rand.nextInt(256);
			blue=rand.nextInt(256);
			green=rand.nextInt(256);
			color=new Color(red, blue, green);
			if(i<2)
				{
				shape=new MyLine (rand.nextInt(NUM), rand.nextInt(NUM), rand.nextInt(NUM), rand.nextInt(NUM), color);
				shapes.add(shape);		
				}
			else if (i>=2 && i<4)
			{
				shape=new MyRectangle (rand.nextInt(NUM), rand.nextInt(NUM), rand.nextInt(NUM), rand.nextInt(NUM), color, true);
				shapes.add(shape);	
				}
			else if (i>=4 && i<6)
			{
				shape=new MyOval (rand.nextInt(NUM), rand.nextInt(NUM), rand.nextInt(NUM), rand.nextInt(NUM), color, false);
				shapes.add(shape);	
			}
		}
	}
	//this method copy shapes, move thie start point and changes full property status
	public void copyShapes()
	{
		for(int i=0; i<6; i++)
		{
			try {
				if(shapes.get(i) instanceof MyLine)
				{
					copyLine=(MyLine) shapes.get(i).clone();
					copyLine.move();
					copyShapes.add(copyLine);
				}
				else if (shapes.get(i) instanceof MyRectangle)
				{
					copyRect=(MyRectangle) shapes.get(i).clone();
					copyRect.move();
					copyRect.changeFull();
					copyShapes.add(copyRect);
				}
				else if (shapes.get(i) instanceof MyOval)
				{
					copyOval=(MyOval) shapes.get(i).clone();
					copyOval.move();
					copyOval.changeFull();
					copyShapes.add(copyOval);
				}
			}catch (CloneNotSupportedException c) {
				
			}
		}
			
	}
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		for (MyShape sh: shapes)
		sh.drawShape(g);
		for (MyShape csh: copyShapes)
			csh.drawShape(g);
	}
	
	
}
