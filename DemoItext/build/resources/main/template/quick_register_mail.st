quick_register_mail(token,name,obj,hm) ::= <<
<!DOCTYPE html>
<html>
<head>
	<title>Email</title>
	<style type="text/css">
		body{
			margin: 0;
			padding: 0;
			font-family: sans-serif;
			background-color: blue;
		}
		.container{
			height : auto;
	margin: auto;
		border:6px solid #3e7fc3;
		}
		.header img{

		}
		.content-vn, .content-en{
			margin: auto;
			height: auto;
		}
		.content-vn p, .content-en p{
			font-weight: bold;
			color: #6794b4;
			padding:40px 45px 0 45px;
			margin: 0 0 18px 0
		}
		.content-vn .text, .content-en .text{
			padding:0px 45px;
		}
		.content-vn .text span, .content-en .text span{
			word-wrap: break-word;
		}
		.content-vn hr{
			margin: 0px 45px
		}
		.content-vn .btn{
			text-align: center;
			padding: 210px
		}

		.content-vn .btn a{
			text-decoration: none;
    font-size: 30px;
    font-weight: 600;
        background: rgb(64,126,193);
background: -moz-linear-gradient(left, rgba(64,126,193,1) 0%, rgba(83,198,232,1) 100%);
background: -webkit-linear-gradient(left, rgba(64,126,193,1) 0%,rgba(83,198,232,1) 100%);
background: linear-gradient(to right, rgba(64,126,193,1) 0%,rgba(83,198,232,1) 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#407ec1', endColorstr='#53c6e8',GradientType=1 );
    padding: 25px 99px;
    border-radius: 10px;
    color: #fff
}
		.content-en .btn{
			text-align: center;
			padding: 210px
		}

		.content-en .btn a{
		text-decoration: none;
    font-size: 30px;
    font-weight: 600;
        background: rgb(64,126,193);
background: -moz-linear-gradient(left, rgba(64,126,193,1) 0%, rgba(83,198,232,1) 100%);
background: -webkit-linear-gradient(left, rgba(64,126,193,1) 0%,rgba(83,198,232,1) 100%);
background: linear-gradient(to right, rgba(64,126,193,1) 0%,rgba(83,198,232,1) 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#407ec1', endColorstr='#53c6e8',GradientType=1 );
    padding: 25px 50px;
    border-radius: 10px;
    color: #fff
		}
		.footer{

	margin: auto;

		}
		.footer img{
		}
		.footer .text{
			text-align: center;
		}
        /**/
        @-webkit-keyframes color_change {
        		  from { background-color: blue; }
        		  to { background-color: red; }
        		}
        		@-moz-keyframes color_change {
        		  from { background-color: blue; }
        		  to { background-color: red; }
        		}
        		@-ms-keyframes color_change {
        		  from { background-color: blue; }
        		  to { background-color: red; }
        		}
        		@-o-keyframes color_change {
        		  from { background-color: blue; }
        		  to { background-color: red; }
        		}
        		@keyframes color_change {
        		  from { background-color: blue; }
        		  to { background-color: red; }
        		}

        		#helloworld {
        		    background-color: blue;
        		    border: 5px solid white;
        		    border-radius: 50px;
        		    width: 50px;
        		    height: 50px;
        		   -webkit-animation: color_change 1s infinite alternate;
        		   -moz-animation: color_change 1s infinite alternate;
        		   -ms-animation: color_change 1s infinite alternate;
        		   -o-animation: color_change 1s infinite alternate;
        		   animation: color_change 1s infinite alternate;
        		}
	</style>
</head>
<body>
	<div class="container">
	<div class="header">
	<img src="http://3.bp.blogspot.com/-SMKDXN6mGTA/Uj_VY4foMvI/AAAAAAAAAOY/F3P2b27g4PQ/s640/doremon+doraemon+wallpaper.jpg"/></div>
	<div class="content-vn">
        <h3>$obj.password$</h3>
        <h4>$hm.namename$</h4>
        <h5>$obj.hss.namename$</h5>
        <h6>$obj.haha$</h6>
        <h1>$mylst$</h1>
		<p>Xin chào $name$</p>

		$obj.haha:{hah|$hah$ } $


		<div class="text">
		<span>
		Bla bla bla bla bla bla...
		</span>
		</div>
		<div class="btn">
			<a href="http://banktek.ntex.vn/infoRegister?tk=$token$">HOÀN TẤT ĐĂNG KÝ</a>
		</div>
	</div>
	<div class="content-en">
		<p>Welcome ABC XYZ</p>
		<div class="text">
		<span>
		Bla bla bla bla bla bla...
		</span>
		</div>
		<div class="btn">
		    <h1 style="color:red">Hello world</h1>
			<a href="http://banktek.ntex.vn/infoRegister?tk=$token$">COMPLETE REGISTRATION</a>
			<p color:aqua>http://banktek.ntex.vn/infoRegister?tk=$token$</p>
		</div>
	</div>
	<div class="footer">
		<img src="http://3.bp.blogspot.com/-SMKDXN6mGTA/Uj_VY4foMvI/AAAAAAAAAOY/F3P2b27g4PQ/s640/doremon+doraemon+wallpaper.jpg"/>
		<div class="text">
			<p><b>Address</b>: 437/16 Hoang Van Thu, Ward 4, District Tan Binh, Ho Chi Minh City</p>
			<p><b>Email</b>: Banktek@ntex.vn</p>
			<p><b>Phone</b>: 18005875</p>
		</div>
	</div>
	</div>
	<div id="helloworld"></div>
</body>
</html>
>>