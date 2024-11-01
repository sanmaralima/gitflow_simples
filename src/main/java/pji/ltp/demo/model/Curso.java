package pji.ltp.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    private String nome;
    private String categoria;

    @OneToOne
    @JoinColumn(name = "idMatricula")
    private Matricula matricula; 
    
    public Curso() {
    }

    public Curso(Long idCurso, String nome, String categoria) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.categoria = categoria;
    }

    public Long getidCurso() {
        return idCurso;
    }

    public void setidCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
