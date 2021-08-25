package pe.popehiflo.gestion.usuario.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.popehiflo.gestion.usuario.models.Usuario;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    // Listar usuarios
    @RequestMapping(value = "usuarios")
    public List<Usuario> listUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario usuario0 = new Usuario();
        usuario0.setId(100L);
        usuario0.setNombre("Pool");
        usuario0.setApellido("Hijuela");
        usuario0.setEmail("poolhijuel@hotmail.com");
        usuario0.setTelefono("974265159");

        Usuario usuario1 = new Usuario();
        usuario1.setId(101L);
        usuario1.setNombre("Petter");
        usuario1.setApellido("Hijuela");
        usuario1.setEmail("micorreo@hotmail.com");
        usuario1.setTelefono("974235689");

        Usuario usuario2 = new Usuario();
        usuario2.setId(102L);
        usuario2.setNombre("Tirza");
        usuario2.setApellido("Rupertina");
        usuario2.setEmail("rupertin@hotmail.com");
        usuario2.setTelefono("974124578");

        usuarios.add(usuario0);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        return usuarios;
    }

    //Obtener un solo usuario
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pool");
        usuario.setApellido("Hijuela");
        usuario.setEmail("poolhijuel@hotmail.com");
        usuario.setTelefono("974265159");
        return usuario;
    }

    @RequestMapping(value = "editar")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pool");
        usuario.setApellido("Hijuela");
        usuario.setEmail("email@email.com");
        usuario.setTelefono("974265159");
        return usuario;
    }

    @RequestMapping(value = "eliminar")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pool");
        usuario.setApellido("Hijuela");
        usuario.setEmail("email@email.com");
        usuario.setTelefono("974265159");
        return usuario;
    }

    @RequestMapping(value = "buscar")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Pool");
        usuario.setApellido("Hijuela");
        usuario.setEmail("email@email.com");
        usuario.setTelefono("974265159");
        return usuario;
    }
}
