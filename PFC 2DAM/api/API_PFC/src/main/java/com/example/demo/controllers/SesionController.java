package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * la siguiente clase es para los breakpoints relacionados con las sesiones
 */
@RestController
public class SesionController {
    @PostMapping("/api/iniciar-sesion")
    ResponseEntity<?> iniciarSesion(@RequestBody AccesoDTO sesion) throws SQLException {
        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;

        try {
            ps= c.prepareStatement("SELECT * FROM USUARIO WHERE NOMBRE_USUARIO like ? AND CONTRASENA like ?");
            ps.setString(1,sesion.getNombreUsuario());
            ps.setString(2, sesion.getClaveAcceso());
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                ps = c.prepareStatement("select * from POSEER  inner join ROL on ROL.ID_ROL=POSEER.ID_ROL WHERE POSEER.ID_USUARIO=?");
                ps.setInt(1, rs.getInt("ID_USUARIO"));
                List<String> roles = new ArrayList<>();
                ResultSet rs2 = ps.executeQuery();
                while (rs2.next()){
                    roles.add( rs2.getString("NOMBRE_ROL"));
                }
                re = ResponseEntity.ok(new UsuarioCompletoDTO(rs.getInt("ID_USUARIO"), rs.getString("NOMBRE_USUARIO"), rs.getString("APELLIDOS_USUARIO"), roles));
                System.out.println("inicio ok");
            }else{
                re = ResponseEntity.noContent().build();
                System.out.println("inicio ko");
            }

        }catch (SQLException e){
            System.out.println("Error al insertar datos");
            re = ResponseEntity.badRequest().build();
            throw new RuntimeException(e);
        }finally {
            if (ps!=null) ps.close();
            if (c!=null) c.close();
        }
        return re;
    }


}
