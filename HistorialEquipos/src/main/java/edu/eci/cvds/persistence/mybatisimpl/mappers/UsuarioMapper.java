package edu.eci.cvds.persistence.mybatisimpl.mappers;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface UsuarioMapper {
    Usuario consultarUsuario(@Param("nombre")String var1);
    List<Usuario> consultarUsuarioPublico(@Param("nombre") String var1);
    Usuario Login(@Param("nombre")String var1, @Param("contrasena") String var2);
    void insertarUsuario(@Param("usuario") Usuario var1);

}