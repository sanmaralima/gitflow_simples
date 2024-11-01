package pji.ltp.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pji.ltp.demo.Repository.CursoRepository;
import pji.ltp.demo.model.Curso;



@RestController
public class CursoController {
    @Autowired
    CursoRepository CursoRepository;

    @PostMapping("/curso/{id}")
    public Curso createNewCurso(@RequestBody Curso newCurso) {
        return CursoRepository.save(newCurso);
    }

    @GetMapping("/curso/{id}")
    public Curso getCursoById(@PathVariable Long id) {
        try {
            return CursoRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/curso/{id}")
    public void deleteCursoById(@PathVariable("id") Long idToDelete) {
        CursoRepository.deleteById(idToDelete);
    }

}
