package org.example;

import java.util.Iterator;

public class Estoque {

    public static Integer contarProdutosDisponiveis(Inventario inventario) {
        int quantidade = 0;
        for (Produto produto : inventario) {
            if (produto.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalProdutos(Inventario inventario) {
        int quantidade = 0;
        for (Iterator p = inventario.iterator(); p.hasNext(); ) {
            quantidade++;
            p.next();
        }
        return quantidade;
    }
}