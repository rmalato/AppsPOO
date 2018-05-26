
package apsestoqueapp;
import java.time.LocalDate;
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
            if(p.getCodigo() == codigo){
                listaProduto.remove(p);
                return true;
            }
        }
        return false;
    }
    
    public Produto buscarPorCodigo(int codigo){
        for(Produto p : listaProduto){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
    public String listarEletronicos(){
        String retorno = "";
        for(Produto p : listaProduto){
            if(p instanceof Eletronico){
                retorno+=p.toString();
            }
        }

        return retorno;
    }
    
    public String listarPereciveis(){
        String retorno = "";
        for(Produto p : listaProduto){
            if(p instanceof Perecivel){
                retorno+=p.toString();
            }
        }
        return retorno;
    }
 
    public String listarMoveis(){
        String retorno = "";
        for(Produto p : listaProduto){
            if(p instanceof Movel){
                retorno+=p.toString();
            }
        }
        return retorno;
    }
    
    public String listarEstoqueMenorQue(int quantidadeMinima){
        String retorno = "";
        for(Produto p : listaProduto){
            if(p.getEstoque() < quantidadeMinima){
                retorno+=p.toString();
            }
        }
        return retorno;
    }
    
    public String listarEstoqueVazio(){
        String retorno = "";
        for(Produto p : listaProduto){
            if(p.getEstoque() == 0 ){
                retorno+=p.toString();
            }
        }
        return retorno;        
    }
    
    public String listarPorFabricante(String fabricante){
        String retorno = "";
        for(Produto p : listaProduto){
            if(p.getFabricante().equals(fabricante)){
                retorno+=p.toString();
            }
        }
        return retorno;                
    }
    
    public String listarPorValidade(LocalDate validade){
        String retorno = "";
        for(Produto p : listaProduto){
            if(((Perecivel)p).getValidade()==validade){
                retorno+=p.toString();
            }
        }
        return retorno;                
    }
    
    public double venderProduto (int codigoProduto, int quantidade){
        int  retorno = -1;
        for(Produto p : listaProduto){
            if(p.getCodigo() == codigoProduto){
                return p.vender(quantidade);
            }
        }
        return retorno;   
    }
    
    public boolean comprarProduto(int codigoProduto, int quantidade){
        for(Produto p : listaProduto){
            if(p.getCodigo() == codigoProduto){
                p.comprar(quantidade);
                return true;
            }
        }
        return false;
    }
    
    public String listarTudo(){
        String retorno = "";
        for(Produto p : listaProduto){
            retorno+=p.toString();
        }
        return retorno;    
    }
}
