package ex3_jPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class CardLayoutDemo extends JPanel{
	
		public  CardLayoutDemo() {
			JPanel cards = new JPanel(new CardLayout());
			
			//패널1
			JPanel card1 = new JPanel();
			JButton nextButton = new JButton("Next");
			card1.setBackground(Color.yellow);
			card1.add(nextButton);
			
			//패널2
			JPanel card2 = new JPanel();
			JButton prevButton = new JButton("Prev");
			card2.setBackground(Color.cyan);
			card2.add(prevButton);
			
			cards.add(card1);
			cards.add(card2);
			
			add(cards);
			
			//화면 레이아웃 가져오기
			CardLayout c1 = (CardLayout)cards.getLayout();
			nextButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					c1.next(cards);
					
				}
			});
			
			prevButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					c1.previous(cards);
					
				}
			});
				
			
		}//생성자
		
		private static void createAndShowGui() {
			JFrame f = new JFrame("Image Processing");
			CardLayoutDemo cardDemo = new CardLayoutDemo();
			f.setContentPane(cardDemo);
			
			
			f.setBounds(300,300,300,300);
			f.setVisible(true);
		}
		
		public static void main(String[] args) {
			createAndShowGui();
		}
	
}
