package ex6_Item;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;import javax.swing.border.Border;

public class Ex2_ItemEvent {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new BorderLayout());
		
		//라디오버튼 객체
		ButtonGroup group = new ButtonGroup();
		JRadioButton r1 = new JRadioButton("선택1");
		JRadioButton r2 = new JRadioButton("선택2");
		JRadioButton r3 = new JRadioButton("선택3");
		
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.add(r1);
		jp1.add(r2);
		jp1.add(r3);
		
		f.add(jp1,BorderLayout.CENTER);
		
		JPanel jp2 = new JPanel(new FlowLayout());
		JLabel txt1 = new JLabel("선택 항목 : ");
		JLabel txt2 = new JLabel();
		jp2.add(txt1);
		jp2.add(txt2);
		f.add(jp2,BorderLayout.SOUTH);
		
		ItemListener i1 = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getSource() == r1) {
						txt2.setText(r1.getText());
					} else if(e.getSource() == r2) {
						txt2.setText(r2.getText());
					} else if(e.getSource() == r3) {
						txt2.setText(r3.getText());
					}
				}
				
			}
		};
		
		r1.addItemListener(i1);
		r2.addItemListener(i1);
		r3.addItemListener(i1);
		
		f.setBounds(400,400,302,250);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
