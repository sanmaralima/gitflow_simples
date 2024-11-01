package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Contrato;

public interface ContratoRepository extends CrudRepository<Contrato, Long>{
    Contrato save(Contrato newContrato);

}