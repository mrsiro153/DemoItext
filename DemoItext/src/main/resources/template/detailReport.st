detailReport(user,listMoney) ::= <<
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
            background-color: #006600;
            color:white;
            padding:5px;
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

        .listUser, .listUser td, .listUser > tr > td,.listUser > tr > th {
            border: 1px solid green;
            padding: 2px;
        }

        table.detail {
            border-collapse: collapse;
            width: 100%;
        }

        .detail, .detail td, .detail > tr > td, .detail>tr>th {
            border: 1px solid blue;
            padding: 2px;
        }
    </style>
</head>
<body>
<center><h1>CHI TIẾT TIỀN MẶT</h1></center>
<center><h5>Ngày 20/2/2018</h5></center>
<table>
    <tr>
        <td>Mã khách hàng:</td>
        <td class="listUser"></td>
    </tr>
    <tr>
        <td>Tên khách hàng:</td>
        <td class="listUser">$user.name$</td>
    </tr>
    <tr>
        <td>CMND:</td>
        <td class="listUser">$user.numberCMND$</td>
    </tr>
    <tr>
        <td>Ngày cấp CMND:</td>
        <td class="listUser">$user.dateCreateCMND$</td>
        <td>Nơi cấp CMND:</td>
        <td class="listUser">$user.placeCreateCMND$</td>
    </tr>
    <tr>
        <td>Địa chỉ:</td>
        <td class="listUser">$user.address$</td>
    </tr>
    <tr>
        <td>Nội dung:</td>
        <td class="listUser"></td>
    </tr>
</table>
<table class="detail">
    <tr>
        <th>Số GD</th>
        <th>N/C</th>
        <th>Mã C/N</th>
        <th>Số tài khoản</th>
        <th>Tên tài khoản</th>
        <th>Số tiền</th>
    </tr>
    <tr>
        <td>1001GTDN122012</td>
        <td>N</td>
        <td>100</td>
        <td>10010001</td>
        <td>Hello world</td>
        <td>53,300,000 VND</td>
    </tr>
</table>
<p>Số tiền bằng số: <span style="color:brown">53,300,000 VND</span></p>
<p>Số tiền bằng chữ: <span style="color:brown">Năm mươi ba triệu ba trăm ngàn đồng</span></p>
<br/>
<table style="width: 100%">
    <tr>
        <th>Khách hàng</th>
        <th>Giao dịch viên</th>
        <th>Ngân quỹ</th>
        <th>Kiểm soát</th>
        <th>Trưởng đơn vị</th>
    </tr>
</table>
<br/>
<br/>
<br/>
<br/>
<br/>

<center><h2>Thông tin chi tiết tiền mặt</h2></center>
<table class="listUser" style="width:100%">
    <tr>
        <th>Loại tiền</th>
        <th>Số lượng</th>
        <th>Thành tiền</th>
    </tr>
    $listMoney :{mn|
    <tr>
        <td>$mn.type$</td>
        <td>$mn.value$</td>
        <td></td>
    </tr>
    }$
</table>

</body>
</html>
>>