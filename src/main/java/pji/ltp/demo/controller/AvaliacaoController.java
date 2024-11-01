package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.AvaliacaoRepository;
import pji.ltp.demo.model.Avaliacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @DeleteMapping("/avaliacao/{id}")
    public void deleteAvaliacaoById(@PathVariable("id") Long idToDelete) {
        avaliacaoRepository.deleteById(idToDelete);
    }
    
}
