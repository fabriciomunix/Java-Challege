package com.aurawave;

import com.aurawave.service.MedicaoService;
import com.aurawave.model.Produto;
import com.aurawave.service.ProdutoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class AurawaveTest {
    @Test
    public void testCalculoVolume(){
        MedicaoService s = new MedicaoService();
        Assertions.assertEquals(100.0, s.calcularVolume(10.0, 5.0, 2.0), 0.0001);
    }
    @Test
    public void testEstoqueMinimo(){
        Produto p = new Produto("u","Lamina",10,20,"OK", LocalDate.now().plusDays(100));
        ProdutoService svc = new ProdutoService();
        Assertions.assertTrue(svc.estoqueAbaixoDoMinimo(p));
    }
}
