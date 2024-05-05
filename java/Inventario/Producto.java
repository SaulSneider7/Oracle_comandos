
package com.mycompany.inventario;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    //Atributos
    private String nombre;
    private int stock;
    
    //Constructor
    public Producto(String nombre, int stock){
        this.nombre = nombre;
        this.stock = stock;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getStock(){
        return stock;
    }
    
    //Metodo para actualizar el stock
    public void actualizarStock (int nuevoStock){
        this.stock = nuevoStock;
    }
    
    //==============================
    //  INVENTARIO
    //==============================
    public static class Inventario{
        //Atributo
        private  List<Producto> productos;
        
        //Constructor
        public Inventario(){
            this.productos = new ArrayList<>();
        }
        
        //Agregar producto
        public void agregarProducto( Producto producto){
            productos.add(producto);
        }
        
        //Eliminar producto
        public void eliminarProducto(String nombreProducto){
            Producto producto = buscarProducto(nombreProducto);
            if(producto != null){
                productos.remove(producto);
            }
        }
        
        //Buscar Producto
        public Producto buscarProducto(String nombre){
            for (Producto producto : productos){
                if(producto.getNombre().equals(nombre)){
                    return producto;
                }
            }
            return null;
        }
        
        //Obtener Stock
        public int obtenerStock(String nombreProducto){
            Producto producto = buscarProducto(nombreProducto);
            if(producto != null){
                return  producto.getStock();
            }
            return -1;
        }
    }
}
