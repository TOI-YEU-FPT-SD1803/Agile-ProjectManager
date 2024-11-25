/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.model;

/**
 *
 * @author long
 */
public class ThanhToan {
    public String MaThanhToan;
    public String MaDonHang;
    public String PhuongThuc;
    public String TrangThai;

    public ThanhToan() {
    }

    public ThanhToan(String MaThanhToan, String MaDonHang, String PhuongThuc, String TrangThai) {
        this.MaThanhToan = MaThanhToan;
        this.MaDonHang = MaDonHang;
        this.PhuongThuc = PhuongThuc;
        this.TrangThai = TrangThai;
    }

    public String getMaThanhToan() {
        return MaThanhToan;
    }

    public void setMaThanhToan(String MaThanhToan) {
        this.MaThanhToan = MaThanhToan;
    }

    public String getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(String MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public String getPhuongThuc() {
        return PhuongThuc;
    }

    public void setPhuongThuc(String PhuongThuc) {
        this.PhuongThuc = PhuongThuc;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
}
