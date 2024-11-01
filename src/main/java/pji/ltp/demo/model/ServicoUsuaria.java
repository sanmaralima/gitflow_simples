package pji.ltp.demo.model;

import java.util.List;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;

@Entity
public class ServicoUsuaria {
    @EmbeddedId
    private ServicoUsuaria idServicoUsuaria;
    private double valor;

    @ManyToOne
    @MapsId("idUsuaria")
    private Usuaria usuaria;

    @ManyToOne
    @MapsId("idServico")
    private Servico servico;
}
