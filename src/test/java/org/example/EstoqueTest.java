package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstoqueTest {

    @Test
    void deveContarProdutosDisponiveis() {
        Inventario inventario = new Inventario(
                new Produto("Smartphone", true),
                new Produto("Tablet", false),
                new Produto("Laptop", true),
                new Produto("Smartwatch", true)
        );
        assertEquals(3, Estoque.contarProdutosDisponiveis(inventario));
    }

    @Test
    void deveContarTotalProdutos() {
        Inventario inventario = new Inventario(
                new Produto("Smartphone", true),
                new Produto("Tablet", false),
                new Produto("Laptop", true),
                new Produto("Smartwatch", true)
        );
        assertEquals(4, Estoque.contarTotalProdutos(inventario));
    }
}