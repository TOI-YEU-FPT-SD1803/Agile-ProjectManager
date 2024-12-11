/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.repository;

import java.sql.*;
import java.util.ArrayList;
import tefood.model.NhanVien;
import tefood.utils.DbConnection;

/**
 *
 * @author longg
 */
public class RepositoryNV {
    DbConnection dbConnection;
    
    public ArrayList<NhanVien> getList() {
        String sql = "SELECT * FROM NhanVien";
        
        ArrayList<NhanVien> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("MaNhanVien");
                String ten = rs.getString("TenNhanVien");
                String vaiTro = rs.getString("VaiTro");
                String sdt = rs.getString("SoDienThoai");
                String email = rs.getString("Email");
                Date ngay = rs.getDate("NgayVaoLam");
                
                NhanVien nv = new NhanVien(ma, ten, vaiTro, sdt, email, ngay);
                result.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public NhanVien details(String maNV) {
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";
        
        NhanVien nv = new NhanVien();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, maNV);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("MaNhanVien");
                String ten = rs.getString("TenNhanVien");
                String vaiTro = rs.getString("VaiTro");
                String sdt = rs.getString("SoDienThoai");
                String email = rs.getString("Email");
                Date ngay = rs.getDate("NgayVaoLam");
                
                nv = new NhanVien(ma, ten, vaiTro, sdt, email, ngay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }
    
    public Boolean add(NhanVien nv) {
        String sql = "INSERT INTO NhanVien VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, nv.getMaNhanVien());
            ps.setObject(2, nv.getTenNhanVien());
            ps.setObject(3, nv.getVaiTro());
            ps.setObject(4, nv.getSoDienThoai());
            ps.setObject(5, nv.getEmail());
            ps.setObject(6, nv.getNgayVaoLam());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(NhanVien nv) {
        String sql = "UPDATE NhanVien SET TenNhanVien = ?, VaiTro = ?, SoDienThoai = ?, Email = ?, NgayVaoLam = ? WHERE MaNhanVien = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, nv.getTenNhanVien());
            ps.setObject(2, nv.getVaiTro());
            ps.setObject(3, nv.getSoDienThoai());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getNgayVaoLam());
            ps.setObject(6, nv.getMaNhanVien());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(String maNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNhanVien = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, maNV);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<NhanVien> searchDate(String ngayVL) {
        String sql = "SELECT * FROM NhanVien WHERE NgayVaoLam = ?";
        
        ArrayList<NhanVien> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ngayVL);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ma = rs.getString("MaNhanVien");
                String ten = rs.getString("TenNhanVien");
                String vaiTro = rs.getString("VaiTro");
                String sdt = rs.getString("SoDienThoai");
                String email = rs.getString("Email");
                Date ngay = rs.getDate("NgayVaoLam");
                
                NhanVien nv = new NhanVien(ma, ten, vaiTro, sdt, email, ngay);
                result.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
