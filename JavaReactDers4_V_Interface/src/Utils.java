//static metod ilk kullan�l��� yerde bir referans olu�turulur ve 
//program sonlanana kadar o bellekte kal�r. objeler pahal� nesnelerdir
//loglamay� her yerde s�rekli �a��raca��m�z i�in static olmas� uygundur
//ama hep kulln�lmayacak bir nesne �rne�in customer manager stat�c olmamal�d�r

public class Utils { //***javada üst class static yapılamaz ama içtekiler yapılabilir
	public static void runLoggers(Logger[] loggers,String message) {
		
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
	
	public static class Bisey {  //içteki class static olabilir
		
		
	}
}
