USE TeFood
GO

-- KHÁCH HÀNG
CREATE PROCEDURE InsertKhachHang
    @MaKhachHang NVARCHAR(100),
    @TaiKhoan NVARCHAR(100),
    @MatKhau NVARCHAR(100),
    @SoDienThoai NVARCHAR(100),
    @Email NVARCHAR(100),
    @DiaChi NVARCHAR(MAX),
    @NgayTao DATE,
    @TrangThai NVARCHAR(100)
AS
BEGIN
    INSERT INTO KhachHang (MaKhachHang, TaiKhoan, MatKhau, SoDienThoai, Email, DiaChi, NgayTao, TrangThai)
    VALUES (@MaKhachHang, @TaiKhoan, @MatKhau, @SoDienThoai, @Email, @DiaChi, @NgayTao, @TrangThai)
END
GO

EXEC InsertKhachHang 'KH001', 'alice123', 'password123', '0123456789', 'alice@gmail.com', 'Ha Noi', '2024-11-22', 'Hoat dong'
EXEC InsertKhachHang 'KH002', 'bob234', 'password123', '0123456790', 'bob@gmail.com', 'Ho Chi Minh', '2024-11-22', 'Hoat dong'
EXEC InsertKhachHang 'KH003', 'carol345', 'password123', '0123456791', 'carol@gmail.com', 'Da Nang', '2024-11-22', 'Bi khoa'
EXEC InsertKhachHang 'KH004', 'david456', 'password123', '0123456792', 'david@gmail.com', 'Hai Phong', '2024-11-22', 'Hoat dong'
EXEC InsertKhachHang 'KH005', 'emma567', 'password123', '0123456793', 'emma@gmail.com', 'Can Tho', '2024-11-22', 'Hoat dong'
GO


-- SẢN PHẨM
CREATE PROCEDURE InsertSanPham
    @MaSanPham NVARCHAR(100),
    @TenSanPham NVARCHAR(100),
    @GiaBan FLOAT,
    @SoLuongTon INT,
    @MoTa NVARCHAR(MAX),
    @TrangThai NVARCHAR(20)
AS
BEGIN
    INSERT INTO SanPham (MaSanPham, TenSanPham, GiaBan, SoLuongTon, MoTa, TrangThai)
    VALUES (@MaSanPham, @TenSanPham, @GiaBan, @SoLuongTon, @MoTa, @TrangThai)
END
GO

EXEC InsertSanPham 'SP001', 'Mi tron Indomie', 15.5, 100, 'Mi tron huong vi Indomie', 'Con hang'
EXEC InsertSanPham 'SP002', 'Mi tron tuong den', 20.0, 50, 'Mi tron voi sot tuong den', 'Con hang'
EXEC InsertSanPham 'SP003', 'Banh mi nuong muoi ot', 12.0, 200, 'Banh mi nuong thom ngon, cay', 'Con hang'
EXEC InsertSanPham 'SP004', 'Tra chanh', 10.0, 300, 'Tra chanh mat lanh', 'Con hang'
EXEC InsertSanPham 'SP005', 'Ca phe da', 18.0, 150, 'Ca phe dam da', 'Con hang'
GO


-- ĐƠN HÀNG
CREATE PROCEDURE InsertDonHang
    @MaDonHang NVARCHAR(100),
    @MaKhachHang NVARCHAR(100),
    @NgayDatHang DATE,
    @TongTien FLOAT,
    @TrangThai NVARCHAR(100)
AS
BEGIN
    INSERT INTO DonHang (MaDonHang, MaKhachHang, NgayDatHang, TongTien, TrangThai)
    VALUES (@MaDonHang, @MaKhachHang, @NgayDatHang, @TongTien, @TrangThai)
END
GO

EXEC InsertDonHang 'DH001', 'KH001', '2024-11-22', 150.0, 'Da nhan hang'
EXEC InsertDonHang 'DH002', 'KH002', '2024-11-22', 200.0, 'Chua nhan hang'
EXEC InsertDonHang 'DH003', 'KH003', '2024-11-22', 250.0, 'Da nhan hang'
EXEC InsertDonHang 'DH004', 'KH004', '2024-11-22', 180.0, 'Chua nhan hang'
EXEC InsertDonHang 'DH005', 'KH005', '2024-11-22', 300.0, 'Da nhan hang'
GO


-- CHI TIẾT ĐƠN HÀNG
CREATE PROCEDURE InsertChiTietDonHang
    @MaChiTietDonHang NVARCHAR(100),
    @MaDonHang NVARCHAR(100),
    @MaSanPham NVARCHAR(100),
    @SoLuong INT,
    @ThanhTien FLOAT
AS
BEGIN
    INSERT INTO ChiTietDonHang (MaChiTietDonHang, MaDonHang, MaSanPham, SoLuong, ThanhTien)
    VALUES (@MaChiTietDonHang, @MaDonHang, @MaSanPham, @SoLuong, @ThanhTien)
END
GO

EXEC InsertChiTietDonHang 'CTDH001', 'DH001', 'SP001', 10, 155.0
EXEC InsertChiTietDonHang 'CTDH002', 'DH002', 'SP002', 20, 400.0
EXEC InsertChiTietDonHang 'CTDH003', 'DH003', 'SP003', 15, 180.0
EXEC InsertChiTietDonHang 'CTDH004', 'DH004', 'SP004', 30, 300.0
EXEC InsertChiTietDonHang 'CTDH005', 'DH005', 'SP005', 10, 180.0
GO


-- NHÂN VIÊN
CREATE PROCEDURE InsertNhanVien
    @MaNhanVien NVARCHAR(100),
    @TenNhanVien NVARCHAR(100),
    @VaiTro NVARCHAR(100),
    @SoDienThoai NVARCHAR(100),
    @Email NVARCHAR(100),
    @NgayVaoLam DATE
AS
BEGIN
    INSERT INTO NhanVien (MaNhanVien, TenNhanVien, VaiTro, SoDienThoai, Email, NgayVaoLam)
    VALUES (@MaNhanVien, @TenNhanVien, @VaiTro, @SoDienThoai, @Email, @NgayVaoLam)
END
GO

EXEC InsertNhanVien 'NV001', 'Nguyen Van A', 'Quan ly', '0987654321', 'a@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV002', 'Tran Thi B', 'Nhan vien ban hang', '0987654322', 'b@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV003', 'Le Minh C', 'Nhan vien giao hang', '0987654323', 'c@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV004', 'Phan Quoc D', 'Quan ly kho', '0987654324', 'd@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV005', 'Vu Thi E', 'Nhan vien ban hang', '0987654325', 'e@gmail.com', '2024-11-22'
GO


-- THANH TOÁN
CREATE PROCEDURE InsertThanhToan
    @MaThanhToan NVARCHAR(100),
    @MaDonHang NVARCHAR(100),
    @PhuongThuc NVARCHAR(100),
    @TrangThai NVARCHAR(100)
AS
BEGIN
    INSERT INTO ThanhToan (MaThanhToan, MaDonHang, PhuongThuc, TrangThai)
    VALUES (@MaThanhToan, @MaDonHang, @PhuongThuc, @TrangThai)
END
GO

EXEC InsertThanhToan 'TT001', 'DH001', 'Tien mat', 'Thanh cong'
EXEC InsertThanhToan 'TT002', 'DH002', 'Chuyen khoan', 'Thanh cong'
EXEC InsertThanhToan 'TT003', 'DH003', 'The tin dung', 'Thanh cong'
EXEC InsertThanhToan 'TT004', 'DH004', 'Tien mat', 'Thanh cong'
EXEC InsertThanhToan 'TT005', 'DH005', 'Chuyen khoan', 'Thanh cong'
GO


-- ĐÁNH GIÁ SẢN PHẨM
CREATE PROCEDURE InsertDanhGiaSanPham
    @MaDanhGia NVARCHAR(100),
    @MaKhachHang NVARCHAR(100),
    @MaSanPham NVARCHAR(100),
    @NoiDung NVARCHAR(MAX),
    @SoSao INT
AS
BEGIN
    INSERT INTO DanhGiaSanPham (MaDanhGia, MaKhachHang, MaSanPham, NoiDung, SoSao)
    VALUES (@MaDanhGia, @MaKhachHang, @MaSanPham, @NoiDung, @SoSao)
END
GO

EXEC InsertDanhGiaSanPham 'DG001', 'KH001', 'SP001', 'Mi rat ngon, huong vi chuan.', 5
EXEC InsertDanhGiaSanPham 'DG002', 'KH002', 'SP002', 'Tuong den dam vi nhung hoi man.', 4
EXEC InsertDanhGiaSanPham 'DG003', 'KH003', 'SP003', 'Banh mi ngon nhung khong gion.', 3
EXEC InsertDanhGiaSanPham 'DG004', 'KH004', 'SP004', 'Tra rat thom, giai nhiet tot.', 5
EXEC InsertDanhGiaSanPham 'DG005', 'KH005', 'SP005', 'Ca phe dam da, gia hop ly.', 4
GO
