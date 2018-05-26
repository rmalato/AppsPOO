
package apsestoqueapp;

/**
 *
 * @author Rodrigo and Iran
 */
public class Movel extends Produto {
    private String tipoMaterial;

    public Movel(String tipoMaterial, int codigo, String nome, String fabricante, int estoque, double valorUnidade) {
        super(codigo, nome, fabricante, estoque, valorUnidade);
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return "Movel{" + "tipoMaterial=" + tipoMaterial + '}';
    }
    
    
}
