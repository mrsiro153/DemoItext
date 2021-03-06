changeProfile(user) ::= <<
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Insert title here</title>
    <!-- bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style type="text/css">

        body {
            font-family: Arial, Helvetica, sans-serif;
            font-size: 100%;
        }

        h4.textTitle {
            font-weight: bold;
        }

        #accountInfo .accountType {
            margin-left: 15px;
        }

        .square {
            border: 1px solid green;
            height: 62px;
            widtd: 62px;
        }

        div.personalInfo {
            margin-left: 15px;
        }

        table.listUser {
            border-collapse: collapse;
        }

        .listUser, .listUser td, .listUser > tr > td {
            border: 1px solid green;
            padding: 2px;
        }

        table, td, td {
        }
    </style>
</head>
<body>
<center><h1>YÊU CẦU THAY ĐỔI THÔNG TIN KHÁCH HÀNG CÁ NHÂN VÀ DỊCH VỤ</h1></center>
<h4 class="textTitle">I. Thông tin về khách hàng: (customer information)</h4>
<div class="personalInfo">
    <table>
        <tr>
            <td>Họ và tên:</td>
            <td class="listUser">$user.name$</td>
        </tr>
        <tr>
            <td>Số CMND:</td>
            <td class="listUser">$user.numberCMND$</td>
        </tr>
        <tr>
            <td>Ngày tạo CMND:</td>
            <td class="listUser">$user.dateCreateCMND$</td>
        </tr>
        <tr>
            <td>Nơi tạo CMND:</td>
            <td class="listUser">$user.placeCreateCMND$</td>
        </tr>
    </table>
</div>
<h4 class="textTitle">II. Yêu cầu thay đổi thông tin khách hàng: (details of customer information request) </h4>
<div class="personalInfo">
    <table>
        <tr>
            <td>Số CMND/ hộ chiếu mới:</td>
            <td class="listUser" style="width:100px;"></td>
        </tr>
        <tr>
            <td>Ngày tạo CMND:</td>
            <td class="listUser"></td>
            <td>Nơi cấp CMND:</td>
            <td class="listUser" style="width:75px"></td>
            <td>thời hạn:</td>
            <td class="listUser" style="width:50px"></td>
        </tr>
    </table>
</div>
<div>
    <table>
        <tr>
            <td>Địa chỉ liên hệ mới:</td>
            <td class="listUser" style="width:400px;"></td>
        </tr>
        <tr>
            <td>Số điện thoại mới</td>
            <td class="listUser" style="width:400px;"></td>
        </tr>
        <tr>
            <td>Nơi công tác mới</td>
            <td class="listUser" style="width:400px;"></td>
        </tr>
        <tr>
            <td>Email mới</td>
            <td class="listUser" style="width:400px;"></td>
        </tr>
    </table>
</div>
<div>
    <table>
        <tr>
            <td style="vertical-align: top"><p>Chữ ký mẫu:</p></td>
            <td class="listUser" style="width:300px; height: 200px; vertical-align: top"><center><p>Chữ ký mẫu 1</p></center></td>
            <td class="listUser" style="width:300px; height: 200px; vertical-align: top"><center><p>Chữ ký mẫu 2</p></center></td>
        </tr>
    </table>
</div>
<div>
    <table>
        <tr>
            <td style="vertical-align: top">thay đổi khác:</td>
            <td class="listUser" style="width:400px; height: 100px"></td>
        </tr>
    </table>
</div>
<div>
    <table>
        <tr>
            <td>Ngày hiệu lực:</td>
            <td class="listUser" style="width:400px"></td>
        </tr>
    </table>
</div>
<h4 class="textTitle">III. Yêu cầu thay đổi dịch vụ ngân hàng điện tử: (details of customer information request) </h4>
<p>1. Dịch vụ ngân hàng trực tuyến</p>
<div>
    <table>
        <tr>
            <td class="listUser" style="width:25px"></td>
            <td>Mở lại dịch vụ</td>
            <td class="listUser" style="width:25px; margin-left: 2px;"></td>
            <td>Cấp lại tên truy cập</td>
            <td class="listUser" style="width:25px; margin-left: 2px;"></td>
            <td>Cấp lại mật khẩu</td>
            <td class="listUser" style="width:25px; margin-left: 2px;"></td>
            <td>Tạm ngừng dịch vụ</td>
        </tr>
    </table>
</div>
<p>2. Dịch vụ ngân hàng qua tin nhắn di động</p>
<div>
    <table>
        <tr>
            <td class="listUser" style="width:25px; margin-left:5px;"></td>
            <td>Thay đổi số điện thoại</td>
            <td class="listUser" style="width:25px; margin-left:5px;"></td>
            <td>Tạm ngừng dịch vụ</td>
            <td class="listUser" style="width:25px; margin-left:5px;"></td>
            <td>Mở dịch vụ</td>
        </tr>
    </table>
</div>
<div>
    <table>
        <tr>
            <td>Số điện thoại cũ:</td>
            <td class="listUser" style="width:150px"></td>
            <td>Số điện thoại mới:</td>
            <td class="listUser" style="width:150px"></td>
        </tr>
    </table>
</div>
<h4 class="textTitle">IV. Xác nhận từ khách hàng </h4>
<p>Bằng việc ký vào Bản đề nghị này</p>
<p style="color: green">By signing this form</p>
<p>1. Tôi xác nhận các thông tin trên đây là chính xác, đúng sự thật và hoàn toàn chịu trách nhiệm về các thông tin đã cung cấp. Đề nghị Vietcombank thay đổi những thông tin tôi đã yêu cầu ở trên</p>
<p style="color: green">1. I hereby commit that the information provided above is correct, complete and kindly request Vietcombank to change the information accordingly.</p>
<p>2. Tôi đã đọc, hiểu rõ và cam kết tuân thủ các điều khoản, điều kiện của Nội dung thỏa thuận sử dụng dịch vụ Ngân hàng điện tử đính kèm, các Thông báo, Hướng dẫn sử dụng dịch vụ của Vietcombank được cung cấp tại Quầy giao dịch và/ hoặc đăng tải trên trang thông tin điện tử chính thức của Vietcombank: http://www.vietcombank.com.vn.</p>
<p style="color: green">2. I have read and fully understood Vietcombank’s Regulations of Electronic Banking Agreement attached as well as Electronic Banking User Guide provided at Vietcombank’s premises and/ or official website: http://vietcombank.com.vn and agreed to be bound by them.</p>

<p style="margin-left: 350px;">Chữ ký và họ tên khách hàng</p>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<p style="margin-left: 350px;">Ngày.....tháng.....năm....</p>
</body>
</html>
>>