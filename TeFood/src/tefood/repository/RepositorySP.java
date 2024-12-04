/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.repository;

import java.sql.*;
import java.util.ArrayList;
import tefood.model.SanPham;
import tefood.utils.DbConnection;

/**
 *
 * @author longg
 */
public class RepositorySP {
    DbConnection dbConnection;
    
    public ArrayList<SanPham> getList() {
        String sql = "SELECT * FROM SanPham";
        
        ArrayList<SanPham> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String MaSanPham = rs.getString("MaSanPham");
                String TenSanPham = rs.getString("TenSanPham");
                Double GiaBan  = rs.getDouble("GiaBan");
                Integer SoLuongTon = rs.getInt("SoLuongTon");
                String MoTa = rs.getString("MoTa");
                String TrangThai = rs.getString("TrangThai");
                
                SanPham sp = new SanPham(MaSanPham, TenSanPham, GiaBan, SoLuongTon, MoTa, TrangThai);
                result.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public SanPham details(String Ma) {
        String sql = "SELECT * FROM SanPham WHERE MaSanPham = ?";
        
        SanPham sp = new SanPham();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, Ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String MaSanPham = rs.getString("MaSanPham");
                String TenSanPham = rs.getString("TenSanPham");
                Double GiaBan  = rs.getDouble("GiaBan");
                Integer SoLuongTon = rs.getInt("SoLuongTon");
                String MoTa = rs.getString("MoTa");
                String TrangThai = rs.getString("TrangThai");
                
                sp = new SanPham(MaSanPham, TenSanPham, GiaBan, SoLuongTon, MoTa, TrangThai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
    }
    
    public Boolean add(SanPham sp) {
        String sql = "EXEC InsertSanPham ?, ?, ?, ?, ?, ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sp.getMaSanPham());
            ps.setObject(2, sp.getTenSanPham());
            ps.setObject(3, sp.getGiaBan());
            ps.setObject(4, sp.getSoLuongTon());
            ps.setObject(5, sp.getMoTa());
            ps.setObject(6, sp.getTrangThai());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(SanPham sp) {
        String sql = "UPDATE SanPham\n" 
                + "SET \n" 
                + "TenSanPham = ?,\n" 
                + "GiaBan = ?,\n" 
                + "SoLuongTon = ?,\n" 
                + "MoTa = ?,\n" 
                + "TrangThai = ?,\n" 
                + "WHERE MaSanPham = ?";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, sp.getTenSanPham());
            ps.setObject(2, sp.getGiaBan());
            ps.setObject(3, sp.getSoLuongTon());
            ps.setObject(4, sp.getMoTa());
            ps.setObject(5, sp.getTrangThai());
            ps.setObject(6, sp.getMaSanPham());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(String Ma) {
        String sql = "DELETE FROM SanPham WHERE MaSanPham = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, Ma);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<SanPham> searchPrice(Double min, Double max) {
        String sql = "SELECT * FROM SanPham WHERE GiaBan BETWEEN ? and ?";
        
        ArrayList<SanPham> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, min);
            ps.setObject(2, max);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String MaSanPham = rs.getString("MaSanPham");
                String TenSanPham = rs.getString("TenSanPham");
                Double GiaBan  = rs.getDouble("GiaBan");
                Integer SoLuongTon = rs.getInt("SoLuongTon");
                String MoTa = rs.getString("MoTa");
                String TrangThai = rs.getString("TrangThai");
                
                SanPham sp = new SanPham(MaSanPham, TenSanPham, GiaBan, SoLuongTon, MoTa, TrangThai);
                result.add(sp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
