package org.devsfree.loteriadevsfree.service;

import org.devsfree.loteriadevsfree.model.TipoJogo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoteriaService {


    public List<Integer> realizarSorteio(TipoJogo jogo) {
        List<Integer> bolas = new ArrayList<>();
        switch (jogo) {
            case LOTO_FACIL -> {
                for (int i = 1; i <= 25; i++) {
                    bolas.add(i);
                }
                return Factory.embaralhar(bolas).subList(0, 15);
            }
            case MEGA_SENA -> {
                for (int i = 1; i <= 60; i++) {
                    bolas.add(i);
                }
                return Factory.embaralhar(bolas).subList(0, 6);
            }
            case QUINA -> {
                for (int i = 1; i <= 80; i++) {
                    bolas.add(i);
                }
                return Factory.embaralhar(bolas).subList(0, 5);
            }
            case LOTO_MANIA -> {
                for (int i = 0; i <= 99; i++) {
                    bolas.add(i);
                }
                return Factory.embaralhar(bolas).subList(0, 20);
            }
        }
        return null;
    }


}
