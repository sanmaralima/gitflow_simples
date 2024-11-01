package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Publicacao;

public interface PublicacaoRepository extends CrudRepository<Publicacao, Long>{
    Publicacao save(Publicacao newPublicacao);
    
}
