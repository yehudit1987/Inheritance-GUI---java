import java.awt.*;

public class MyOval extends MyBoundedShape
{
	//constructor
	public MyOval(int a, int b, int c, int d, Color col, boolean f)
	{
		super (a,b,c,d,col,f);
	}
	
	public void drawShape(Graphics g)
	{
		g.setColor(this.getColor());
		if(this.getFull()==true)
			g.fillOval(this.getX1(), this.getY1(), this.getX2(), this.getY2());
		else
			g.drawOval(this.getX1(), this.getY1(), this.getX2(), this.getY2());

	}
}
