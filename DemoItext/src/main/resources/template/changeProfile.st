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

        h5.textTitle {
            font-weight: bold;
        }

        #accountInfo .accountType {
            margin-left: 15px;
        }

        .square {
            border: 1px solid green;
            height: 62px;
            width: 62px;
        }

        div.personalInfo {
            margin-left: 15px;
        }

        table.listUser {
            border-collapse: collapse;
        }

        .listUser, .listUser td, .listUser > tr > th {
            border: 1px solid green;
            padding: 2px;
        }

        table, td, th {
        }
    </style>
</head>
<body>
<center><h1>YÊU CẦU THAY ĐỔI THÔNG TIN KHÁCH HÀNG CÁ NHÂN VÀ DỊCH VỤ</h1></center>
<h5 class="textTitle">I. Thông tin về khách hàng: (customer information)</h5>

<div class="personalInfo">
    <table>
        <tr>
            <th>Họ và tên:</th>
            <th class="listUser">$user.name$</th>
        </tr>
        <tr>
            <th>Số CMND:</th>
            <th class="listUser">$user.numberCMND$</th>
        </tr>
        <tr>
            <th>Ngày tạo CMND:</th>
            <th class="listUser">$user.dateCreateCMND$</th>
        </tr>
        <tr>
            <th>Nơi tạo CMND:</th>
            <th class="listUser">$user.placeCreateCMND$</th>
        </tr>
    </table>
</div>
<h5 class="textTitle">II. Yêu cầu thay đổi thông tin khách hàng: (details of customer information request) </h5>
<div class="personalInfo">
    <table>
        <tr>
            <th>Số CMND/ hộ chiếu/ mới:</th>
            <th class="listUser" style="width:100px;"></th>
        </tr>
        <tr>
            <th>Ngày tạo CMND:</th>
            <th class="listUser"></th>
            <th>Nơi cấp CMND:</th>
            <th class="listUser">.........</th>
            <th>Thời hạn:</th>
            <th class="listUser">.........</th>
        </tr>
        <tr>
            <th>Nơi cấp CMND:</th>
            <th class="listUser">$user.placeCreateCMND$</th>
        </tr>
        <tr>
            <th>Thời hạn:</th>
            <th class="listUser">$user.placeCreateCMND$</th>
        </tr>

    </table>
</div>

</body>
</html>
>>