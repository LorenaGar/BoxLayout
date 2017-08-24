package Practica2;
import java.awt.FlowLayout;
import javax.swing.*;

 class Ejercicio2 extends JFrame {
	Ejercicio2(){
		setTitle("Jpanel con BoxLayout");
		setLayout(new FlowLayout());
		setJPanelOne();
		setJPanelTwo();
		setJPaneltres();
		setSize(700,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	private void setJPanelOne() {
		JPanel jp=new JPanel();
		jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
		jp.setBorder(BorderFactory.createTitledBorder("JPanel_1"));
		for(int i=0;i<5;i++){
			jp.add(new JButton("JButton"+i));
		}
		add(jp);
	}
	
	private void setJPanelTwo() {
		JPanel jp=new JPanel();
		jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
		jp.setBorder(BorderFactory.createTitledBorder("JPanel_2"));
		for(int i=0;i<5;i++)
		{
			jp.add(new JButton("JButton"+i));
		}
		add(jp);		
	}
	
	private void setJPaneltres() {
		JPanel jp=new JPanel();
		jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));
		jp.setBorder(BorderFactory.createTitledBorder("JPanel_3"));
		for(int i=0;i<5;i++){
			jp.add(new JButton("JButton"+i));
		}
		add(jp);
	}
	
	public static void main (String[] args) {
		Ejercicio2 fr= new Ejercicio2();		
		}
}
 