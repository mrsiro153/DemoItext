withdrawForm(userSrc) ::= <<
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

        .listUser, .listUser td, .listUser > tr > td {
            border: 1px solid green;
            padding: 2px;
        }

        table, td, td {
        }
    </style>
</head>
<body>
<center><h1>GIẤY LĨNH TIỀN MẶT</h1></center>
<h4 class="textTitle">Thông tin: </h4>
<p>Tên đơn vị: <span style="color: brown">......................................................</span> Ngày: <span style="color: brown">..../.../.../ </span></p>
<p>Người lĩnh tiền: <span style="color: brown">$userSrc.name$ </span> </p>
<p>CMND: <span style="color: brown">$userSrc.numberCMND$</span>  Ngày cấp:<span style="color: brown">$userSrc.dateCreateCMND$</span> Nơi cấp: <span style="color: brown">$userSrc.placeCreateCMND$</span></p>
<p>Địa chỉ: <span style="color: brown">$userSrc.address$</span>  Điện thoại: <span style="color: brown">$userSrc.phoneNumber$</span></p>
<p>Số tài khoản: <span style="color: blueviolet">.............................</span></p>
<p>Tại ngân hàng: <span style="color: blueviolet">............................</span> Tỉnh/TP: <span style="color: blueviolet">............</span></p>
<p> Số tiền bằng chữ: <span style="color: blueviolet">.....................................................................</span></p>
<p> Số tiền bằng số: <span style="color: blueviolet">......................................................................</span></p>
<p>Nội dung: <span style="color: blueviolet">...............................................................................</span></p>
<p>Phí ngân hàng: <span style="color: blueviolet">..........................................................................</span></p>
<br/>
<h4 class="textTitle">Xác nhận bởi ngân hàng: </h4>
<br/>
<br/>
<br/>
<br/>
<br/>
</body>
</html>
>>