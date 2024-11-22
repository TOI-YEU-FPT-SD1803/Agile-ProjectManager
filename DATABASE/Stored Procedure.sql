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

EXEC InsertKhachHang 'KH001', 'alice123', 'password123', '0123456789', 'alice@gmail.com', 'Hà Nội', '2024-11-22', 'Hoạt động'
EXEC InsertKhachHang 'KH002', 'bob234', 'password123', '0123456790', 'bob@gmail.com', 'Hồ Chí Minh', '2024-11-22', 'Hoạt động'
EXEC InsertKhachHang 'KH003', 'carol345', 'password123', '0123456791', 'carol@gmail.com', 'Đà Nẵng', '2024-11-22', 'Bị khóa'
EXEC InsertKhachHang 'KH004', 'david456', 'password123', '0123456792', 'david@gmail.com', 'Hải Phòng', '2024-11-22', 'Hoạt động'
EXEC InsertKhachHang 'KH005', 'emma567', 'password123', '0123456793', 'emma@gmail.com', 'Cần Thơ', '2024-11-22', 'Hoạt động'
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

EXEC InsertSanPham 'SP001', 'Mì trộn Indomie', 15.5, 100, 'Mì trộn hương vị Indomie', 'Còn hàng'
EXEC InsertSanPham 'SP002', 'Mì trộn tương đen', 20.0, 50, 'Mì trộn với sốt tương đen', 'Còn hàng'
EXEC InsertSanPham 'SP003', 'Bánh mì nướng muối ớt', 12.0, 200, 'Bánh mì nướng thơm ngon, cay', 'Còn hàng'
EXEC InsertSanPham 'SP004', 'Trà chanh', 10.0, 300, 'Trà chanh mát lạnh', 'Còn hàng'
EXEC InsertSanPham 'SP005', 'Cà phê đá', 18.0, 150, 'Cà phê đậm đà', 'Còn hàng'
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

EXEC InsertDonHang 'DH001', 'KH001', '2024-11-22', 150.0, 'Đã nhận hàng'
EXEC InsertDonHang 'DH002', 'KH002', '2024-11-22', 200.0, 'Chưa nhận hàng'
EXEC InsertDonHang 'DH003', 'KH003', '2024-11-22', 250.0, 'Đã nhận hàng'
EXEC InsertDonHang 'DH004', 'KH004', '2024-11-22', 180.0, 'Chưa nhận hàng'
EXEC InsertDonHang 'DH005', 'KH005', '2024-11-22', 300.0, 'Đã nhận hàng'
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

EXEC InsertNhanVien 'NV001', 'Nguyễn Văn A', 'Quản lý', '0987654321', 'a@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV002', 'Trần Thị B', 'Nhân viên bán hàng', '0987654322', 'b@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV003', 'Lê Minh C', 'Nhân viên giao hàng', '0987654323', 'c@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV004', 'Phan Quốc D', 'Quản lý kho', '0987654324', 'd@gmail.com', '2024-11-22'
EXEC InsertNhanVien 'NV005', 'Vũ Thị E', 'Nhân viên bán hàng', '0987654325', 'e@gmail.com', '2024-11-22'
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

EXEC InsertThanhToan 'TT001', 'DH001', 'Tiền mặt', 'Thành công'
EXEC InsertThanhToan 'TT002', 'DH002', 'Chuyển khoản', 'Thành công'
EXEC InsertThanhToan 'TT003', 'DH003', 'Thẻ tín dụng', 'Thành công'
EXEC InsertThanhToan 'TT004', 'DH004', 'Tiền mặt', 'Thành công'
EXEC InsertThanhToan 'TT005', 'DH005', 'Chuyển khoản', 'Thành công'
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

EXEC InsertDanhGiaSanPham 'DG001', 'KH001', 'SP001', 'Mì rất ngon, hương vị chuẩn.', 5
EXEC InsertDanhGiaSanPham 'DG002', 'KH002', 'SP002', 'Tương đen đậm vị nhưng hơi mặn.', 4
EXEC InsertDanhGiaSanPham 'DG003', 'KH003', 'SP003', 'Bánh mì ngon nhưng không giòn.', 3
EXEC InsertDanhGiaSanPham 'DG004', 'KH004', 'SP004', 'Trà rất thơm, giải nhiệt tốt.', 5
EXEC InsertDanhGiaSanPham 'DG005', 'KH005', 'SP005', 'Cà phê đậm đà, giá hợp lý.', 4
GO



-- 1. Lấy tất cả dữ liệu từ bảng KhachHang
SELECT * FROM KhachHang

-- 2. Lấy tất cả dữ liệu từ bảng SanPham
SELECT * FROM SanPham

-- 3. Lấy tất cả dữ liệu từ bảng DonHang
SELECT * FROM DonHang

-- 4. Lấy tất cả dữ liệu từ bảng ChiTietDonHang
SELECT * FROM ChiTietDonHang

-- 5. Lấy tất cả dữ liệu từ bảng NhanVien
SELECT * FROM NhanVien

-- 6. Lấy tất cả dữ liệu từ bảng ThanhToan
SELECT * FROM ThanhToan

-- 7. Lấy tất cả dữ liệu từ bảng DanhGiaSanPham
SELECT * FROM DanhGiaSanPham