<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="author" content="colorlib.com">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,600,700" rel="stylesheet" />
    <!--  css 파일 불러오는 부분 -->
    <link href="company.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  </head>
  <body>
    <div class="s009">
      <form>
        <div class="result">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col"></th>
			      <th scope="col">기업 형태</th>
			      <th scope="col">산업</th>
			      <th scope="col">대표자</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row"><a href="#">삼성전자</a></th>
			      <td><a href="#">대기업</a></td>
			      <td><a href="#">전기전자</a></td>
			      <td><a href="#">이재용</a></td>
			    </tr>
			    <tr>
			      <th scope="row">삼성전자</th>
			      <td><a href="#">대기업</a></td>
			      <td><a href="#">전기전자</a></td>
			      <td><a href="#">이재용</a></td>
			    </tr>
			    <tr>
			      <th scope="row">삼성전자</th>
			      <td><a href="#">대기업</a></td>
			      <td><a href="#">전기전자</a></td>
			      <td><a href="#">이재용</a></td>
			    </tr>
				<tr>
			      <th scope="row">삼성전자</th>
			      <td><a href="#">대기업</a></td>
			      <td><a href="#">전기전자</a></td>
			      <td><a href="#">이재용</a></td>
			    </tr>
			    <tr>
			      <th scope="row">삼성전자</th>
			      <td><a href="#">대기업</a></td>
			      <td><a href="#">전기전자</a></td>
			      <td><a href="#">이재용</a></td>
			    </tr>
			  </tbody>
			</table>
         	<div class="clearfix">
                <ul class="pagination">
                    <li class="page-item disabled"><a href="#">Previous</a></li>
                    <li class="page-item"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item active"><a href="#" class="page-link">3</a></li>
                    <li class="page-item"><a href="#" class="page-link">4</a></li>
                    <li class="page-item"><a href="#" class="page-link">5</a></li>
                    <li class="page-item"><a href="#" class="page-link">Next</a></li>
                </ul>
            </div>
    	</div>
        </form>
    </div>
    <script src="js/extention/choices.js"></script>
    <script>
      const customSelects = document.querySelectorAll("select");
      const deleteBtn = document.getElementById('delete')
      const choices = new Choices('select',
      {
        searchEnabled: false,
        itemSelectText: '',
        removeItemButton: true,
      });
      deleteBtn.addEventListener("click", function(e)
      {
        e.preventDefault()
        const deleteAll = document.querySelectorAll('.choices__button')
        for (let i = 0; i < deleteAll.length; i++)
        {
          deleteAll[i].click();
        }
      });
    </script>
  </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
