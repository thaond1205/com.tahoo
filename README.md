# DOCUMENT NGHIỆP VỤ ĐĂNG BÁN CĂN HỘ THỨ CẤP

## Ý tưởng
  - Cuộc sống ngày càng hiện đại ngày càng phát triển, ở thời hiện đại, kinh tế của con người
ngày càng vững, ông cha ta đã nói "An cư, lạc nghiệp", khi kinh tế ổn định
con người ta muốn sở hữu những tài sản có giá trị lớn, và trong đó có 
những dự án bất động sản. Và căn hộ chung cư là một tài sản được rất nhiều người lựa chọn để 
làm tổ ấm cho gia đình. Vì lượng người sở hữu căn hộ ngoài thị trường rất lớn nên sẽ có những chủ
căn hộ muốn thay đổi nơi ở, muốn nâng cấp căn hộ, nên họ muốn bán căn hộ đã qua sử dụng, nhưng ngoài
thị trường cũng có rất nhiều hệ thống, công ty đăng bán căn hộ đã qua sử dụng nhưng để lựa chọn ra đơn vị 
uy tín thì thực sự khó khăn!
  - Hiểu được vấn đề đó, Onehousing phát triển hệ thống đăng bán căn hộ đã qua sử dụng dành cho các chủ căn hộ 
có nhu cầu! Onehousing là nơi uy tín để các chủ căn hộ đặt niềm tin và giao tài sản cho Onehousing quản lý!

## Các actor 
  - Owner: là các chủ căn hộ có nhu cầu bán căn hộ đã qua sử dụng
  - Customer: là khách hàng có nhu cầu mua căn hộ của các chủ căn hộ đã đăng trên hệ thống
  - Agent: là người xác nhận xem nhà khi được khách hàng lựa chọn
## Các chức năng chính
- Đăng thông tin bán căn hộ
  - Các chủ căn hộ có nhu cầu bán căn hộ đã qua sử dụng
  - Các chủ căn hộ có thể đăng thông tin căn hộ muốn bán lên hệ thống
- Thay đổi thông tin căn hộ trên hệ thống
  - Các chủ căn hộ có thể thay đổi các thông tin của căn mà mình đã đăng trước đó
- Xem lại lịch sử căn hộ đã đăng trên hệ thống
  - Các chủ căn hộ có thể xem lại lịch sử các căn hộ mà mình đăng bán
- Xem thông tin căn hộ có trên hệ thống
  - Khách hàng có thể xem được các căn hộ đang được các chủ căn hộ đăng bán 
- Đặt lịch xem căn hộ
  - Khách hàng có nhu cầu muốn xem nhà trực tiếp thì sẽ phải đặt lịch với thời gian cụ thể
- Xác nhận đặt lịch xem căn hộ
  - Agent sẽ xác nhận và hướng dẫn cho khách hàng khi vào xem nhà
  
              - Define thông tin
                - PROJECT
                  - Id
                  - Tên dự bán
                  - Mô tả dự án
                - PROPERTY 
                  - Id
                  - Tên dự án [refer]
                  - Ban công views
                  - Tên tòa nhà
                  - Số tầng
                  - Mô tả căn hộ
                  - Tổng diện tích nhà
                  - Chiều dài nhà
                  - Chiều rộng nhà
                  - Số phòng ngủ
                  - Số phòng tắm
                  - Diện tích phòng khách 
                  - Trạng thái sử dụng
                  - Ảnh căn hộ [refer]
                  - Thông tin pháp lý [refer]
                  - Thông tin khoản vay [refer]
                  - Chủ sở hữu [refer]
                  - Nội thất [refer]
                - LOAN_INFOS
                  - Id 
                  - Số tiền vay
                  - Trạng thái
                - GALLERIES
                  - Id
                  - Media_Type
                  - Url
                - LEGAL_INFOS
                  - Id
                  - Trạng thái
                - OWNERS
                  - Id
                  - Họ Tên
                  - Số điện thoại
                  - Địa chỉ
                  - Giới tính
                - FURNITURUES
                  - Id
                  - Tên tài sản
                  - Số lượng
## UseCase
  ![img_1.png](img_1.png)