package org.devsfree.loteriadevsfree.controller;

import org.devsfree.loteriadevsfree.model.TipoJogo;
import org.devsfree.loteriadevsfree.service.Factory;
import org.devsfree.loteriadevsfree.service.LoteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/loteria")
public class LoteriaController {

    @Autowired
    LoteriaService service;

    @GetMapping("/{tipoJogo}")
    public List<List<Integer>> getLoteria(@PathVariable String tipoJogo,@RequestParam(defaultValue = "1") int quantidade) {
        TipoJogo jogo = Factory.getTipoJogo(tipoJogo);
        List<List<Integer>> numeros = new ArrayList<>();
        while (quantidade > 0) {
            quantidade--;
            numeros.add(service.realizarSorteio(jogo));
        }
        return numeros;
    }


}
