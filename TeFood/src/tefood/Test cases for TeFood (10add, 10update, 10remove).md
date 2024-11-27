# Test Cases for TeFood applications

### **Test Cases for Add (ADD_01 - ADD_10)**

**ADD_01**  
Test Title: Add function - Full required fields filled  
Test Case Description: Test nút Add khi nhập đầy đủ "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH001  
- Tài khoản: user01  
- Mật khẩu: pass123  
Expected Output: Hiển thị thông báo "Thêm thành công".  
Actual Result: Hiển thị thông báo "Thêm thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**ADD_02**  
Test Title: Add function - Missing Mã Khách Hàng  
Test Case Description: Test nút Add khi bỏ trống "Mã Khách Hàng".  
Test Case Procedure:  
1. Để trống "Mã Khách Hàng".  
2. Nhập "Tài khoản" và "Mật khẩu".  
3. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: (Để trống)  
- Tài khoản: user02  
- Mật khẩu: pass456  
Expected Output: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**ADD_03**  
Test Title: Add function - Missing Tài khoản  
Test Case Description: Test nút Add khi bỏ trống "Tài khoản".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" và "Mật khẩu".  
2. Để trống "Tài khoản".  
3. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH003  
- Tài khoản: (Để trống)  
- Mật khẩu: pass789  
Expected Output: Hiển thị thông báo "Tài khoản là bắt buộc".  
Actual Result: Hiển thị thông báo "Tài khoản là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**ADD_04**  
Test Title: Add function - Missing Mật khẩu  
Test Case Description: Test nút Add khi bỏ trống "Mật khẩu".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" và "Tài khoản".  
2. Để trống "Mật khẩu".  
3. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH004  
- Tài khoản: user04  
- Mật khẩu: (Để trống)  
Expected Output: Hiển thị thông báo "Mật khẩu là bắt buộc".  
Actual Result: Hiển thị thông báo "Mật khẩu là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**ADD_05**  
Test Title: Add function - Duplicate Tài khoản  
Test Case Description: Test nút Add khi "Tài khoản" đã tồn tại trong cơ sở dữ liệu.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH005  
- Tài khoản: user01 (Tài khoản đã tồn tại)  
- Mật khẩu: pass001  
Expected Output: Hiển thị thông báo "Tài khoản đã tồn tại".  
Actual Result: Hiển thị thông báo "Tài khoản đã tồn tại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**ADD_06**  
Test Title: Add function - Invalid Tài khoản  
Test Case Description: Test nút Add khi "Tài khoản" có ký tự đặc biệt.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH006  
- Tài khoản: user#06  
- Mật khẩu: pass006  
Expected Output: Hiển thị thông báo "Tài khoản không hợp lệ".  
Actual Result: Hiển thị thông báo "Tài khoản không hợp lệ".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**ADD_07**  
Test Title: Add function - Invalid Mật khẩu  
Test Case Description: Test nút Add khi "Mật khẩu" có ít hơn 6 ký tự.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH007  
- Tài khoản: user07  
- Mật khẩu: 12345  
Expected Output: Hiển thị thông báo "Mật khẩu phải có ít nhất 6 ký tự".  
Actual Result: Hiển thị thông báo "Mật khẩu phải có ít nhất 6 ký tự".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**ADD_08**  
Test Title: Add function - Special characters in Mật khẩu  
Test Case Description: Test nút Add khi "Mật khẩu" chứa ký tự đặc biệt.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH008  
- Tài khoản: user08  
- Mật khẩu: pass@123  
Expected Output: Hiển thị thông báo "Mật khẩu không hợp lệ".  
Actual Result: Hiển thị thông báo "Mật khẩu không hợp lệ".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**ADD_09**  
Test Title: Add function - All fields with valid data  
Test Case Description: Test nút Add khi tất cả các trường đều hợp lệ.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH009  
- Tài khoản: user09  
- Mật khẩu: pass987  
Expected Output: Hiển thị thông báo "Thêm thành công".  
Actual Result: Hiển thị thông báo "Thêm thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**ADD_10**  
Test Title: Add function - Email entered  
Test Case Description: Test nút Add khi nhập email.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", "Mật khẩu", và email.  
2. Nhấn nút Add.  
Test Data:  
- Mã Khách Hàng: KH010  
- Tài khoản: user10  
- Mật khẩu: pass000  
- Email: email@example.com  
Expected Output: Hiển thị thông báo "Thêm thành công".  
Actual Result: Hiển thị thông báo "Thêm thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

---

### **Test Cases for Update (UPDATE_01 - UPDATE_10)**

---

**UPDATE_01**  
Test Title: Update function - Valid fields  
Test Case Description: Test nút Update khi nhập đúng "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH001  
- Tài khoản: user01  
- Mật khẩu: newpass123  
Expected Output: Hiển thị thông báo "Cập nhật thành công".  
Actual Result: Hiển thị thông báo "Cập nhật thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**UPDATE_02**  
Test Title: Update function - Missing Mã Khách Hàng  
Test Case Description: Test nút Update khi bỏ trống "Mã Khách Hàng".  
Test Case Procedure:  
1. Để trống "Mã Khách Hàng".  
2. Nhập "Tài khoản" và "Mật khẩu".  
3. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: (Để trống)  
- Tài khoản: user02  
- Mật khẩu: pass456  
Expected Output: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**UPDATE_03**  
Test Title: Update function - Missing Tài khoản  
Test Case Description: Test nút Update khi bỏ trống "Tài khoản".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng".  
2. Để trống "Tài khoản".  
3. Nhập "Mật khẩu".  
4. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH003  
- Tài khoản: (Để trống)  
- Mật khẩu: pass789  
Expected Output: Hiển thị thông báo "Tài khoản là bắt buộc".  
Actual Result: Hiển thị thông báo "Tài khoản là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**UPDATE_04**  
Test Title: Update function - Missing Mật khẩu  
Test Case Description: Test nút Update khi bỏ trống "Mật khẩu".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng".  
2. Nhập "Tài khoản".  
3. Để trống "Mật khẩu".  
4. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH004  
- Tài khoản: user04  
- Mật khẩu: (Để trống)  
Expected Output: Hiển thị thông báo "Mật khẩu là bắt buộc".  
Actual Result: Hiển thị thông báo "Mật khẩu là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**UPDATE_05**  
Test Title: Update function - Nonexistent Mã Khách Hàng  
Test Case Description: Test nút Update khi "Mã Khách Hàng" không tồn tại trong hệ thống.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu".  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH999  
- Tài khoản: user05  
- Mật khẩu: pass555  
Expected Output: Hiển thị thông báo "Mã Khách Hàng không tồn tại".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng không tồn tại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**UPDATE_06**  
Test Title: Update function - Invalid Tài khoản  
Test Case Description: Test nút Update khi "Tài khoản" chứa ký tự không hợp lệ.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản" với ký tự đặc biệt, và "Mật khẩu".  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH006  
- Tài khoản: user#06  
- Mật khẩu: pass666  
Expected Output: Hiển thị thông báo "Tài khoản không hợp lệ".  
Actual Result: Hiển thị thông báo "Tài khoản không hợp lệ".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**UPDATE_07**  
Test Title: Update function - Invalid Mật khẩu  
Test Case Description: Test nút Update khi "Mật khẩu" dưới 6 ký tự.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", và "Mật khẩu" với ít hơn 6 ký tự.  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH007  
- Tài khoản: user07  
- Mật khẩu: 12345  
Expected Output: Hiển thị thông báo "Mật khẩu phải có ít nhất 6 ký tự".  
Actual Result: Hiển thị thông báo "Mật khẩu phải có ít nhất 6 ký tự".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**UPDATE_08**  
Test Title: Update function - Duplicate Tài khoản  
Test Case Description: Test nút Update khi "Tài khoản" đã tồn tại trong hệ thống với Mã Khách Hàng khác.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản" trùng lặp, và "Mật khẩu".  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH008  
- Tài khoản: user01  
- Mật khẩu: pass888  
Expected Output: Hiển thị thông báo "Tài khoản đã tồn tại".  
Actual Result: Hiển thị thông báo "Tài khoản đã tồn tại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

**UPDATE_09**  
Test Title: Update function - Valid update with optional fields  
Test Case Description: Test nút Update khi nhập đầy đủ các trường, bao gồm trường không bắt buộc.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản", "Mật khẩu", và các trường khác.  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH009  
- Tài khoản: user09  
- Mật khẩu: pass999  
- Email: user09@example.com  
Expected Output: Hiển thị thông báo "Cập nhật thành công".  
Actual Result: Hiển thị thông báo "Cập nhật thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

**UPDATE_10**  
Test Title: Update function - Case sensitivity for Tài khoản  
Test Case Description: Test nút Update khi "Tài khoản" nhập chữ hoa và chữ thường khác nhau.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng", "Tài khoản" với chữ hoa, và "Mật khẩu".  
2. Nhấn nút Update.  
Test Data:  
- Mã Khách Hàng: KH010  
- Tài khoản: USER10  
- Mật khẩu: pass1010  
Expected Output: Hiển thị thông báo "Cập nhật thành công".  
Actual Result: Hiển thị thông báo "Cập nhật thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

---

### **Test Cases for Remove (REMOVE_01 - REMOVE_10)**  

---

**REMOVE_01**  
Test Title: Remove function - Valid Mã Khách Hàng  
Test Case Description: Test nút Remove khi nhập đúng "Mã Khách Hàng".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng".  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: KH001  
Expected Output: Hiển thị thông báo "Xóa thành công".  
Actual Result: Hiển thị thông báo "Xóa thành công".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

---

**REMOVE_02**  
Test Title: Remove function - Missing Mã Khách Hàng  
Test Case Description: Test nút Remove khi bỏ trống "Mã Khách Hàng".  
Test Case Procedure:  
1. Để trống "Mã Khách Hàng".  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: (Để trống)  
Expected Output: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

---

**REMOVE_03**  
Test Title: Remove function - Nonexistent Mã Khách Hàng  
Test Case Description: Test nút Remove khi nhập "Mã Khách Hàng" không tồn tại trong hệ thống.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" không tồn tại.  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: KH999  
Expected Output: Hiển thị thông báo "Mã Khách Hàng không tồn tại".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng không tồn tại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

---

**REMOVE_04**  
Test Title: Remove function - Empty input for all fields  
Test Case Description: Test nút Remove khi không nhập bất kỳ trường nào.  
Test Case Procedure:  
1. Để trống toàn bộ các trường.  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: (Để trống)  
Expected Output: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng là bắt buộc".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

---

**REMOVE_05**  
Test Title: Remove function - Mã Khách Hàng with invalid format  
Test Case Description: Test nút Remove khi "Mã Khách Hàng" có định dạng không hợp lệ.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" với ký tự đặc biệt.  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: KH@01  
Expected Output: Hiển thị thông báo "Mã Khách Hàng không hợp lệ".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng không hợp lệ".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

---

**REMOVE_06**  
Test Title: Remove function - Duplicate Remove attempt  
Test Case Description: Test nút Remove khi nhấn hai lần liên tiếp để xóa cùng một "Mã Khách Hàng".  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" hợp lệ.  
2. Nhấn nút Remove lần đầu.  
3. Nhấn nút Remove lần thứ hai.  
Test Data:  
- Mã Khách Hàng: KH002  
Expected Output: Lần 1: "Xóa thành công". Lần 2: "Mã Khách Hàng không tồn tại".  
Actual Result: Lần 1: "Xóa thành công". Lần 2: "Mã Khách Hàng không tồn tại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

---

**REMOVE_07**  
Test Title: Remove function - Mã Khách Hàng bị khóa trạng thái  
Test Case Description: Test nút Remove khi "Mã Khách Hàng" bị khóa (trạng thái).  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" đã bị khóa.  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: KH003 (Trạng thái: Bị khóa)  
Expected Output: Hiển thị thông báo "Không thể xóa khách hàng bị khóa".  
Actual Result: Hiển thị thông báo "Không thể xóa khách hàng bị khóa".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

---

**REMOVE_08**  
Test Title: Remove function - System timeout during Remove  
Test Case Description: Test nút Remove khi hệ thống bị timeout trong quá trình xử lý.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng".  
2. Nhấn nút Remove.  
3. Chờ phản hồi hệ thống quá thời gian timeout.  
Test Data:  
- Mã Khách Hàng: KH004  
Expected Output: Hiển thị thông báo "Xóa thất bại do hệ thống bận. Vui lòng thử lại".  
Actual Result: Hiển thị thông báo "Xóa thất bại do hệ thống bận. Vui lòng thử lại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 25/11  

---

**REMOVE_09**  
Test Title: Remove function - Case sensitivity for Mã Khách Hàng  
Test Case Description: Test nút Remove khi nhập "Mã Khách Hàng" với chữ hoa và chữ thường khác nhau.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" với định dạng chữ hoa.  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: kh005 (Thay vì KH005)  
Expected Output: Hiển thị thông báo "Mã Khách Hàng không tồn tại".  
Actual Result: Hiển thị thông báo "Mã Khách Hàng không tồn tại".  
Inter-test case dependence: Không có.  
Result: Pass  
Test Date: 24/11  

---

**REMOVE_10**  
Test Title: Remove function - Valid remove after Update  
Test Case Description: Test nút Remove sau khi cập nhật thông tin khách hàng.  
Test Case Procedure:  
1. Nhập "Mã Khách Hàng" và cập nhật thành công bằng nút Update.  
2. Nhấn nút Remove.  
Test Data:  
- Mã Khách Hàng: KH006  
Expected Output: Hiển thị thông báo "Xóa thành công".  
Actual Result: Hiển thị thông báo "Xóa thành công".  
Inter-test case dependence: Phụ thuộc vào UPDATE_01.  
Result: Pass  
Test Date: 25/11  

---

### Hoàn thành!