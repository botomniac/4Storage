package entities;

import java.util.Date;

public class Documento {
	private int idDoc;
	private String nomeDoc;
	private String tipoDoc;
	private float tamanho;
	private Date dataUpload;
	private String uploader;

	public String getNomeDoc() {
		return nomeDoc;
	}

	public void setNomeDoc(String nomeDoc) {
		this.nomeDoc = nomeDoc;
	}

	public int getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(int codDoc) {
		this.idDoc = codDoc;
	}

	public String getExtensao() {
		return tipoDoc;
	}

	public void setExtensao(String extensao) {
		this.tipoDoc = extensao;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public Date getDataUpload() {
		return dataUpload;
	}

	public void setDataUpload(Date dataUpload) {
		this.dataUpload = dataUpload;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	@Override
	public String toString() {
		return "Documento: " + getNomeDoc();
	}

	public void moveDoc() {

	}

	public void copiaDoc() {

	}

	public void excluiDoc() {

	}

	public void renomeiaDoc() {

	}

	public void visualizaDoc() {

	}

}
