package pji.ltp.demo.model;

public class Servico {
    private Long idServico;
    private String nome;
    private String descricao;
    
    public Servico() {
    }

    public Servico(Long idServico, String nome, String descricao) {
        this.idServico = idServico;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
