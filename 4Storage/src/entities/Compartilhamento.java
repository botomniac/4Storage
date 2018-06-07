package entities;

import java.util.Date;

public class Compartilhamento {

    private String emailAlvo;
    private String idDoc;
    private Date dataShare;

    public String getEmailAlvo() {
        return emailAlvo;
    }

    public void setEmailAlvo(String emailAlvo) {
        this.emailAlvo = emailAlvo;
    }

    public String getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(String idDoc) {
        this.idDoc = idDoc;
    }

    public Date getDataShare() {
        return dataShare;
    }

    public void setDataShare(Date dataShare) {
        this.dataShare = dataShare;
    }

}
