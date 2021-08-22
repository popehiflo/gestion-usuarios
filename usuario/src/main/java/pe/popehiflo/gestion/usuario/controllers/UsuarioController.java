package pe.popehiflo.gestion.usuario.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.popehiflo.gestion.usuario.models.Usuario;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pool");
        usuario.setApellido("Hijuela");
        usuario.setEmail("email@email.com");
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
