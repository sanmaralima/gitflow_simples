package pji.ltp.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrato;
    private String data;

    @OneToOne
    @JoinColumn(name = "idUsuaria")
    private Usuaria usuaria;
    
    public Contrato() {
    }

    public Contrato(Long idContrato, String data) {
        this.idContrato = idContrato;
        this.data = data;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
}
