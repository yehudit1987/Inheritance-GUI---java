import java.awt.*;
//this class creates lines
public class MyLine extends MyShape
{
private static final int POW=2;

//constructor gets parameters to initialize line
public MyLine(int a, int b, int c, int d, Color col)
{
	super(a,b,c,d,col);
}
 //this method gets other line and return true if the new line has the same length of the exists line
public boolean equals(MyLine line)
{
	int t1, z1, t2, z2;
	//getting points of new line
	t1=line.getX1();
	z1=line.getY1();
	t2=line.getX2();
	z2=line.getY2();
	double length1, length2, pow1, pow2;
	pow1=Math.pow(this.getX1()-this.getX2(), POW);
	pow2=Math.pow(this.getY1()-this.getY2(), POW);
	length1=Math.sqrt(pow1+pow2);//length of exist line
	pow1=Math.pow(t1-t2, POW);
	pow2=Math.pow(z1-z2, POW);
	length2=Math.sqrt(pow1+pow2);//length of new line
	if (length1==length2)
		return true; 
	else 
		return false;
}
public void drawShape(Graphics g)
{
	g.setColor(this.getColor());
	g.drawLine(this.getX1(), this.getY1(), this.getX2(), this.getY2());
}

}//end of class
