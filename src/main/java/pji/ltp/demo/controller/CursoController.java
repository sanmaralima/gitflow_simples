package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.CursoRepository;
import pji.ltp.demo.model.Curso;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/cursos")
    public List<Curso> getAllCursos() {
        return (List<Curso>) CursoRepository.findAll();
    }
}
