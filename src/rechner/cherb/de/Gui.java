package rechner.cherb.de;

/*
 * Graphical user interface 
 * Numbers entered in the system will be transfered to the calculation unit "Steuerung"
 * 
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame{

	private static final long serialVersionUID = -381814327758064952L;
	
	static Steuerung steuern = new Steuerung();
	static String tmp;
	static String displaytext="0";
	
//Gui Aufbau
	static JFrame rahmen = new JFrame();
	static JPanel backg = new JPanel();
	static JTextField display = new JTextField();
	static JButton zero = new JButton();
	static JButton komma = new JButton();
	static JButton gleich = new JButton();
	static JButton plus = new JButton();
	static JButton eins = new JButton();
	static JButton zwei = new JButton();
	static JButton drei = new JButton();
	static JButton minus = new JButton();
	static JButton vier = new JButton();
	static JButton fuenf = new JButton();
	static JButton sechs = new JButton();
	static JButton mal = new JButton();
	static JButton sieben = new JButton();
	static JButton acht = new JButton();
	static JButton neun = new JButton();
	static JButton geteilt = new JButton();
	static JButton ce = new JButton();
	static JButton aus = new JButton();
	
	public Gui(){
		
	}
	
	public void aufbau(){
		//Rahmen des Rechners
				final Dimension d = this.getToolkit().getScreenSize();
				rahmen.setLocation((int) ((d.getWidth() - this.getWidth()) / 3), (int) ((d.getHeight() - this.getHeight()) / 9));
				rahmen.setTitle("Taschenrechner");
				rahmen.setSize(400, 600);
				rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				rahmen.setVisible(true);
				
				backg.setSize(400,600);
				backg.setBackground(Color.DARK_GRAY);
				backg.setVisible(true);
				rahmen.add(backg);
				
		//Display fuer Ein-/Ausgabe
				display.setSize(300, 50);
				display.setLocation(50, 50);
				display.setBackground(Color.LIGHT_GRAY);
				display.setVisible(true);
				anzeige();
				rahmen.add(display);

		//Tastenfeld plus KlickAction
				zero.setSize (75, 40);
				zero.setText("0");
				zero.setBackground(Color.LIGHT_GRAY);
				zero.setLocation(20, 500);
				zero.setVisible(true);
				zero.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "0";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(zero);
				
				komma.setSize (75, 40);
				komma.setText(",");
				komma.setBackground(Color.LIGHT_GRAY);
				komma.setLocation(115, 500);
				komma.setVisible(true);
				komma.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = ".";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(komma);
				
				gleich.setSize (75, 40);
				gleich.setText("=");
				gleich.setBackground(Color.LIGHT_GRAY);
				gleich.setLocation(210, 500);
				gleich.setVisible(true);
				gleich.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "=";
						steuern.auswahl(tmp);
						anzeigeErgebnis();
					}
				});
				backg.add(gleich);
				
				plus.setSize (75, 40);
				plus.setText("+");
				plus.setBackground(Color.LIGHT_GRAY);
				plus.setLocation(305, 500);
				plus.setVisible(true);
				plus.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "+";
						steuern.auswahl(tmp);
						anzeige();
					}
				});
				backg.add(plus);
				
				eins.setSize (75, 40);
				eins.setText("1");
				eins.setBackground(Color.LIGHT_GRAY);
				eins.setLocation(20, 420);
				eins.setVisible(true);
				eins.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "1";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(eins);
				
				zwei.setSize (75, 40);
				zwei.setText("2");
				zwei.setBackground(Color.LIGHT_GRAY);
				zwei.setLocation(115, 420);
				zwei.setVisible(true);
				zwei.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "2";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(zwei);
				
				drei.setSize (75, 40);
				drei.setText("3");
				drei.setBackground(Color.LIGHT_GRAY);
				drei.setLocation(210, 420);
				drei.setVisible(true);
				drei.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "3";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(drei);
				
				minus.setSize (75, 40);
				minus.setText("-");
				minus.setBackground(Color.LIGHT_GRAY);
				minus.setLocation(305, 420);
				minus.setVisible(true);
				minus.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "-";
						steuern.auswahl(tmp);
						anzeige();
					}
				});
				backg.add(minus);
				
				vier.setSize (75, 40);
				vier.setText("4");
				vier.setBackground(Color.LIGHT_GRAY);
				vier.setLocation(20, 340);
				vier.setVisible(true);
				vier.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "4";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(vier);
				
				fuenf.setSize (75, 40);
				fuenf.setText("5");
				fuenf.setBackground(Color.LIGHT_GRAY);
				fuenf.setLocation(115, 340);
				fuenf.setVisible(true);
				fuenf.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "5";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(fuenf);
				
				sechs.setSize (75, 40);
				sechs.setText("6");
				sechs.setBackground(Color.LIGHT_GRAY);
				sechs.setLocation(210, 340);
				sechs.setVisible(true);
				sechs.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "6";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(sechs);
				
				mal.setSize (75, 40);
				mal.setText("*");
				mal.setBackground(Color.LIGHT_GRAY);
				mal.setLocation(305, 340);
				mal.setVisible(true);
				mal.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "*";
						steuern.auswahl(tmp);
						anzeige();
					}
				});
				backg.add(mal);
				
				sieben.setSize (75, 40);
				sieben.setText("7");
				sieben.setBackground(Color.LIGHT_GRAY);
				sieben.setLocation(20, 260);
				sieben.setVisible(true);
				sieben.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "7";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(sieben);
				
				acht.setSize (75, 40);
				acht.setText("8");
				acht.setBackground(Color.LIGHT_GRAY);
				acht.setLocation(115, 260);
				acht.setVisible(true);
				acht.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "8";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(acht);
				
				neun.setSize (75, 40);
				neun.setText("9");
				neun.setBackground(Color.LIGHT_GRAY);
				neun.setLocation(210, 260);
				neun.setVisible(true);
				neun.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "9";
						steuern.setTempzahl(tmp);
						anzeige();
					}
				});
				backg.add(neun);
				
				geteilt.setSize (75, 40);
				geteilt.setText("/");
				geteilt.setBackground(Color.LIGHT_GRAY);
				geteilt.setLocation(305, 260);
				geteilt.setVisible(true);
				geteilt.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp = "/";
						steuern.auswahl(tmp);
					}
				});
				backg.add(geteilt);
				
				ce.setSize (75, 40);
				ce.setText("CE");
				ce.setBackground(Color.LIGHT_GRAY);
				ce.setLocation(20, 180);
				ce.setVisible(true);
				ce.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						tmp="CE";
						steuern.auswahl(tmp);
						anzeige();
					}
				});
				backg.add(ce);
				
				aus.setSize (75, 40);
				aus.setText("OFF");
				aus.setBackground(Color.LIGHT_GRAY);
				aus.setLocation(305, 180);
				aus.setVisible(true);
				aus.addActionListener(new ActionListener(){
					public void actionPerformed(final ActionEvent e){
						rahmen.dispose();
					}
				});
				backg.add(aus);
	}

	
	public static void anzeige(){
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setText(steuern.getTemp());
	}
	
	public static void anzeigeErgebnis(){
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setText(steuern.getErgebnis());
		steuern.eraseTemp();
	}

}
