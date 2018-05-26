/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apsestoqueapp;

import java.time.LocalDate;


/**
 *
 * @author Rodrigo
 */
public class Perecivel extends Produto {
    private LocalDate validade;
    private boolean refrigerado;

    public Perecivel(LocalDate validade, boolean refrigerado, int codigo, String nome, String fabricante, int estoque, double valorUnidade) {
        super(codigo, nome, fabricante, estoque, valorUnidade);
        this.validade = validade;
        this.refrigerado = refrigerado;
    }

    @Override
    public String toString() {
        return "Perecivel{" + "validade=" + validade + ", refrigerado=" + refrigerado + '}';
    }
    
    
    
    
}
