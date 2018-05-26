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
    private String voltagem;
    private int potencia;
    private char eficiencia;

    public Eletronico(String voltagem, int potencia, char eficiencia, int codigo, String nome, String fabricante, int estoque, double valorUnidade) {
        super(codigo, nome, fabricante, estoque, valorUnidade);
        setVoltagem(voltagem);
        setPotencia(potencia);
        setEficiencia(eficiencia);
    }

    public String getVoltagem() {
        return voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public char getEficiencia() {
        return eficiencia;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + super.getCodigo() + ", nome=" + super.getNome() + ", fabricante=" + super.getFabricante() + ", estoque=" + super.getEstoque() + ", valorUnidade=" + super.getValorUnidade() + ", voltagem=" + this.voltagem + ", potencia=" + this.potencia + ", eficiencia=" + this.eficiencia;
    }

    public void setVoltagem(String voltagem) {
        if("220".equals(voltagem) || "110".equals(voltagem) || "bivolt".equals(voltagem.toLowerCase()))
            this.voltagem = voltagem;
        else
            System.out.println("Valor inválido de voltagem, valores válidos:"
                    + "110, 220, bivolt");
    }

    public void setPotencia(int potencia) {
        if(potencia > 0)
            this.potencia = potencia;
        else
            System.out.println("A potencia precisa ser maior que zero");
    }

    public void setEficiencia(char eficiencia) {
        String eficiencias = "A, B, C, D, E";
        if(eficiencias.indexOf(eficiencia)>=0)
            this.eficiencia = eficiencia;
        else
            System.out.println("Eficiencia inválida.\nEficiencias válidas: " + eficiencias);
    }

}
