/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.model;

import java.util.Date;

/**
 *
 * @author longg
 */
public class DonHang {
    public String MaDonHang;
    public String MaKhachHang;
    public Date NgayDatHang;
    public Double TongTien;
    public String TrangThai;

    public DonHang() {
    }

    public DonHang(String MaDonHang, String MaKhachHang, Date NgayDatHang, Double TongTien, String TrangThai) {
        this.MaDonHang = MaDonHang;
        this.MaKhachHang = MaKhachHang;
        this.NgayDatHang = NgayDatHang;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public Date getNgayDatHang() {
        return NgayDatHang;
    }

    public void setNgayDatHang(Date NgayDatHang) {
        this.NgayDatHang = NgayDatHang;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    
}
