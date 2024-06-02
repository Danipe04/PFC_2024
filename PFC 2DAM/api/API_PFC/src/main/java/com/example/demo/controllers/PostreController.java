package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.BebidaDTO;
import com.example.demo.dtos.ComidaDTO;
import com.example.demo.dtos.PostreDTO;
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
public class PostreController {
    @GetMapping("/api/obtenerPostres")
    ResponseEntity<?> obtenerPostres() throws SQLException {
        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;
        List<PostreDTO> postres = new ArrayList<>();

        try {
            ps= c.prepareStatement("SELECT * FROM BEBIDA");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                postres.add(new PostreDTO(rs.getInt("ID_BEBIDA"), rs.getString("NOMBRE_BEBIDA")));
            }
            re = ResponseEntity.ok(postres);

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
    @PostMapping("/api/crearPostre")
    ResponseEntity<?> crearpostre(@RequestBody PostreDTO postre) throws SQLException {

        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;

        try {
            ps= c.prepareStatement("INSERT INTO POSTRE (NOMBRE_POSTRE) VALUES (?)");
            ps.setString(1, postre.getNombre_postre());
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
