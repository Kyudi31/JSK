package Usuarios;

public class Administrador extends Usuario {
    private boolean Lindo;
    private Usuario usuario;
    public Administrador(long id, String nombre, String contraseña, String Email, boolean lindo) {
        super(id, nombre, contraseña, Email);
        Lindo = lindo;
    }
    
    public Usuario CrearUsuario(){
        return usuario;
    }
    
    public Usuario AsignarRol(){
        return usuario;
    }
    
    public Usuario EliminarUsuario(){
        return usuario;
    }
    
}
