package data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import objects.Oficina;

public class OficinaDAO extends DataAccessObject {

    // CONSTRUCTOR
    public OficinaDAO(Connection cnt) {
        super(cnt);
    }

    // METODOS
    // Obtiene todas las oficinas de la base de datos
    public List<Oficina> obtenerTodasLasOficinas() throws SQLException{
        List<Oficina> oficinas = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM oficinas");
        ResultSet result = stmt.executeQuery();

        while (result.next()) {
            oficinas.add(crearOficinaDesdeResultSet(result));
        }
     
        return oficinas;
    }

    // Pasa de una fila de la tabla 'oficinas' a un objeto 'Oficina'
    private Oficina crearOficinaDesdeResultSet(ResultSet res) throws SQLException {
        String codigoOficina = res.getString("CodigoOficina");
        String ciudad = res.getString("Ciudad");
        String pais = res.getString("Pais");
        String region = res.getString("Region");
        String codigoPostal = res.getString("CodigoPostal");
        String telefono = res.getString("Telefono");
        String lineaDireccion1 = res.getString("LineaDireccion1");
        String lineaDireccion2 = res.getString("LineaDireccion2");
        
        return new Oficina(codigoOficina, ciudad, pais, region, codigoPostal, telefono, lineaDireccion1, lineaDireccion2);
    }

    public Oficina buscarOficinaPorCodigo(String codigoOficina) throws SQLException {
        String query = "SELECT * FROM oficinas WHERE codigo_oficina = ?";
        try (PreparedStatement pstmt = cnt.prepareStatement(query)) {
            pstmt.setString(1, codigoOficina);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String ciudad = rs.getString("ciudad");
                    String pais = rs.getString("pais");
                    String region = rs.getString("region");
                    String codigoPostal = rs.getString("codigo_postal");
                    String telefono = rs.getString("telefono");
                    String lineaDireccion1 = rs.getString("linea_direccion1");
                    String lineaDireccion2 = rs.getString("linea_direccion2");
                    return new Oficina(codigoOficina, ciudad, pais, region, codigoPostal, telefono, lineaDireccion1, lineaDireccion2);
                } else {
                    return null; // La oficina no fue encontrada
                }
            }
        }
    }

    public boolean eliminarOficinaPorCodigo(String codigoOficina) throws SQLException {
        String query = "DELETE FROM oficinas WHERE codigo_oficina = ?";
        try (PreparedStatement pstmt = cnt.prepareStatement(query)) {
            pstmt.setString(1, codigoOficina);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    public void agregarOficina(Oficina oficina) throws SQLException {
        String query = "INSERT INTO oficinas (codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1, linea_direccion2) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = cnt.prepareStatement(query)) {
            pstmt.setString(1, oficina.getCodigoOficina());
            pstmt.setString(2, oficina.getCiudad());
            pstmt.setString(3, oficina.getPais());
            pstmt.setString(4, oficina.getRegion());
            pstmt.setString(5, oficina.getCodigoPostal());
            pstmt.setString(6, oficina.getTelefono());
            pstmt.setString(7, oficina.getLineaDireccion1());
            pstmt.setString(8, oficina.getLineaDireccion2());
            pstmt.executeUpdate();
        }
    }

    public List<Oficina> buscarOficinasPorCiudad(String ciudad) throws SQLException {
        List<Oficina> oficinas = new ArrayList<>();
        String query = "SELECT * FROM oficinas WHERE ciudad = ?";
        try (PreparedStatement pstmt = cnt.prepareStatement(query)) {
            pstmt.setString(1, ciudad);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    oficinas.add(crearOficinaDesdeResultSet(rs));
                }
            }
        }
        return oficinas;
    }

    public Oficina buscarOficinaPorTelefono(String telefono) throws SQLException {
        String query = "SELECT * FROM oficinas WHERE telefono = ?";
        try (PreparedStatement pstmt = cnt.prepareStatement(query)) {
            pstmt.setString(1, telefono);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String codigoOficina = rs.getString("codigo_oficina");
                    String ciudad = rs.getString("ciudad");
                    String pais = rs.getString("pais");
                    String region = rs.getString("region");
                    String codigoPostal = rs.getString("codigo_postal");
                    String lineaDireccion1 = rs.getString("linea_direccion1");
                    String lineaDireccion2 = rs.getString("linea_direccion2");
                    return new Oficina(codigoOficina, ciudad, pais, region, codigoPostal, telefono, lineaDireccion1, lineaDireccion2);
                } else {
                    return null; // La oficina no fue encontrada
                }
            }
        }
    }
}
