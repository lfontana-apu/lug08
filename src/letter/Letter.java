package letter;

public class Letter {

	public static void main(String[] args) {
		// Definiamo le 10 righe per la lettera L
		String[] letteraL = {
				"LL        ",
				"LL        ",
				"LL        ",
				"LL        ",
				"LL        ",
				"LL        ",
				"LL        ",
				"LL        ",
				"LLLLLLLLLL",
				"LLLLLLLLLL"
				
		};
		// Definiamo le 10 righe per la lettera F
		String[] letteraF = {
				"FFFFFFFFFF",
				"FFFFFFFFFF",
				"FF        ",
				"FF        ",
				"FFFFFFFFFF",
				"FFFFFFFFFF",
				"FF        ",
				"FF        ",
				"FF        ",
				"FF        ",
				
		};
		// Ciclo per stampare iniziale: nome "L"
		for (int i = 0; i < 10; i++) {
			System.out.println(letteraL[i] + " ");
		}
		
		// Mettere una riga vuota
		System.out.println();
		
		// Ciclo per stampare iniziali: nome + cognome "L + F"
		for (int i = 0; i < 10; i++) {
			System.out.println(letteraL[i] + " " + letteraF[i]);
		}
	}
}