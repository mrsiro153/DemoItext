register(user,userDTOS) ::= <<
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
<center><h1>ĐỀ NGHỊ MỞ TÀI KHOẢN CÁ NHÂN</h1></center>
<p>Với mọi trách nhiệm thuộc về mình, tôi/ chúng tôi đề nghị Ngân hàng mở tài khoản cho tôi/ chúng tôi với các thông tin
    sau: </p>
<h5 class="textTitle">THÔNG TIN TÀI KHOẢN:</h5>

<table class="listUser">
    <tr>
        <th>
            <div class="accountType">
                <div class="square"><img alt="" src="http://files.gamebanana.com/img/av/582e2e9f340ee.png"/></div>
            </div>
        </th>
        <th>
            <p>Thanh toán gfdgd fgdf gdfgdfg </p>
            <p>Curent Account</p>
        </th>
    </tr>
    <tr>
        <th>
            <div class="accountType">
                <div class="square"></div>
            </div>
        </th>
        <th>
            <p>Giao dịch chứng khoán</p>
            <p>Securities transaction Account</p>
        </th>
    </tr>
    <tr>
        <th>
            <div class="accountType">
                <div class="square"></div>
            </div>
        </th>
        <th>
            <p>Đồng chủ tài khoản</p>
            <p>Joint – Account</p>

        </th>
    </tr>
    <tr>
        <th>
            <div class="accountType">
                <div class="square"></div>
            </div>
        </th>
        <th>
            <p>Khác</p>
            <p>other type</p>

        </th>
    </tr>
</table>
<br/>
<br/>
<br/>
<h5 class="textTitle">THÔNG TIN VỀ CHỦ KHOẢN:</h5>
<div class="personalInfo">
    <table>
        <tr>
            <th>Họ và tên:</th>
            <th class="listUser">$user.name$</th>
        </tr>
        <tr>
            <th>Giới tính:</th>
            <th class="listUser">$user.gender$</th>
        </tr>
        <tr>
            <th>Tên khác:</th>
            <th class="listUser">$user.otherName$</th>
        </tr>
        <tr>
            <th>Ngày sinh:</th>
            <th class="listUser">$user.dob$</th>
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
        <tr>
            <th>Địa chỉ thường trú:</th>
            <th class="listUser">$user.address$</th>
        </tr>
        <tr>
            <th>Điện thoại cá nhân:</th>
            <th class="listUser">$user.phoneNumber$</th>
        </tr>
        <tr>
            <th>email cá nhân:</th>
            <th class="listUser">$user.email$</th>
        </tr>
        <tr>
            <th>Nghề nghiệp hiện tại:</th>
            <th class="listUser">$user.occupation$</th>
        </tr>
        <tr>
            <th>Chức vụ:</th>
            <th class="listUser">$user.positionOccupation$</th>
        </tr>
    </table>
</div>
<h5 class="textTitle" style="margin-top:200px;border-style: solid; ">Chữ ký khách hàng 1</h5>

<h1>Test If else</h1>
    $if(user.otherType)$
<img alt="" src="http://files.gamebanana.com/img/av/582e2e9f340ee.png"/>
    $else$
    $endif$

<h1>TEST loop</h1>
<table class="listUser">
    $userDTOS :{userDTO|
    <tr>
        <th>$userDTO.name$</th>
        <th>$userDTO.gender$</th>
        <th>$userDTO.otherName$</th>
        <th>$userDTO.dob$</th>
        <th>
            $if(userDTO.thanhtoan)$
            <img alt="" src="http://files.gamebanana.com/img/av/582e2e9f340ee.png"/>
            $else$
            $endif$

        </th>
    </tr>
    }$
</table>
</body>
</html>
>>