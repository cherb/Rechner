package rechner.cherb.de;

/*
 * Controlinstanz of the calculator
 * 
 */

public class Steuerung {
	
	 //Values for calculation
	float zahl1;
	float zahl2 = 0;
	float ergebnis = 0;
	float tempzahl = 0;
	String temp = "";
	String operator = "";
	
	//Getter & Setter von zahl1, zahl2, tempzahl und ergebnis
		public void setZahl1(){
			zahl1 = tempzahl;
		}
		
		public float getZahl1(){
			return zahl1;
		}
		
		public void setZahl2(){
			zahl2 = tempzahl;
		}
		
		public float getZahl2(){
			return zahl2;
		}
		
		public void setTempzahl(String tmp){
			temp += tmp;
			tempzahl = Float.parseFloat(temp);
		}
		
		public String getTemp(){
			if (temp == ""){
				return "0";
			}else return temp;
		}
		
		public String getErgebnis(){
			if (temp != "Division durch 0 nicht erlaubt"){
				temp = String.valueOf(ergebnis);
			}
			return temp;
		}
		
	//Auswahl
		
		public void auswahl(String tmp){
			
			switch (tmp){
			
			case "=":
				setZahl2();
				ergebnis();
				break;
			case "+":
				operator = "+";
				setZahl1();
				eraseTemp();
				break;
			case "-":
				operator = "-";
				setZahl1();
				eraseTemp();
				break;
			case "*":
				operator = "*";
				setZahl1();
				eraseTemp();
				break;
			case "/":
				operator = "/";
				setZahl1();
				eraseTemp();
				break;
			case "CE":
				eraseTemp();
			}
		}
		
	//Berechnungen
		
		public float ergebnis(){
			switch (operator){
			case "+":
				ergebnis = Addition.addiere(zahl1, zahl2);
				break;
			case "-":
				ergebnis = Subtraktion.subtrahiere(zahl1, zahl2);
				break;
			case "*":
				ergebnis = Multiplikation.multipliziere(zahl1, zahl2);
				break;
			case "/":
				if (zahl1 != 0){
					ergebnis = Division.dividiere(zahl1, zahl2);
					break;
				}else temp="Division durch 0 nicht erlaubt";
			}
			return ergebnis;
		}
		
		
		
	// Zurücksetzen der tempzahl
		
		public void eraseTemp(){
			tempzahl = 0;
			temp = "";
		}
		

}
