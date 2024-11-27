/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tefood.model;

/**
 *
 * @author long
 */
public class DanhGiaSanPham {
    public String MaDanhGia;
    public String MaKhachHang;
    public String MaSanPham;
    public String NoiDung;
    public int SoSao;

    public DanhGiaSanPham() {
    }

    public DanhGiaSanPham(String MaDanhGia, String MaKhachHang, String MaSanPham, String NoiDung, int SoSao) {
        this.MaDanhGia = MaDanhGia;
        this.MaKhachHang = MaKhachHang;
        this.MaSanPham = MaSanPham;
        this.NoiDung = NoiDung;
        this.SoSao = SoSao;
    }

    public String getMaDanhGia() {
        return MaDanhGia;
    }

    public void setMaDanhGia(String MaDanhGia) {
        this.MaDanhGia = MaDanhGia;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public int getSoSao() {
        return SoSao;
    }

    public void setSoSao(int SoSao) {
        this.SoSao = SoSao;
    }
}
