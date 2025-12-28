/**
 * P33 Superclasse Persona: base comune.
 * Ha un metodo saluta() di default (può essere override)
 */
public class Persona {
	
	private String nome;
	private String cognome;
	

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public void saluta() {
		System.out.println("Salve, sono " + nome + " " + cognome);
	}


	// Getter e Setter utili per toString
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public String getCognome() { return cognome; }
	public void setCognome(String cognome) { this.cognome = cognome; }

	// toString per stampa leggibile
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + nome + " " + cognome;
	}
	
}


