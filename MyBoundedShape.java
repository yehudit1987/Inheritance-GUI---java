import java.awt.*;
//this class creates bounded shapes such as ovals or rectangle
public abstract class MyBoundedShape extends MyShape
{
	//properties
	private boolean full;
	//constructor gets parameters to initialize shape
	public MyBoundedShape(int a, int b, int c, int d, Color col, boolean f)
	{
		super (a, b, c, d, col);
		this.full=f;
	}
	 //this method gets other shape and return true if the new shape has the same width and height as the exist shape
	public boolean equals(MyBoundedShape shape)
	 {
		 int width, height; 
		 width=shape.getX2();
		 height=shape.getY2();
		 if (this.getX2()==width && this.getY2()==height)
			 return true; 
		 else
			 return false; 
	 }
	//getters & setters
	public boolean getFull()
	{
		return this.full;
	}
	public void setFull(boolean full) {
		this.full=full;
	}
	//change status of full property to the opposite status
	public void changeFull()
	{
		if (this.full==true)
			setFull(false);
		else
			setFull(true);
	}
	public abstract void drawShape(Graphics g);
}//end of class
