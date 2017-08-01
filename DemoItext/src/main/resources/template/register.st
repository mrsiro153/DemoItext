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
@font-face {
    font-family: Arial Unicode MS;
    src: url("arialuni.ttf");
    -fs-pdf-font-embed: embed;
    -fs-pdf-font-encoding: Identity-H;
}

* {
        font-family: Arial Unicode MS;
}
	h5.textTitle{
		font-weight: bold;
	}
	#accountInfo .accountType{
		margin-left: 15px;
	}
	#accountInfo .accountType .square{
		border: 1px solid green;
		float: left;
		height: 62px;
		width: 62px;
	}
	#accountInfo .accountType .content{
		float: left;
	}
	div.personalInfo{
		margin-left: 15px;
	}
	table {
        border-collapse: collapse;
    }

    table, td, th {
        border: 2px solid green;
        padding: 2px;
    }
</style>
</head>
<body>
	<center><h1>ĐỀ NGHỊ MỞ TÀI KHOẢN CÁ NHÂN</h1></center>
	<p>Với mọi trách nhiệm thuộc về mình, tôi/ chúng tôi đề nghị Ngân hàng mở tài khoản cho tôi/ chúng tôi với các thông tin sau: </p>
	<h5 class="textTitle">THÔNG TIN TÀI KHOẢN:</h5>
	<div id="accountInfo">
		<div class="accountType">
			<div class="square"><img alt="" src="http://files.gamebanana.com/img/av/582e2e9f340ee.png"/></div>
			<div class="content">
				<p>Thanh toán</p>
				<p>Curent Account</p>
			</div>
		</div>
		<div class="accountType">
			<div class="square"></div>
			<div class="content">
				<p>Giao dịch chứng khoán</p>
				<p>Securities transaction Account</p>
			</div>
		</div>
		<div class="accountType">
			<div class="square"></div>
			<div class="content">
				<p>Đồng chủ tài khoản</p>
				<p>Joint – Account</p>
			</div>
		</div>
		<div class="accountType">
			<div class="square"></div>
			<div class="content">
				<p>Khác</p>
				<p>Other</p>
			</div>
		</div>
	</div>
	<br/>
	<br/>
	<br/>
	<h5 class="textTitle">THÔNG TIN VỀ CHỦ KHOẢN:</h5>
	<div class="personalInfo">
		<div style="clear: left;">
			<p style="float: left;">Họ và tên: </p>
			<table style="float: left;">
                  <tr>
                    <th>$user.name$</th>
                  </tr>
                </table>
		</div>
		<div style="clear: left;">
			<p style="float: left;">Giới tính: </p>
			<div style="height: 20px;float:left; border: 1px solid green; width: 100px;">$user.gender$</div>
		</div>
		<div style="clear: left;">
			<p style="float: left;">Tên viết tắt: </p>
			<div style="height: 20px;float:left; border: 1px solid green; width: 500px;">$user.otherName$</div>
		</div>
		<div style="clear: left;">
			<p style="float: left;">Ngày sinh: </p>
			<div style="height: 20px;float:left; border: 1px solid green; width: 150px;">$user.dob$</div>
		</div>
	</div>
	<h5 class="textTitle" style="margin-top:200px;border-style: solid; ">Chữ ký khách hàng 1</h5>

	$if(user.otherType)$
	    <img alt="" src="http://files.gamebanana.com/img/av/582e2e9f340ee.png"/>
	$else$
	$endif$
	<h1>TEST loop</h1>
	<table style="float: left;">
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