
package com.mycompany.pryarchivos;

import java.util.LinkedList;

public class ListaDeProductos {
    private LinkedList<Producto> productos;

    public ListaDeProductos() {
        productos=new LinkedList();
    }
    
    public void agregar(Producto a){
        productos.add(a);
    }
    
    public void eliminar(int indice){
        productos.remove(indice);
    }
       
       
    public int total(){
        return productos.size();
    }
    
    public Producto obtener(int indice){
        return productos.get(indice);
    }
    
       
    public void cargarProductos(){
        BDProductos bd=new BDProductos();
        productos=bd.obtener();        
    }
    public void guardarenArchivo(){
        BDProductos bd=new BDProductos();
        bd.borrarTodo();
        for(int i=0;i<productos.size();i++){
            System.out.println(i);
            bd.registrarproducto(productos.get(i));
        }
    }

}
