package pji.ltp.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServico;
    private String nome;
    private String descricao;
    
    @OneToOne
    @JoinColumn( name = "idPublicacao")
    private Publicacao publicacao;

    @OneToMany(mappedBy = "servico")
    private List<ServicoUsuaria> servicoUsuarias;    


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
