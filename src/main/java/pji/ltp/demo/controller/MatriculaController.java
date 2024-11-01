package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.MatriculaRepository;
import pji.ltp.demo.model.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatriculaController {
    @Autowired
    MatriculaRepository MatriculaRepository;

    @PostMapping("/matricula")
    public Matricula createNewMatricula(@RequestBody Matricula newMatricula) {
        return MatriculaRepository.save(newMatricula);
    }

    @GetMapping("/matricula/{id}")
    public Matricula getMatriculaById(@PathVariable Long id) {
        try {
            return MatriculaRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/matricula/{id}")
    public void deleteMatriculaById(@PathVariable("id") Long idToDelete) {
        MatriculaRepository.deleteById(idToDelete);
    }
}
