package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.ServicoRepository;
import pji.ltp.demo.model.Servico;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicoController {
    @Autowired
    ServicoRepository ServicoRepository;

    @PostMapping("/servico/{id}")
    public Servico createNewServico(@RequestBody Servico newServico) {
        return ServicoRepository.save(newServico);
    }

    @GetMapping("/servico/{id}")
    public Servico getServicoById(@PathVariable Long id) {
        try {
            return ServicoRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/servicos")
    public List<Servico> getAllServicos() {
        return (List<Servico>) ServicoRepository.findAll();
    }

    @DeleteMapping("/servico/{id}")
    public void deleteServicoById(@PathVariable("id") Long idToDelete) {
        ServicoRepository.deleteById(idToDelete);
    }
}
