package relacionamentos_exercicios;

import java.util.ArrayList;

public class Pedido {
    private String id;
    private StatusPedido status;
    ArrayList<itemPedido> itens;
    
    Pedido(String id, StatusPedido status) {
    	this.id = id;
    	this.status = status;
    	this.itens = new ArrayList<>();
    }
    
    public void addItem(itemPedido item) {
    	this.itens.add(item);
    }
    
    public void removeItem(itemPedido item) {
    	this.itens.remove(item);
    }
    
    public double valorTotal() {
    	double valueTotal = 0.0;
    	
        for(itemPedido i : itens) {
        	valueTotal += i.subTotal();
        }
        
        return valueTotal;
    }
    
}
