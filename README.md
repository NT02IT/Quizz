# **GIỚI THIỆU HỆ THỐNG**

##  **I. Mô tả tổng quát về hệ thống sẽ xây dựng**
**Hệ thống thi trắc nghiệm** là một phần mềm được thiết kế để hỗ trợ toàn bộ quá trình thi cử, tổ chức các kỳ thi với dạng câu hỏi trắc nghiệm. Hệ thống này giúp tự động hóa và nâng cao hiệu quả các quy trình thi cử, từ việc **tạo đề thi, quản lý thí sinh, chấm điểm, đến công bố kết quả.**

##  **II. Lý do chọn đề tài**
Hiện nay, các trường học hay các tổ chức vẫn có những kì thi ,bài kiểm trắc nghiệm nhằm khảo sát kiến thức chất lượng học sinh. Vì vậy hệ thống thi trắc nghiệm ra đời nhằm tự động hóa các quy trình thi cử, tiết kiệm thời gian , công sức và chi phí cho ban tổ chức là một điều cần thiết.Hệ thống thi trắc nghiệm bằng mạng cục bộ (LAN) là một hệ thống thi được thiết lập và hoạt động trong phạm vi mạng nội bộ của một tổ chức, ví dụ như trường học, công ty, hoặc cơ quan. Hệ thống này sử dụng mạng LAN để kết nối giữa máy chủ thi và các máy tính của thí sinh. Hệ thống hoạt động trong mạng nội bộ, hạn chế truy cập trái phép từ bên ngoài. Không cần kết nối internet, tiết kiệm chi phí hoặc tránh rủi ro cho việc sử dụng internet. Dễ sử dụng cho cả ban tổ chức và thí sinh.

##  **III. Hướng giải quyết dự kiến** 
Thực hiện phân tích hệ thống thi trắc nghiệm theo **quy trình thác nước (Waterfall)**:
1. Xác định và chọn lựa dự án hệ thống thi trắc nghiệm
2. Khởi tạo và lập kế hoạch thiết kế dự án hệ thống thi trắc nghiệm 
3. Lập trình
4. Kiểm thử             
5. Cài đặt 
6. Bảo trì

##  **IV. Mô tả các chức năng của hệ thống**
**Hệ thống quản lý thi trắc nghiệm bao gồm các các chức năng sau:**
- **Tổ chức thi:** Đây là chức năng chính của phần mềm, phát những bài kiểm tra cho HS/SV dưới dạng bài kiểm tra trắc nghiệm tạo câu hỏi, tạo đề thi, phát đề, chấm điểm, hiển thị kết quả cho HS/SV.
- **Quản lý bài kiểm tra:** Lưu trữ thông tin đề thi bao gồm tên bài thi, ngày giờ và thời gian làm kiểm tra, thời gian làm bài tối đa, số lượng câu hỏi trong bài thi, mã bài thi,...(cho phép thao tác thêm thông tin, sửa thông tin, xóa thông tin, tìm kiếm thông tin).
- **Quản lý học sinh:** Lưu thông tin bao gồm, mã học sinh, tên, số điện thoại, email (cho phép thao tác thêm thông tin, sửa thông tin, xóa thông tin, tìm kiếm thông tin).
- **Quản lý môn học:** Lưu thông tin tất cả môn học bao gồm mã môn học, tên môn học và mã giáo viên dạy môn đó (cho phép thao tác thêm thông tin, sửa thông tin, xóa thông tin, tìm kiếm thông tin).
- **Quản lý lớp học:** Chứa mã lớp học, và mã học sinh thuộc lớp học đó (cho phép thao tác thêm thông tin, sửa thông tin, xóa thông tin, tìm kiếm thông tin).
- **Quản lý những bài nộp:** Lưu thông tin tất cả bài kiểm tra gồm mã bài kiểm tra, mã sinh viên, thời gian làm bài, điểm (cho phép thao tác thêm thông tin, sửa thông tin, xóa thông tin, tìm kiếm thông tin).
- **Quản lý câu hỏi:** Là nơi lưu trữ câu hỏi chính gồm môn học, chương, và độ khó của từng câu hỏi, mã câu hỏi, có thêm, sửa, xóa câu hỏi.

##  **V. Các đối tượng có trong hệ thống**
- Thực thể câu hỏi **(questions)**
- Thực thể môn học **(subjects)**
- Thực bài kiểm tra, đề thi **(exams)**
- Thực thể học sinh, sinh viên **(students)**
- Thực thể giáo viên, giảng viên **(teachers)**
- Thực thể con người **(presons)**
- Thực thể bài nộp **(submissions)**
- Thực thể lớp học **(class)**

##  **VI. Sơ đồ BFD**
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.001.png)<br>
### **1. Danh sách tác nhân và mô tả**
- **Tác nhân 1: Giảng viên / Giáo viên** -  Là con người có mã người dùng do GV quy định.
- **Tác nhân 2: Học sinh / Sinh viên** - Là học sinh / sinh viên có mã sinh viên do GV cung cấp.

### **2. Danh sách usecase và mô tả**
1. **Đăng kí hệ thống:** Use case này cho phép GV đăng kí tài khoản để đăng nhập hệ thống.
2. **Đăng nhập hệ thống:** Use case này cho phép GV và HS/SV đăng nhập hệ thống.
3. **Quản lý bài kiểm tra/đề thi :** Use case này bắt đầu khi GV chọn chức năng này để xem và cập nhật các bài kiểm tra/ đề thi trong hệ thống.
4. **Quản lý lớp học:** Use case này bắt đầu khi GV chọn chức năng này để xem và cập nhật các lớp học.
5. **Quản lý môn học:** Use case này bắt đầu khi GV chọn chức năng này để kiểm tra và cập nhật các lớp học.
6. **Quản lý học sinh:** Use case này bắt đầu khi GV chọn chức năng này để kiểm tra và cập nhật các học sinh trong từng lớp của hệ thống .
7. **Quản lý bài đã nộp :** Use case này bắt đầu khi GV chọn chức năng này để kiểm tra và cập nhật các bài kiểm tra đã nộp.
8. **Quản lý câu hỏi :** Use case này bắt đầu khi GV chọn chức năng này để kiểm tra và cập nhật câu hỏi trong ngân hàng câu hỏi.
9. **Tổ chức thi :** Use case này bắt đầu khi GV chọn chức năng này để phát đề cho HS/SV.
10. **Quản lý thống kê:** Use case này cho phép người quản lý xem các thống kê kết quả của bài kiểm tra/đề thi.

##  **VI. Thiết kế dữ liệu**
### **1. Thiết kế sơ đồ ERD**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.002.jpeg)<br>
*Hình 6.1. Sơ đồ ERD*

### **2. Chuyển sang mô hình dữ liệu quan hệ**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.003.jpeg)<br>
*Hình 6.2. Mô hình dữ liệu quan hệ*

##  **VII. Giao diện**
### **1. Sơ đồ màn hình**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.004.png)<br>
*Hình 7.1. Sơ đồ màn hình tổng quát*

### **2. Mô tả các màn hình giao diện**
1. **Màn hình home**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.005.jpeg)<br>
*Hình 7.2. Màn hình home*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :-: |
    |**Màn hình home**|- Là chào mừng màn hình của Giáo viên/Giảng viên đến với hệ thống quản lý, đồng thời là màn hình đăng nhập vào hệ thống.<br>- Khi muốn đăng nhập vào thì Giáo viên/Giảng viên phải nhập đúng tên đăng nhập và mật khẩu đã tạo.<br>- Mật khẩu được mã hóa thành các dấu “\*”.<br>- Khi nhập sai thông tin, chương trình sẽ hiển thị cảnh báo và yêu cầu nhập lại.|

    *Bảng 7.1. Mô tả màn hình home*

2. **Màn hình đăng kí**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.006.jpeg)<br>
*Hình 7.3. Màn hình đăng kí*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :-: |
    |**Màn hình đăng kí**|- Nếu Giáo viên/Giảng viên chưa có tài khoản, thao tác nút “Sign Up” trên màn hình đăng nhập để chuyển sang màn hình đăng ký<br>- Nhập đầy đủ thông tin<br>- Nếu User trùng lặp chương trình sẽ hiển thị cảnh báo và yêu cầu nhập lại|

    *Bảng 7.2. Mô tả màn hình đăng kí*

3. **Màn hình Giáo viên/Giảng viên**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.007.jpeg)<br>
*Hình 7.4. Màn hình GV*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :-: |
    |**Màn hình GV**|- Khi đăng nhập thành công vào chương trình, màn hình.<br>- Hiển thị toàn bộ chức năng của chương trình.|

    *Bảng 7.3. Mô tả màn hình GV*

4. **Màn hình Học sinh/Sinh viên**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.008.png)![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.009.png)<br>
*Hình 7.5. Màn hình HS/SV* 

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :-: |
    |**Màn hình HS/SV**|- Là màn hình giao diện của họ sinh, gồm tên phần mềm, và các thông tin mà sinh viên cần để đăng nhập vào làm bài kiểm tra.<br>- Mã HS/SV, Ip và Port do giáo viên cung cấp, Mã HS/SV của mỗi HS/SV là khác nhau dùng để phân biết các sinh viên với nhau.<br>- “Start exam” để vào màn hình kiểm tra. Chọn vào từng câu hỏi, thực hiện chọn đáp án và bấm “Save” để lưu<br>- “Submit” để nộp bài sau khi hoàn thành bài kiểm tra, hết thời gian nộp bài thì học sinh không được tính điểm.|

    *Bảng 7.4. Mô tả màn hình HS/SV*

5. **Màn hình tổ chức thi**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.010.jpeg)<br>
*Hình 7.6. Màn hình tổ chức thi*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :-: |
    |**Màn hình tổ chức thi**|- Sau khi GV đã chọn bài kiểm tra/đề thi tiếp tục thực hiện thao tác nhấn “START TEST” trên màn hình chính để hiện màn hình tổ chức thi.<br>- “START SERVER” - bật server cho học sinh vào phòng kiểm tra.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.011.png): phát bài kiểm tra cho HS/SV.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.012.png): để tắt server.<br>- “Back”: thoát khỏi màn hình kiểm tra.|

    *Bảng 7.5. Mô tả màn hình tổ chức thi*

6. **Màn hình quản lý đề thi/bài kiểm tra**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.013.png)<br>
*Hình 7.7. Màn hình quản lý đề thi/bài kiểm tra*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :-: |
    |**Màn hình quản lý đề thi/ bài kiểm tra**|- GV thao tác nút “Exam” trên màn hình chính để vào giao diện quản lý bài kiểm tra.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.014.png)Thêm bài kiểm tra/đề thi: nhấn vào biểu tượng dấu cộng bên phải màn hình trang thêm câu hỏi sẽ hiện lên, muốn xóa câu hỏi bấm vào biểu tượng thùng rác sau khi đã chọn câu hỏi. Nút “Create an Exam” kết thúc việc tạo 1 bài kiểm tra.<br>- Xem bài kiểm tra/đề thi: con mắt là nút hiện thị màn hình xem bài kiểm tra. ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.015.png)<br>- Xóa bài kiểm tra: Chọn 1 bài kiểm tra muốn xóa sau đó chọn vào biểu tượng ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.016.png) để kết thúc thao tác thực hiện.|

    *Bảng 7.6. Mô tả màn hình quản lý đề thi/bài kiểm tra*

7. **Màn hình quản lý ngân hàng câu hỏi**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.017.png)<br>
*Hình 7.8. Màn hình quản lý ngân hàng câu hỏi*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :- |
    |**Màn hình ngân hàng câu hỏi**|- GV thao tác nút “Question” trên màn hình chính để vào giao diện quản lý ngân hàng câu hỏi.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.018.jpeg): tìm kiếm câu hỏi thông quan nội dung câu hỏi, chương, độ khó tương ứng<br>- Để chọn môn hoặc tạo một môn mới dùng những công cụ bên cạnh.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.019.png): tương ứng với xóa; xem và sửa, thêm câu hỏi. Khi thao tác từng nút trên sẽ có một màn hình giao diện tương ứng.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.020.png)![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.021.png) Khi chọn chức năng xem, sửa câu hỏi, nhập đầy đủ thông tin trong trang detail.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.022.png)Thêm bài kiểm: Tương tự như trên.|

    *Bảng 7.7. Mô tả màn hình quản lý ngân hàng câu hỏi*

8. **Màn hình quản lý bài đã nộp/đã hoàn thành**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.023.png)<br>
*Hình 7.9. Màn hình bài đã nộp/đã hoàn thành*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :- |
    |**Màn hình bài đã nộp/đã nộp**|- GV thao tác nút “Submission” trên màn hình chính để vào giao diện quản lý bài đã nộp.<br>- Tìm kiếm ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.024.png) : tìm kiếm theo 2 nội dung mã HS/SV và mã bài kiểm tra, “Search” để bắt đầu tìm kiếm nội dụng đã search.<br>- ![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.025.png) Xóa: chọn bài muốn xóa sau đó nhấn vào biểu tượng thùng rác ở cuối màn hình.<br>- Bấm vào từng bài kiểm tra để xem chi tiết bài kiểm tra.</p>|

    *Bảng 7.8. Mô tả màn hình bài đã nộp/đã hoàn thành*

8. **Màn hình quản lý lớp học**<br>
![](.\DocumentAssets\Aspose.Words.819ca93f-98f6-46ec-9a72-e84f7172f15c.026.png)<br>
*Hình 7.10. Màn hình quản lý lớp học*

    |**Tên màn hình**|**Thao tác thực hiện**|
    | :-: | :- |
    |**Màn hình quản lý lớp học**|- GV thao tác nút “Group” trên màn hình chính để vào giao diện quản lý lớp học<br>- “Chose a group”: danh sách lớp học hiện có, trong mỗi lớp chứa thông tin của chi tiết của lớp học từng HS/SV có trong lớp đó.<br>- Nút “New Group”: tạo 1 lớp học mới, khi nhấn vào sẽ hiện lên những thông tin cần nhập, lưu ý groupID nếu nhập trùng hệ thống sẽ báo lỗi và nhập lại.<br>- Những nút phía dưới màn hình nhằm hỗ trợ GV quản lý sinh viên của từng lớp như thêm, sửa, xóa và tìm kiếm theo mã HS/SV và tên HS/SV qua 2 thanh search, để thêm HS/SV có 2 cách thêm từng HS/SV thồng qua nút “Add” hoặc thêm bằng excel qua nút “Import”<br>- Nút “Export” dùng để xuất danh sách sv thành 1 file Excel.|

    *Bảng 7.9. Mô tả màn hình quản lý lớp học*