package entities;

public class Usuario {
	private int idUsuario;
	private String nomeUsuario;
	private String email;
	private String senha;
	private float espacoMax;
	private float espacoLivre;
	private String idioma;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public float getEspacoMax() {
		return espacoMax;
	}
	public void setEspacoMax(float espacoMax) {
		this.espacoMax = espacoMax;
	}
	public float getEspacoLivre() {
		return espacoLivre;
	}
	public void setEspacoLivre(float espacoLivre) {
		this.espacoLivre = espacoLivre;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
}
