package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.AvaliacaoRepository;
import pji.ltp.demo.model.Avaliacao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvaliacaoController {

    @Autowired
    AvaliacaoRepository avaliacaoRepository;

    @PostMapping("/avaliacao")
    public Avaliacao createNewAvaliacao(@RequestBody Avaliacao newAvaliacao) {
        return avaliacaoRepository.save(newAvaliacao);
    }

    @GetMapping("/avaliacao/{id}")
    public Avaliacao getAvaliacaoById(@PathVariable Long id) {
        try {
            return avaliacaoRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/pet/{id}")
    public void deleteAvaliacaoById(@PathVariable("id") Long idToDelete) {
        avaliacaoRepository.deleteById(idToDelete);
    }
    
}
