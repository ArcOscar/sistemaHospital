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
public class Cliente {
    private String nombre;
    private int id;
    
    public void setId(int id){   this.id=id; }
    public int getId(){  return this.id; }
    public void setNombre(String nombre){   this.nombre=nombre; }
    public String getNombre(){  return this.nombre; }
    
    
    public Cliente(){}
}
