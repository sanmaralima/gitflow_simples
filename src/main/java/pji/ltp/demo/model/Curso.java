package pji.ltp.demo.model;

public class Curso {
    private Long idcurso;
    private String nome;
    private String categoria;
    
    public Curso() {
    }

    public Curso(Long idcurso, String nome, String categoria) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.categoria = categoria;
    }

    public Long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
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
