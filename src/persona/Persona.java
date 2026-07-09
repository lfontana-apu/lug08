package persona;

public class Persona {
	public int anni;
	
	public void calcolaEta() {
		int giorni = anni * 365;
		long secondi = (long) giorni * 86400L;
		
		System.out.println("--- CALCOLA ETA ---");
		System.out.println("Eta originale: anni " + anni);
		System.out.println("Corrispondente a: " + giorni + " giorni");
		System.out.println("Corrispondente a: " + secondi + " secondi");
	}
}
