package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.MatriculaRepository;
import pji.ltp.demo.model.Matricula;
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
