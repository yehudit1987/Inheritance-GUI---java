import javax.swing.JFrame;
public class Test {

	public static void main(String[] args) {
		JFrame window=new JFrame();
		MyPanel drawing = new MyPanel();
		window.add(drawing);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);
		drawing.createShapes();
		drawing.copyShapes();

	}

}
