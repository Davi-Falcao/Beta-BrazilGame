package codigoInicial;

import jplay.Window;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;



public class codigoParte1 {

	public static void main(String[] args) {
		
		Window janela = new Window(1366, 768);
		GameImage plano = new GameImage(URL.sprite("Fundo_do_menu_demo.jpg"));
		Keyboard teclado = janela.getKeyboard();
		
			while(true) {
				plano.draw();
				janela.update();
				
				if(teclado.keyDown(Keyboard.ENTER_KEY)) {
					JOptionPane.showMessageDialog(null, "Funcionando");
			}
	}
	}
}
		


