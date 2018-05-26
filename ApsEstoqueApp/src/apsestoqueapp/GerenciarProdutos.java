
package apsestoqueapp;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo and Iran 
 */
public class GerenciarProdutos {
    private ArrayList<Produto> listaProduto = new ArrayList<>();
    
    public void adicionar(Produto p){
        listaProduto.add(p);
    }
    
    public boolean remover(int codigo){
        for(Produto p : listaProduto){
            if(p.getCodigo().equalsIgnoreCase(codigo)){
                
            }
        }
    }
    
}
