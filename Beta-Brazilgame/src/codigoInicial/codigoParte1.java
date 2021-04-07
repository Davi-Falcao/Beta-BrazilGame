package codigoInicial;

import jplay.Window;
import jplay.GameImage;
import jplay.URL;

public class codigoParte1 {

	public static void main(String[] args) {
		
		Window janela = new Window(1366, 768);
		GameImage plano = new GameImage(URL.sprite("Fundo_cinza.jpg"));
		
			while(true) {
				plano.draw();
				janela.update();
			}
	}
		
	}


