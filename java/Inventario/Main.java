
package com.mycompany.inventario;

import java.util.Scanner;


public class Inventario {

    public static void main(String[] args) {
        Producto.Inventario inventario = new Producto.Inventario();
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        while (opcion != 6){
            System.out.println("Menu de Opciones");
            System.out.println("1. Crear Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Actualizar Stock");
            System.out.println("5. Obtener Stock");
            System.out.println("6. Salir");
            System.out.print("Ingrese el numero de una opcion:");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el stock del producto");
                    int stock = scanner.nextInt();
                    scanner.nextLine();
                    inventario.agregarProducto(new Producto(nombre, stock));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombreBuscar = scanner.nextLine();
                    Producto producto = inventario.buscarProducto(nombreBuscar);
                    if( producto != null){
                        System.out.println("Producto Encontrado: " + producto.getNombre() + ", Stock: " + producto.getStock());
                    } else{
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto a ELIMINAR");
                    String nombreEliminar = scanner.nextLine();
                    inventario.eliminarProducto(nombreEliminar);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del producto a ACTUALIZAR");
                    String nombreActualizar = scanner.nextLine();
                    System.out.println("Ingrese le nuevo stock");
                    int nuevoStock = scanner.nextInt();
                    scanner.nextLine();
                    Producto productoActualizar = inventario.buscarProducto(nombreActualizar);
                    if( productoActualizar != null){
                        productoActualizar.actualizarStock(nuevoStock);
                        System.out.println("Stock Actualizado");
                    } else{
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del producto a OBTENER STOCK");
                    String nombreObtener = scanner.nextLine();
                    int stockObtener = inventario.obtenerStock(nombreObtener);
                    if (stockObtener != -1) {
                        System.out.println("Stock del producto: " + stockObtener);
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion Invalida, Intente nuevamente");
            }
        }
    }
}
