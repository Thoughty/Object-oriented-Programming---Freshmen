import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Drawing extends JFrame{

	public Drawing()
	{
	//to  Set JFrame title
	 super("Draw A Rectangle In JFrame");

	 //Set default close operation for JFrame
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 //Set JFrame size
	 setSize(500,500);

	 //Make JFrame visible
	 setVisible(true);
	}

	public void paint(Graphics g)
	{
	 super.paint(g);

	 //draw rectangle outline
	 g.drawRect(50,50,300,100);
	 //set color to Green
	 g.setColor(Color.BLUE);

	 //fill rectangle with GREEN color
	 g.fillRect(50,50,300,100);
	}

	public static void main(String[]args)
	{
	 Drawing rect=new Drawing();
	}
	
}
