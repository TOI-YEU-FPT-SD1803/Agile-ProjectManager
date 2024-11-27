/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import tefood.model.KhachHang;
import tefood.utils.DbConnection;
import java.util.Date;
import java.sql.*;
import java.util.List;

/**
 *
 * @author longg
 */
public class RepositoryKH {
    DbConnection dbConnection;
    
    public ArrayList<KhachHang> getList() {
        String sql = "SELECT * FROM KhachHang";
        
        ArrayList<KhachHang> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String MaKhachHang = rs.getString("MaKhachHang");
                String TaiKhoan = rs.getString("TaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String SoDienThoai = rs.getString("SoDienThoai");
                String Email = rs.getString("Email");
                String DiaChi = rs.getString("DiaChi");
                Date NgayTao = rs.getDate("NgayTao");
                String TrangThai = rs.getString("TrangThai");
                
                KhachHang kh = new KhachHang(MaKhachHang, TaiKhoan, MatKhau, SoDienThoai, Email, DiaChi, NgayTao, TrangThai);
                result.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public KhachHang details(String Ma) {
        String sql = "SELECT * FROM KhachHang where MaKhachHang = ?";
        
        KhachHang kh = new KhachHang();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, Ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String MaKhachHang = rs.getString("MaKhachHang");
                String TaiKhoan = rs.getString("TaiKhoan");
                String MatKhau = rs.getString("MatKhau");
                String SoDienThoai = rs.getString("SoDienThoai");
                String Email = rs.getString("Email");
                String DiaChi = rs.getString("DiaChi");
                Date NgayTao = rs.getDate("NgayTao");
                String TrangThai = rs.getString("TrangThai");
                
                kh = new KhachHang(MaKhachHang, TaiKhoan, MatKhau, SoDienThoai, Email, DiaChi, NgayTao, TrangThai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }
    
    public Boolean add(KhachHang kh) {
        String sql = "EXEC InsertKhachHang "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?, "
                + "?";
        try (Connection co = dbConnection.getConnection(); 
                PreparedStatement ps = co.prepareStatement(sql)) {
            ps.setObject(1, kh.getMaKhachHang());
            ps.setObject(2, kh.getTaiKhoan());
            ps.setObject(3, kh.getMatKhau());
            ps.setObject(4, kh.getSoDienThoai());
            ps.setObject(5, kh.getEmail());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getNgayTao());
            ps.setObject(8, kh.getTrangThai());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(KhachHang kh) {
        String sql = "UPDATE KhachHang\n" 
                + "SET \n" 
                + "TaiKhoan = ?,\n" 
                + "MatKhau = ?,\n" 
                + "SoDienThoai = ?,\n" 
                + "Email = ?,\n" 
                + "DiaChi = ?,\n" 
                + "TrangThai = ?\n" 
                + "WHERE MaKhachHang = ?";
        try (Connection co = dbConnection.getConnection(); 
                PreparedStatement ps = co.prepareStatement(sql)) {
            ps.setObject(1, kh.getTaiKhoan());
            ps.setObject(2, kh.getMatKhau());
            ps.setObject(3, kh.getSoDienThoai());
            ps.setObject(4, kh.getEmail());
            ps.setObject(5, kh.getDiaChi());
            ps.setObject(6, kh.getTrangThai());
            ps.setObject(7, kh.getMaKhachHang());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(String MaKhachHang) {
        String sql = "DELETE FROM KhachHang WHERE MaKhachHang = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setObject(1, MaKhachHang);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public KhachHang search(String MaKhachHang) {
        String sql = "SELECT * FROM KhachHang "
                + "WHERE MaKhachHang = ?";
        try (Connection co = dbConnection.getConnection(); 
                PreparedStatement ps = co.prepareStatement(sql)) {
            ps.setObject(1, MaKhachHang);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getString("MaKhachHang"));
                kh.setTaiKhoan(rs.getString("TaiKhoan"));
                kh.setMatKhau(rs.getString("MatKhau"));
                kh.setSoDienThoai(rs.getString("SoDienThoai"));
                kh.setEmail(rs.getString("Email"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setNgayTao(rs.getDate("NgayTao"));
                kh.setTrangThai(rs.getString("TrangThai"));
                return kh;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    //GPT-4o
    public List<KhachHang> searchByTaiKhoan(String TaiKhoan) {
        String sql = "SELECT * FROM KhachHang WHERE TaiKhoan LIKE ?";
        List<KhachHang> selectedList = new ArrayList<>();
        try (Connection co = dbConnection.getConnection();
             PreparedStatement ps = co.prepareStatement(sql)) {

            ps.setString(1, "%" + TaiKhoan + "%"); // Tìm kiếm gần đúng với từ khóa

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getString("MaKhachHang"));
                kh.setTaiKhoan(rs.getString("TaiKhoan"));
                kh.setMatKhau(rs.getString("MatKhau"));
                kh.setSoDienThoai(rs.getString("SoDienThoai"));
                kh.setEmail(rs.getString("Email"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setNgayTao(rs.getDate("NgayTao"));
                kh.setTrangThai(rs.getString("TrangThai"));
                selectedList.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return selectedList;
    }
    
    public static void main(String[] args) {
        new RepositoryKH().getList();
    }
}
