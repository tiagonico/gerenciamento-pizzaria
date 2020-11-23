/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentopizzaria;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Tiago
 */
public class Pedido implements Serializable{
    
    int id;
    private Cliente cliente;
    private ArrayList<ProdutoPedido> produtospedidos;
    Date data;
    float valor;
    

    public Pedido() {
    }

    @Override
    public String toString() {
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
        String stringData = fmt.format(data);
                        
        String stringTotal = stringData.concat(" | ");
        stringTotal = stringTotal.concat(cliente.getNome()).concat(" | ");
        stringTotal = stringTotal.concat(Float.toString(valor)).concat(" | ");
        
        int n = produtospedidos.size();
        int i;
        for (i=0; i<n; i++) {
            ProdutoPedido pp = produtospedidos.get(i);
            if(i == n - 1){
                stringTotal = stringTotal.concat(pp.toString());
            }else{
                stringTotal = stringTotal.concat(pp.toString()).concat(", ");
            }   
        }
        
        return stringTotal;
    }
    
    public String getDateToFile(){
        SimpleDateFormat fmt = new SimpleDateFormat("dd_MM_yyyy"); 
		
        String stringData = fmt.format(data);
        return stringData;
    }
    
    public String getCsvLine(){
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
        String stringData = fmt.format(data);
                        
        String stringTotal = stringData.concat(",");
        stringTotal = stringTotal.concat(cliente.getNome()).concat(",");
        stringTotal = stringTotal.concat(Float.toString(valor)).concat(",");
        
        int n = produtospedidos.size();
        int i;
        for (i=0; i<n; i++) {
            ProdutoPedido pp = produtospedidos.get(i);
            if(i == n - 1){
                stringTotal = stringTotal.concat(pp.toString());
            }else{
                stringTotal = stringTotal.concat(pp.toString()).concat(" | ");
            }            
        }
        
        return stringTotal;
    }
    
    public float getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList getProdutospedidos() {
        return produtospedidos;
    }

    public void setProdutospedidos(ArrayList produtospedidos) {
        this.produtospedidos = produtospedidos;
    }
    
    
}
