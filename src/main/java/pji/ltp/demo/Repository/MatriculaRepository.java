package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Matricula;

public interface MatriculaRepository extends CrudRepository<Matricula, Long>{
    @SuppressWarnings("unchecked")
    Matricula save(Matricula newMatricula);

}