package model;

public class Utente {

	private String nome;
	private String cognome;
	private String mail;
	private String numeroTelefonico;
	private String username;
	private String password;

	public Utente(String nome, String cognome, String mail, String numeroTelefonico, String username, String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
		this.numeroTelefonico = numeroTelefonico;
		this.username = username;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", mail=" + mail + ", numeroTelefonico="
				+ numeroTelefonico + ", username=" + username + ", password=" + password + "]";
	}

}
