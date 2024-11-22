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
        String sql = "SELECT * FROM KhachHang where Id = ?";
        
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
}
