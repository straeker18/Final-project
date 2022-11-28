package com.mycompany.pryarchivos;

import javax.swing.table.AbstractTableModel;

public class ModeloProductos extends AbstractTableModel{

    private  ListaDeProductos productos;

    public ModeloProductos() {
        productos=new ListaDeProductos();
        productos.cargarProductos();
    }
    
    
    @Override
    public int getRowCount() {
        return productos.total();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto aux=productos.obtener(rowIndex);
        switch(columnIndex){
            case 0: return aux.getNombre();
            case 1: return aux.getApellido();
            default: return aux.getCedula();
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch(col){
            case 0: return "NOMBRE";
            case 1: return "APELLIDO";
            default: return "CEDULA";
        }
    }
    
    @Override
    public Class getColumnClass(int col) {
        switch(col){
            case 0: return String.class;
            case 1: return String.class;
            default: return Integer.class;
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;        
    }
  
    @Override
    public void setValueAt(Object value, int fila, int columna) {
        Producto aux=productos.obtener(fila);
        switch(columna){
            case 0: aux.setNombre((String)value);
                    break;
            case 1: aux.setApellido((String)value);
                    break;
            default: aux.setCedula((int)value);
        }
        fireTableCellUpdated(fila, columna);
    }
    
    public void agregarProducto(Producto producto){
        productos.agregar(producto);
        this.fireTableDataChanged();   
    }
    
    public void eliminarProducto(int indice){
        productos.eliminar(indice);
        this.fireTableDataChanged(); 
    }
    public void guardarProducto(){
        System.out.println("sdzf");
        productos.guardarenArchivo();

    }
}
