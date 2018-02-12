import java.awt.*;
public abstract class MyShape implements Cloneable
{
	//****************************properties****************************************
private int x1;
private int y1;
private int x2;
private int y2;
private Color color;
MyShape shape;

//*************************constructors***************************************
public MyShape(int a, int b, int c, int d, Color col)
{
	this.x1=a;
	this.y1=b;
	this.x2=c;
	this.y2=d;
	this.color=col;

}

//****************************methods**************************************

public abstract void drawShape(Graphics g);
//clone object and create new points
public Object clone() throws CloneNotSupportedException 
{
	try {
		return (MyShape) super.clone();
	}catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return this;
	}
//getters & setters
public int getX1(){
	return x1;
}
public int getY1(){
	return y1;
}
public int getX2(){
	return x2;
}
public int getY2(){
	return y2;
}
public Color getColor(){
	return color;
}
public void setX1(int a){
	this.x1=a;
}
public void setY1(int b){
	this.y1=b;
}
public void setX2(int c){
	this.x2=c;
}
public void setY2(int d){
	this.y2=d;
}
public void setColor (Color col){
	this.color=col;
}
//moving start point of shape 10 pixels right and down
public void move() {
	setX1(this.x1+10);
	setY1(this.y1+10);
	
}
}
