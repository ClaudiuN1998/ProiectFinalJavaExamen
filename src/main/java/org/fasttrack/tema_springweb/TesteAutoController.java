package org.fasttrack.tema_springweb;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class TesteAutoController {
    private final TesteAuto testeAuto;

    @GetMapping("/intrebari")
    public ArrayList<Intrebare> getAll(){
        return testeAuto.getAll();
    }

    @GetMapping("/intrebari/{id}")
    public Intrebare getById(@PathVariable long id){
        return testeAuto.getById(id).orElseThrow(RuntimeException::new);
    }


    @DeleteMapping("/intrebari/{id}")
    public Intrebare delete(@PathVariable long id){
        return testeAuto.delete(id);
    }

    @GetMapping("/intrebari/verificaraspuns/{id}")
    public ResponseEntity<Boolean> verificaRaspuns(@PathVariable long id, @RequestParam int idIntrebare, @RequestParam int raspuns) {
        return ResponseEntity.ok(testeAuto.verificaRaspuns(idIntrebare, raspuns));

    }

}
