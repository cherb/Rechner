/**
 * Taschenrechner fuer Softwaretechnik Demo
 * @version: 0815
 * @Author: Christian Herb
 * 
 */


package rechner.cherb.de;

import javax.swing.UIManager;

public class Taschenrechner {

	public static void main(String[] args) {
		try {
		    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gui gui1 =  new Gui();
		gui1.aufbau();
	}

}
