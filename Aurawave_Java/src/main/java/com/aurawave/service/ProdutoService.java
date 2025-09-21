package com.aurawave.service;

import com.aurawave.model.Produto;

public class ProdutoService {
    public boolean estoqueAbaixoDoMinimo(Produto p){
        return p.getQuantidade() < p.getEstoqueMinimo();
    }
}
