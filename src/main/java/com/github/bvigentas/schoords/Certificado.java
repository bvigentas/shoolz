package com.github.bvigentas.schoords;

import lombok.Data;

import java.util.Date;

@Data
public class Certificado {

    private String certificado;
    private Date dataInicial;
    private Date dataFinal;
}
