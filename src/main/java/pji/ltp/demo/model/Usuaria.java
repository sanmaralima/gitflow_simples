package pji.ltp.demo.model;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Usuaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuaria;
    private String nome;
    private String cpf;
    private int idade;
    private boolean assinante;
    private List<Usuaria> usuarias;

    @OneToOne
    @JoinColumn(name = "idPublicacao")
    private Publicacao publicacao;

    @OneToOne
    @JoinColumn(name = "idMatricula")
    private Matricula matricula;

    @OneToOne
    @JoinColumn(name = "idContrato")
    private Contrato contrato;

    @OneToOne
    @JoinColumn(name = "idAvaliacao")
    private Avaliacao avaliacao;

    public Usuaria(Long idUsuaria, String nome, String cpf, int idade, boolean assinante) {
        this.idUsuaria = idUsuaria;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.assinante = assinante;

    }

    public Usuaria() {
    }

    public Long getIdUsuaria() {
        return idUsuaria;
    }
    public void setIdUsuaria(Long idUsuaria) {
        this.idUsuaria = idUsuaria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean getAssinante() {
        return assinante;
    }
    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }

    @Override
    public String toString() {
        return "Usuaria [idUsuaria=" + idUsuaria +
                         ", nome=" + nome + 
                         ", cpf=" + cpf + 
                         ", idade=" + idade + 
                         ", assinante=" + assinante + "]";
    } 

}
