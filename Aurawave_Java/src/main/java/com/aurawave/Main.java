package com.aurawave;

import com.aurawave.dao.ProdutoDAO;
import com.aurawave.model.Produto;
import com.aurawave.service.ProdutoService;
import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        ProdutoDAO dao = new ProdutoDAO();
        ProdutoService svc = new ProdutoService();
        Produto p = new Produto(UUID.randomUUID().toString(), "Formol 10%", 20, 30, "OK", LocalDate.now().plusDays(120));
        dao.create(p);
        System.out.println("Abaixo do mínimo? " + svc.estoqueAbaixoDoMinimo(p));
        dao.updateQuantidade(p.getUuid(), 50);
        Produto r = dao.findById(p.getUuid());
        System.out.println("Qtd atual: " + (r==null? "n/a": r.getQuantidade()));
        dao.delete(p.getUuid());
        System.out.println("Removido " + p.getUuid());
    }
}
