package codigoInicial;

import javax.swing.JFrame;

public class codigoParte1 extends JFrame {
	
	public codigoParte1() {
		setTitle("Brazil Game - Beta");
		setSize(1366,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(true);
		setVisible(true);
		
	}
	
	public static void main (String []args) {
		new codigoParte1();
	}
}

