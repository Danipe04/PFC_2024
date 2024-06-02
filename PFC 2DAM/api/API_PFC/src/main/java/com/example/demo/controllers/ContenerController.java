package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.AccesoDTO;
import com.example.demo.dtos.ComidaDTO;
import com.example.demo.dtos.ContenerDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ContenerController {
    @PostMapping("/api/postres-add")
    ResponseEntity<?> anadirPostre(@RequestBody ContenerDTO contener) throws SQLException {
        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;
        List<ComidaDTO> comidas = new ArrayList<>();

        try {
            ps= c.prepareStatement("INSERT INTO CONTENER (ID_POSTRE, ID_TICKET, NUMP_PEDIDO) VALUES ((SELECT ID_POSTRE FROM POSTRE WHERE NOMBRE_POSTRE like ?), ?, ?)");
            ps.setString(1, contener.getPostre());
            ps.setInt(2, contener.getId_ticket());
            ps.setInt(3, contener.getNump_pedido());
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
