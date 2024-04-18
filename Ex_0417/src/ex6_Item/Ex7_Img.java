package ex6_Item;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex7_Img {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuTest");
		f.setLayout(null);
		
		ImageIcon back = new ImageIcon("src/image/simson1.png");
		JLabel jl_back = new JLabel(back);
		jl_back.setBounds(0,0,500,500);
		
		f.add(jl_back);
		
		f.setBounds(400,400,302,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
