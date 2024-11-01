package pji.ltp.demo.controller;
import pji.ltp.demo.Repository.ServicoRepository;
import pji.ltp.demo.model.Servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @DeleteMapping("/servico/{id}")
    public void deleteServicoById(@PathVariable("id") Long idToDelete) {
        ServicoRepository.deleteById(idToDelete);
    }
}
