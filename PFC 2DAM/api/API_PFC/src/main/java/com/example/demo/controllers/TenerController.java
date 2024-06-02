package com.example.demo.controllers;

import com.example.demo.Conexion;
import com.example.demo.dtos.ComidaDTO;
import com.example.demo.dtos.ContenerDTO;
import com.example.demo.dtos.TenerDTO;
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
public class TenerController {
    @PostMapping("/api/comida-add")
    ResponseEntity<?> anadirComida(@RequestBody TenerDTO tener) throws SQLException {
        ResponseEntity re = null;
        Connection c = Conexion.obtenerConexion();
        PreparedStatement ps = null;
        List<ComidaDTO> comidas = new ArrayList<>();

        try {
            ps= c.prepareStatement("INSERT INTO TENER (ID_COMIDA, ID_TICKET, NUMC_PEDIDO) VALUES ((SELECT ID_COMIDA FROM COMIDA WHERE NOMBRE_COMIDA like ?), ?, ?)");
            ps.setString(1, tener.getComida());
            ps.setInt(2, tener.getId_ticket());
            ps.setInt(3, tener.getNumc_pedido());
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
    }}
