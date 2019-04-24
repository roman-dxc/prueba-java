/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author rbatsyatsyny
 */
public class Tienda {
    private String nombre;
    private final ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public Tienda(){
        
    }
    public Tienda(String n){
        this.nombre = n;
    }
    
    public ArrayList<Cliente> obtenerClientes(){
        return this.listaClientes;
    }
    public Cliente obtenerClienteConNombre(String n){
        Cliente c = new Cliente();
        
        for (Cliente cliente: this.listaClientes){
            if (cliente.getNombre().equals(n)){
                c = cliente;
                break;
            }
        }
        
        return c;
    }
    public ArrayList<Cliente> obtenerClientesConEdad(int e){
        ArrayList<Cliente> listaCli = new ArrayList<>();
        
        for (Cliente cliente: this.listaClientes){
            if (cliente.getEdad() == e){
                listaCli.add(cliente);
            }
        }
        
        return listaCli;
    }
    public void añadirCliente(Cliente c){
        this.listaClientes.add(c);
    }
    public int cantidadClientes(){
        return this.listaClientes.size();
    }
    public double edadMediaClientes(){
        int sumaEdad = 0;
        
        for (Cliente cliente: this.listaClientes){
            sumaEdad += cliente.getEdad();
        }
        
        return sumaEdad / this.listaClientes.size();
    }
    public Cliente clienteViejuno(){
        Cliente cli = new Cliente("aux", 0);
        
        for (Cliente cliente: this.listaClientes){
            if (cliente.getEdad() > cli.getEdad()){
                cli = cliente;
            }
        }
        
        return cli;
    }
    public Cliente clientePuber(){
        Cliente cli = new Cliente("aux", 100);
        
        for (Cliente cliente: this.listaClientes){
            if (cliente.getEdad() < cli.getEdad()){
                cli = cliente;
            }
        }
        
        return cli;
    }
    public void vaciarTienda(){
        this.listaClientes.clear();
    }
    
    
}
