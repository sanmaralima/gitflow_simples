package pji.ltp.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pji.ltp.demo.Repository.PublicacaoRepository;
import pji.ltp.demo.model.Publicacao;

@RestController
public class PublicacaoController {

    @Autowired
    PublicacaoRepository PublicacaoRepository;

    @GetMapping("/post/{id}")
    public Publicacao getPublicacaoById(@PathVariable Long id) {
        try {
            return PublicacaoRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/post")
    public List<Publicacao> getAllPublicacoes() {
        return (List<Publicacao>) PublicacaoRepository.findAll();
    }

    @PostMapping("/post/{id}")
    public Publicacao createNewPublicacao(@RequestBody Publicacao newPublicacao) {
        return PublicacaoRepository.save(newPublicacao);
    }
}
