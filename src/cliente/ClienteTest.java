package cliente;

public class ClienteTest {

	public static void main(String[] args) {
			// Creazione istanza
			Cliente mioCliente = new Cliente();
			// inizializzazione dei campi dell'istanza

				mioCliente.ID = 111;
				mioCliente.isNuovo = true; // true = Nuovo
				mioCliente.importoTotale = 0.0; // euro piu cent
				
				mioCliente.displayInfoCliente();
				
				mioCliente.ID = 222;
				mioCliente.isNuovo = false; // false = Preesistente
				mioCliente.importoTotale = 9.99; // euro piu cent
				
				mioCliente.displayInfoCliente();

			}

}