package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @PostMapping("/api/crearUsuario")
    ResponseEntity<?> crearUsuario(@RequestBody UsuarioDTO usuario) throws SQLException {

            ResponseEntity re = null;
            Connection c = Conexion.obtenerConexion();
            PreparedStatement ps = null;
            List<ComidaDTO> comidas = new ArrayList<>();

            try {
                ps= c.prepareStatement("INSERT INTO USUARIO (NOMBRE_USUARIO, APELLIDOS_USUARIO, CONTRASENA) VALUES (?, ?, ?)");
                ps.setString(1, usuario.getNombre());
                ps.setString(2, usuario.getApellidos());
                ps.setString(3, usuario.getContrasena());
                ps.executeUpdate();

                re = ResponseEntity.ok().build();

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



