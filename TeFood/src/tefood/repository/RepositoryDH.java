/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.repository;

import java.sql.*;
import java.util.ArrayList;
import tefood.model.DonHang;
import tefood.utils.DbConnection;

/**
 *
 * @author longg
 */
public class RepositoryDH {
    DbConnection dbConnection;
    
    public ArrayList<DonHang> getList() {
        String sql = "SELECT * FROM DonHang";
        
        ArrayList<DonHang> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maDH = rs.getString("MaDonHang");
                String maKH = rs.getString("MaKhachHang");
                Date ngayDatHang = rs.getDate("NgayDatHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                
                DonHang dh = new DonHang(maDH, maKH, ngayDatHang, tongTien, trangThai);
                result.add(dh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public DonHang details(String ma) {
        String sql = "SELECT * FROM DonHang WHERE MaDonHang = ?";
        
        DonHang dh = new DonHang();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maDH = rs.getString("MaDonHang");
                String maKH = rs.getString("MaKhachHang");
                Date ngayDatHang = rs.getDate("NgayDatHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                
                dh = new DonHang(maDH, maKH, ngayDatHang, tongTien, trangThai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dh;
    }
    
    public Boolean add(DonHang dh) {
        String sql = "INSERT INTO DonHang VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, dh.getMaDonHang());
            ps.setObject(2, dh.getMaKhachHang());
            ps.setObject(3, dh.getNgayDatHang());
            ps.setObject(4, dh.getTongTien());
            ps.setObject(5, dh.getTrangThai());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean update(DonHang dh) {
        String sql = "UPDATE DonHang SET MaKhachHang = ?, NgayDatHang = ?, TongTien = ?, TrangThai = ? WHERE MaDonHang = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, dh.getMaKhachHang());
            ps.setObject(2, dh.getNgayDatHang());
            ps.setObject(3, dh.getTongTien());
            ps.setObject(4, dh.getTrangThai());
            ps.setObject(5, dh.getMaDonHang());
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Boolean remove(String ma) {
        String sql = "DELETE FROM DonHang WHERE MaDonHang = ?";
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ma);
            
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<DonHang> searchDate(String ngay) {
        String sql = "SELECT * FROM DonHang WHERE NgayDatHang = ?";
        
        ArrayList<DonHang> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, ngay);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maDH = rs.getString("MaDonHang");
                String maKH = rs.getString("MaKhachHang");
                Date ngayDatHang = rs.getDate("NgayDatHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                
                DonHang dh = new DonHang(maDH, maKH, ngayDatHang, tongTien, trangThai);
                result.add(dh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ArrayList<DonHang> searchTotal(Double min, Double max) {
        String sql = "SELECT * FROM DonHang WHERE TongTien BETWEEN ? AND ?";
        
        ArrayList<DonHang> result = new ArrayList<>();
        
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, min);
            ps.setObject(2, max);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String maDH = rs.getString("MaDonHang");
                String maKH = rs.getString("MaKhachHang");
                Date ngayDatHang = rs.getDate("NgayDatHang");
                Double tongTien = rs.getDouble("TongTien");
                String trangThai = rs.getString("TrangThai");
                
                DonHang dh = new DonHang(maDH, maKH, ngayDatHang, tongTien, trangThai);
                result.add(dh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
