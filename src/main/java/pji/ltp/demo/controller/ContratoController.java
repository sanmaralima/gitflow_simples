package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.ContratoRepository;
import pji.ltp.demo.model.Contrato;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContratoController {

    @Autowired
    ContratoRepository contratoRepository;

    @PostMapping("/contrato")
    public Contrato createNewContrato(@RequestBody Contrato newContrato) {
        return contratoRepository.save(newContrato);
    }

    @GetMapping("/contrato/{id}")
    public Contrato getContratoById(@PathVariable Long id) {
        try {
            return contratoRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

     @DeleteMapping("/contrato/{id}")
    public void deleteContratoById(@PathVariable("id") Long idToDelete) {
        contratoRepository.deleteById(idToDelete);
    }
    
}
