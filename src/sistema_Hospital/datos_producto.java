/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_Hospital;

/**
 *
 * @author erawo
 */
public class datos_producto {
       private String marca;
       private double precio;
       private int id;
       private String nombre;
    public int existencia;

    
     public void setId(int id)  {   this.id= id;   }
    public int getId()  {   return this.id;   }
    public void setmarca(String marca)    {   this.marca = marca;   }
    public String getmarca()   {   return this.marca; }
    public void setPrecio(double precio)    {   this.precio = precio;   }
    public double getPrecio()   {   return this.precio; }
    public void setExistencia(int existencia)    {   this.existencia = existencia;   }
    public int getexistencia()   {   return this.existencia; }
    
}
