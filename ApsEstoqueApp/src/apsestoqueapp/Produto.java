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
        setCodigo(codigo);
        setNome(nome);
        setFabricante(fabricante);
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
        if(codigo > 0)
            this.codigo = codigo;
        else
            System.out.println("O código não pode ser 0");
    }

    public void setNome(String nome) {
        if(!nome.isEmpty())
            this.nome = nome;
        else
            System.out.println("O nome do produto não estar em branco");
    }

    public void setFabricante(String fabricante) {
        if(!fabricante.isEmpty())
            this.fabricante = fabricante;
        else
            System.out.println("O fabricante não pode estar em branco");
    }

    public void setValorUnidade(double valorUnidade) {
        if(valorUnidade> 0)
            this.valorUnidade = valorUnidade;
        else
            System.out.println("O valor precisa ser maior que 0");
    }
    
    public double vender(int estoque){
        if(this.estoque<estoque){
            return -1;
        }
        else{
            this.estoque = this.estoque-estoque;
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
