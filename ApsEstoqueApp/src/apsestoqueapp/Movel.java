
package apsestoqueapp;

/**
 *
 * @author Rodrigo and Iran
 */
public class Movel extends Produto {
    private String tipoMaterial;

    public Movel(String tipoMaterial, int codigo, String nome, String fabricante, int estoque, double valorUnidade) {
        super(codigo, nome, fabricante, estoque, valorUnidade);
        setTipoMaterial(tipoMaterial);
    }

    @Override
    public String toString() {
        return "Movel{" + "tipoMaterial=" + tipoMaterial + '}';
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        if(!tipoMaterial.isEmpty())
            this.tipoMaterial = tipoMaterial;
        else
            System.out.println("Tipo de material nao pode estar em branco");
    }
    
}
