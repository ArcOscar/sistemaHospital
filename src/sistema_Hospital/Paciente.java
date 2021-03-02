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
public class Paciente {
    private int id_paciente;
    private String nombre;
    private String ape_mat;
    private String ape_pat;
    private String fecha_nac;
    private String sexo;
    private String direccion;
    private String tel;
    private String bt;

    
    
    public void setId(int id){   this.id_paciente=id; }
    public int getId(){  return this.id_paciente; }
    public void setNombre(String nombre){   this.nombre=nombre; }
    public String getNombre(){  return this.nombre; }
    public void setApellido(String ape_mat){   this.ape_mat=ape_mat; }
    public String getApellido(){  return this.ape_mat; }
}
