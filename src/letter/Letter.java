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
		// Ciclo per stampare righe
		for (int i = 0; i < 10; i++) {
			System.out.println(letteraL[i] + " " + letteraF[i]);
		}
	}
}