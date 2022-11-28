package com.mycompany.pryarchivos;

import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDProductos {

    public LinkedList<Producto> obtener(){
        LinkedList<Producto> productos=null;
        Archivo archivo=new Archivo("hola.txt");
        LinkedList<String> lineas=archivo.obtenerTextoDelArchivo();
        if(lineas!=null){
            productos=new LinkedList();
            for(int i=0;i<lineas.size();i++){
                String linea=lineas.get(i);
                StringTokenizer tokens=new StringTokenizer(linea,";");
                String nombre=tokens.nextToken();
                String apellido=tokens.nextToken();
                int cedula=Integer.parseInt(tokens.nextToken());                
                productos.add(new Producto(nombre,apellido,cedula));
            }
        }
        return productos;
    }
    public boolean registrarproducto(Producto p){
        System.out.println("sdzf");
        Archivo archivo = new Archivo("hola.txt");
        return archivo.registrar(p.getNombre()+";"+p.getApellido()+";"+p.getCedula()+"\n");
    }
    public boolean borrarTodo(){
        Archivo archivo = new Archivo("hola.txt");
        return  archivo.borrarcontenido();
    }
    public void guardarenArchivo(){
        BDProductos bd=new BDProductos();
        bd.borrarTodo();
    }
    }

