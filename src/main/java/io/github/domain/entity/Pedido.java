package io.github.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private Integer id;
    private Cliente cliente;
    private LocalDate data;
    private BigDecimal total;
}

