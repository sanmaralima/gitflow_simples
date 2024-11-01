package pji.ltp.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatricula;
    private String status;

    @OneToOne
    @JoinColumn(name = "idUsuaria")
    private Usuaria usuaria;

    @OneToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;




    public Matricula() {
    }

    public Matricula(Long idMatricula, String status) {
        this.idMatricula = idMatricula;
        this.status = status;
    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
