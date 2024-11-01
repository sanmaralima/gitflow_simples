package pji.ltp.demo.Repository;
import org.springframework.data.repository.CrudRepository;
import pji.ltp.demo.model.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{
    @SuppressWarnings("unchecked")
    Curso save(Curso newCurso);

}