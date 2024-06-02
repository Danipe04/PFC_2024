package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.BebidaDTO;
import com.example.demo.dtos.ComidaDTO;
import com.example.demo.dtos.RolDTO;
import com.example.demo.dtos.UsuarioCompletoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ComidaController {
    @GetMapping("/api/obtenerComidas")
    ResponseEntity<?> obtenerComidas() throws SQLException {
        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;
        List<ComidaDTO> comidas = new ArrayList<>();

        try {
            ps= c.prepareStatement("SELECT * FROM COMIDA");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                comidas.add(new ComidaDTO(rs.getInt("ID_COMIDA"), rs.getString("NOMBRE_COMIDA")));
            }
            re = ResponseEntity.ok(comidas);

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
    @PostMapping("/api/crearComida")
    ResponseEntity<?> crearComida(@RequestBody ComidaDTO comida) throws SQLException {

        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;

        try {
            ps= c.prepareStatement("INSERT INTO COMIDA (NOMBRE_COMIDA) VALUES (?)");
            ps.setString(1, comida.getNombre_comida());
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
