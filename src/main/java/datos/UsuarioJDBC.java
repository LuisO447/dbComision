/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Luis
 */
public class UsuarioJDBC {
    
    private static final String Select = "select * from usuario";
    private static final String Update = "update usuario set username=?,password=? where id_usuario=?";
    private static final String Insert = "insert into usuario (username,password)values (?,?)";
    private static final String Delete = "delete from usuario where id_usuario=?";
    
    
    
}
