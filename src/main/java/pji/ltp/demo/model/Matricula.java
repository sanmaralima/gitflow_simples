package pji.ltp.demo.model;

public class Matricula {
    private Long idMatricula;
    private String status;
    
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
