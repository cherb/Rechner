/**
 * Taschenrechner für Softwaretechnik Demo
 * 
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
		new Gui();
	}

}
