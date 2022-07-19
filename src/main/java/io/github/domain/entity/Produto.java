package io.github.domain.entity;

import java.math.BigDecimal;

public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal preco;

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}

