/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentopizzaria;

import java.io.Serializable;

/**
 *
 * @author Tiago
 */
public class ProdutoPedido implements Serializable{
    
    private Produto produto;
    private int qtd;

    public ProdutoPedido() {
    }

    public ProdutoPedido(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }
    
    @Override
    public String toString() {
        String stringTotal = produto.getNome().concat(": ");
        String stringQtd = Integer.toString(qtd);
        return stringTotal.concat(stringQtd);
    }
    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public void incQtd() {
        this.qtd = qtd + 1;
    }
    
    public void decQtd() {
        this.qtd = qtd - 1;
    }
    
}
