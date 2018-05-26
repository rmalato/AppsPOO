/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apsestoqueapp;

/**
 *
 * @author Rodrigo and Iran
 */
public class Eletronico extends Produto {
    private int voltagem;
    private int potencia;
    private char eficiencia;

    public Eletronico(int voltagem, int potencia, char eficiencia, int codigo, String nome, String fabricante, int estoque, double valorUnidade) {
        super(codigo, nome, fabricante, estoque, valorUnidade);
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
    }
    
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + super.getCodigo() + ", nome=" + super.getNome() + ", fabricante=" + super.getFabricante() + ", estoque=" + super.getEstoque() + ", valorUnidade=" + super.getValorUnidade() + ", voltagem=" + this.voltagem + ", potencia=" + this.potencia + ", eficiencia=" + this.eficiencia;
    }

    

    
    
    
    
}
