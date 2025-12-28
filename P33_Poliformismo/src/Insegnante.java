/**
 * P33 Sottoclasse Insegnante: Ovverride di saluta();
 */
public class Insegnante extends Persona{

	public Insegnante(String nome, String cognome) {
		super(nome, cognome);
	}
	
	@Override
	public void saluta() {
		System.out.println("Buongiorno ragazzi! Sono il professor " + getNome() + " " + getCognome() );
	}


}
