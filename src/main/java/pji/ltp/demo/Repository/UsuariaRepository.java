package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Usuaria;

public interface UsuariaRepository extends CrudRepository<Usuaria, Long>{ 
    @SuppressWarnings("unchecked")
    Usuaria save(Usuaria newServico);
}