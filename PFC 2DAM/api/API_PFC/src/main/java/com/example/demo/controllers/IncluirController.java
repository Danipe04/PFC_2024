package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.ComidaDTO;
import com.example.demo.dtos.ContenerDTO;
import com.example.demo.dtos.IncluirDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IncluirController {
    @PostMapping("/api/bebidas-add")
    ResponseEntity<?> anadirBebida(@RequestBody IncluirDTO incluir) throws SQLException {
        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;
        List<ComidaDTO> comidas = new ArrayList<>();

        try {
            ps= c.prepareStatement("INSERT INTO INCLUIR (ID_BEBIDA, ID_TICKET, NUMB_PEDIDO) VALUES ((SELECT ID_BEBIDA FROM BEBIDA WHERE NOMBRE_BEBIDA like ?), ?, ?)");
            ps.setString(1, incluir.getBebida());
            ps.setInt(2, incluir.getId_ticket());
            ps.setInt(3, incluir.getNumb_pedido());
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
