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
public abstract class Produto {
    private int codigo;
    private String nome;
    private String fabricante;
    private int estoque;
    private double valorUnidade;

    public Produto(int codigo, String nome, String fabricante, int estoque, double valorUnidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.estoque = estoque;
        this.valorUnidade = valorUnidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    
    public double vender(int estoque){
        this.estoque = this.estoque-estoque;
        if(this.estoque<estoque){
            return -1;
        }
        else{
            return valorUnidade*estoque;
        }
    }
    
    public void comprar(int estoque){
        this.estoque = this.estoque+estoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", fabricante=" + fabricante + ", estoque=" + estoque + ", valorUnidade=" + valorUnidade + '}';
    }
    
    
    
}
