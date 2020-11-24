<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스터디 등록 화면</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<style>
	#inputForm {
		position:absolute;
		width: 1200px;
		height:400px;
		left: 50%;
		margin: 100px 0 0 -600px;
	}
	
	#title {
		margin: 0 0 20px 0;
	}
	
	#btnCancel {
		background: #D8D8D8;
		border: none;
	}
	
	#btnsubmit {
		background: rgb(68, 93, 119);
	}
	
	#formContents {
		background: #FDFDFE;
		padding: 20px 30px 20px 30px;
		margin: 0 0 20px 0;
		box-shadow: 0 0 15px #D8D8D8;
	}
	
	button {
		width: 120px;
		height: 40px;
	}
	
	body {
		background-color: #e5f0ff;
	}
</style>
</head>
<body>
	<div id="header" align="center" style="margin: 30px 0 0 0;">
	<h1><b>스터디 구인 게시판</b></h1>
	</div>
	
	<div id="inputForm">
	<div id="title" align="center">
	<img src="image/right.png" height="30px" width="30px" />제목<input type="text" id="title" style="width: 1120px; height: 45px;">
	</div>
	
	<form>
	
	<div id="formContents">
  	<div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCompany">기업</label>
      <input type="text" class="form-control" id="inputCompany">
    </div>
    <div class="form-group col-md-6">
      <label for="inputCategory">카테고리</label>
      <input type="text" class="form-control" id="inputCategory">
    </div>
  	</div>
 	<div class="form-group">
    	<label for="inputAge">지역</label>
      	<select id="inputAge" class="form-control">
        	<option selected>Choose...</option>
        	<option>서울</option>
        	<option>인천</option>
        	<option>부산</option>
      	</select>
  	</div>
  	<div class="form-group">
    	<label for="inputMember">인원</label>
    	<input type="text" class="form-control" id="inputMember" placeholder="인원">
  	</div>
  	<div class="form-row">
    <div class="form-group col-md-6">
      	<label for="inputCity">기간</label>
    <div class="form-check">
  		<input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="short" checked>
  		<label class="form-check-label" for="exampleRadios1">
    	단기
  		</label>
	</div>
	<div class="form-check">
  		<input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="long">
  		<label class="form-check-label" for="exampleRadios2">
    	장기
  		</label>
	</div>
    </div>
    <div class="form-group col-md-4">
      	<label for="inputAge">연령대</label>
      	<select id="inputAge" class="form-control">
        	<option selected>Choose...</option>
        	<option>~20</option>
        	<option>20~30</option>
        	<option>30~40</option>
      	</select>
    </div>
    </div>
    
    </div>
  	<div align="right">
  	<button type="submit" class="btn btn-primary" id="btnsubmit">등록</button>
  	<button type="button" class="btn btn-primary" id="btnCancel">취소</button>
  	</div>
	</form>
	</div>
</body>
</html>