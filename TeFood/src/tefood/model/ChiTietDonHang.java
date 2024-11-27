/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.model;

/**
 *
 * @author longg
 */
public class ChiTietDonHang {
    public String MaChiTietDonHang;
    public String MaDonHang;
    public String MaSanPham;
    public int SoLuong;
    public double ThanhTien;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(String MaChiTietDonHang, String MaDonHang, String MaSanPham, int SoLuong, double ThanhTien) {
        this.MaChiTietDonHang = MaChiTietDonHang;
        this.MaDonHang = MaDonHang;
        this.MaSanPham = MaSanPham;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public String getMaChiTietDonHang() {
        return MaChiTietDonHang;
    }

    public void setMaChiTietDonHang(String MaChiTietDonHang) {
        this.MaChiTietDonHang = MaChiTietDonHang;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}
