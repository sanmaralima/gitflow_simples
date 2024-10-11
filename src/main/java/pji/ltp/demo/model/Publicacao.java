package pji.ltp.demo.model;

public class Publicacao {
    private Long idPublicacao;
    private String data;
    private String titulo;
    private String descricao;
    
    public Publicacao() {
    }

    public Publicacao(Long idPublicacao, String data, String titulo, String descricao) {
        this.idPublicacao = idPublicacao;
        this.data = data;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Long getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(Long idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
