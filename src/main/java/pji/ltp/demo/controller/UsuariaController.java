package pji.ltp.demo.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pji.ltp.demo.Repository.UsuariaRepository;
import pji.ltp.demo.model.Usuaria;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UsuariaController{

    @Autowired
    UsuariaRepository UsuariaRepository;

    @GetMapping("/usuaria/{id}")
    public Usuaria getUsuariaById(@PathVariable Long id) {
        try {
            return UsuariaRepository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }
    
    @GetMapping("/usuaria")
    public List<Usuaria> getAllUsuarias() {
        return (List<Usuaria>) UsuariaRepository.findAll();
    }

    @PostMapping("/usuaria")
    public Usuaria createNewUsuaria(@RequestBody Usuaria newUsuaria) {
        return UsuariaRepository.save(newUsuaria);
    }

    @DeleteMapping("/usuaria/{id}")
    public void deleteUsuariaById(@PathVariable("id") Long idToDelete) {
        UsuariaRepository.deleteById(idToDelete);
    }

    @PutMapping("usuaria/{id}")
    public Usuaria updateUsuariaById(
        @PathVariable Long id,
        @RequestBody Usuaria usuariaToUpdate) {
        //TODO: process PUT request
        Usuaria usuariaFromDb = UsuariaRepository.findById(id).get();

        usuariaFromDb.setNome(usuariaToUpdate.getNome());
        usuariaFromDb.setIdade(usuariaToUpdate.getIdade());
        usuariaFromDb.setCpf(usuariaToUpdate.getCpf());
        usuariaFromDb.setAssinante(usuariaToUpdate.getAssinante());

        UsuariaRepository.save(usuariaFromDb);
        
        return usuariaFromDb;
    }

}