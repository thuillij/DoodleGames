import javax.swing.JFrame;

public class Morpion {
	
	
	public static void main(String [] args)
	{
		JFrame f = new JFrame();
		f.setBounds(300,300,400,300);
		f.setVisible(true);
		MorpionVue m = new MorpionVue();
		f.add(m);
		f.repaint();
		f.validate();
		
	}
}