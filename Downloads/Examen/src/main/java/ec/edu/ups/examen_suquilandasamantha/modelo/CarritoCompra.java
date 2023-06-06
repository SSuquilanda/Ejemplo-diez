/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.examen_suquilandasamantha.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;




/**
 *
 * @author ESTUDIANTE
 */
public class CarritoCompra {
    private Date fecha;
    private double subtotal;
    private double iva;
    private double total;
    private int codigo;
    private List<Cliente> clientes;
    private List<Producto> productos;
    
    public CarritoCompra (Date fecha, double subtotal, int codigo) {
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.codigo = codigo;
        this.clientes = new ArrayList();
        this.productos = new ArrayList();
    }

    public CarritoCompra(int codigo) {
        this.codigo = codigo;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.fecha);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.subtotal) ^ (Double.doubleToLongBits(this.subtotal) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.codigo) ^ (Double.doubleToLongBits(this.codigo) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.clientes);
        hash = 59 * hash + Objects.hashCode(this.productos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarritoCompra other = (CarritoCompra) obj;
        if (Double.doubleToLongBits(this.subtotal) != Double.doubleToLongBits(other.subtotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (Double.doubleToLongBits(this.codigo) != Double.doubleToLongBits(other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        return Objects.equals(this.productos, other.productos);
    }

    @Override
    public String toString() {
        return "Carrito{" + "fecha=" + fecha + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + ", codigo=" + codigo + ", clientes=" + clientes + ", productos=" + productos + '}';
    }

    
    

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public double calcularIva(CarritoCompra carritoCompra){
        double Iva = carritoCompra.getSubtotal()*0.12;
     return Iva;   
    }
    
    public double calcularTotal(CarritoCompra carritoCompra){
        double Total = carritoCompra.getSubtotal() + carritoCompra.getIva();
        return Total;
    }
}

    
    
    
    
    
    
    
    
    

