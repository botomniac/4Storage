package entities;

public class RedefinirSenha {
	private int idUsuario;
	private String senhaAntiga;
	private String novaSenha;
	private String confirmaNovaSenha;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getSenhaAntiga() {
		return senhaAntiga;
	}
	public void setSenhaAntiga(String senhaAntiga) {
		this.senhaAntiga = senhaAntiga;
	}
	public String getNovaSenha() {
		return novaSenha;
	}
	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}
	public String getConfirmaNovaSenha() {
		return confirmaNovaSenha;
	}
	public void setConfirmaNovaSenha(String confirmaNovaSenha) {
		this.confirmaNovaSenha = confirmaNovaSenha;
	}
	
}
