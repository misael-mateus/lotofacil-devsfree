package org.devsfree.loteriadevsfree.service;

import org.devsfree.loteriadevsfree.model.TipoJogo;

import java.util.Collections;
import java.util.List;

public class Factory {

    public static List<Integer> embaralhar(List<Integer> numeros) {
        Collections.shuffle(numeros);
        return numeros;
    }

    public static TipoJogo getTipoJogo(String tipoJogo) {
        return switch (tipoJogo.toUpperCase()) {
            case "LOTO_FACIL" -> TipoJogo.LOTO_FACIL;
            case "MEGA_SENA" -> TipoJogo.MEGA_SENA;
            case "QUINA" -> TipoJogo.QUINA;
            case "LOTO_MANIA" -> TipoJogo.LOTO_MANIA;
            default -> null;
        };
    }

}
