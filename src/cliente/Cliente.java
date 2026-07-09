package cliente;

public class Cliente {

		//Descrizione Attributi
		int ID;
		boolean isNuovo;
		double importoTotale;
		
		//Metodo per stampare Info Cliente
		public void displayInfoCliente() {
			System.out.println("-Scheda Cliente Vestinjava-");
			System.out.println("ClienteID: " + ID);
			System.out.println("Stato Cliente: " + (isNuovo ? "Nuovo" : "Preesistente" ));
			System.out.println("Importo totale: " + importoTotale + " €");
			System.out.println("----------------------------------------------------------");
		}
}

