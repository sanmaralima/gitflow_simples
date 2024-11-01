package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Servico;

public interface ServicoRepository extends CrudRepository<Servico, Long>{
    @SuppressWarnings("unchecked")
    Servico save(Servico newServico);

}