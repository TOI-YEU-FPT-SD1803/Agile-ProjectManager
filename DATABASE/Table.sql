USE TeFood
GO

--8
CREATE TABLE KhachHang (
    MaKhachHang NVARCHAR(100) PRIMARY KEY,
    TaiKhoan NVARCHAR(100),
    MatKhau NVARCHAR(100),
    SoDienThoai NVARCHAR(100),
    Email NVARCHAR(100),
    DiaChi NVARCHAR(MAX),
    NgayTao DATE,
    TrangThai NVARCHAR(100) -- Ví dụ: 'Hoạt động', 'Bị khóa'
);
GO

--6
CREATE TABLE SanPham (
    MaSanPham NVARCHAR(100) PRIMARY KEY,
    TenSanPham NVARCHAR(100),
    GiaBan FLOAT,
    SoLuongTon INT,
    MoTa NVARCHAR(MAX),
    TrangThai NVARCHAR(20) -- Ví dụ: 'Còn hàng', 'Hết hàng'
);
GO

--5
CREATE TABLE DonHang (
    MaDonHang NVARCHAR(100) PRIMARY KEY,
    MaKhachHang NVARCHAR(100),
    NgayDatHang DATE,
    TongTien FLOAT,
    TrangThai NVARCHAR(100), -- Đã nhận hàng, Chưa nhận hàng
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang)
);
GO

--5
CREATE TABLE ChiTietDonHang (
    MaChiTietDonHang NVARCHAR(100) PRIMARY KEY,
    MaDonHang NVARCHAR(100),
    MaSanPham NVARCHAR(100),
    SoLuong INT,
    ThanhTien FLOAT,
    FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang),
    FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham)
);
GO

--6
CREATE TABLE NhanVien (
    MaNhanVien NVARCHAR(100) PRIMARY KEY,
    TenNhanVien NVARCHAR(100),
    VaiTro NVARCHAR(100),
    SoDienThoai NVARCHAR(100),
    Email NVARCHAR(100),
    NgayVaoLam DATE
);
GO

--4
CREATE TABLE ThanhToan (
    MaThanhToan NVARCHAR(100) PRIMARY KEY,
    MaDonHang NVARCHAR(100),
    PhuongThuc NVARCHAR(100),
    TrangThai NVARCHAR(100), -- Thành công, Thất bại
    FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang)
);
GO

--5
CREATE TABLE DanhGiaSanPham (
    MaDanhGia NVARCHAR(100) PRIMARY KEY,
    MaKhachHang NVARCHAR(100),
    MaSanPham NVARCHAR(100),
    NoiDung NVARCHAR(MAX),
    SoSao INT, -- 1 - 5
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
    FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham)
);
GO