package entities;

import java.util.Date;

public class Documento {

	private int idDoc;
	private String nomeDoc;
	private double tamanho;
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

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
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

}
