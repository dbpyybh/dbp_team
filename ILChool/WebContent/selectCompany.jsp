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
    <!--  css ���� �ҷ����� �κ� -->
    <link href="select_company.css" rel="stylesheet" />
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
        <div class="inner-form">
          <div class="basic-search">
            <div class="input-field">
              <input id="search" type="text" placeholder="������� �Է��ϼ���" />
              <div class="icon-wrap">
                <svg class="svg-inline--fa fa-search fa-w-16" fill="#ccc" aria-hidden="true" data-prefix="fas" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                  <path d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path>
                </svg>
              </div>
            </div>
          </div>
          <div class="advance-search">
            <span class="desc">ä����� �� �˻�</span>
            <div class="row">
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">��� ����</option>
                    <option>����</option>
                    <option>���� 1000�� ���</option>
                    <option>�������</option>
                    <option>�߰߱��</option>
                    <option>���ұ��</option>
                    <option>�ܱ��� ���</option>
                    <option>��ó ���</option>
                    <option>��������������</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">�ٹ� ����</option>
                    <option>����</option>
                    <option>���</option>
                    <option>��õ</option>
                    <option>�λ�</option>
                    <option>�뱸</option>
                    <option>����</option>
                    <option>����</option>
                    <option>���</option>
                    <option>����</option>
                    <option>����</option>
                    <option>�泲</option>
                    <option>���</option>
                    <option>����</option>
                    <option>����</option>
                    <option>�泲</option>
                    <option>���</option>
                    <option>����</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">���</option>
                    <option>���񽺾�</option>
                    <option>������ȭ��</option>
                    <option>IT���������</option>
                    <option>���ࡤ������</option>
                    <option>�̵�������</option>
                    <option>������</option>
                    <option>�Ƿᡤ���ࡤ����</option>
                    <option>�Ǹš�����</option>
                    <option>�Ǽ���</option>
                    <option>�������ȸ</option>
                  </select>
                </div>
              </div>
            </div>
            <div class="row second">
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">����</option>
                    <option>�濵���繫</option>
                    <option>�������������</option>
                    <option>���ꡤ����</option>
                    <option>IT�����ͳ�</option>
                    <option>������</option>
                    <option>����</option>
                    <option>�̵��</option>
                    <option>Ư������������</option>
                    <option>�Ǽ�</option>
                    <option>���롤����</option>
                    <option>����</option>
                    <option>������</option>
                    <option>�Ƿ�</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">�ٹ� ����</option>
                    <option>������</option>
                    <option>�����</option>
                    <option>������</option>
                    <option>�Ƹ�����Ʈ</option>
                    <option>�İ���</option>
                    <option>��������</option>
                    <option>�Ⱓ��</option>
                    <option>��������</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">���</option>
                    <option>����</option>
                    <option>���</option>
                    <option>��¹���</option>
                  </select>
                </div>
              </div>
            </div>
            <div class="row third">
              <div class="input-field">
                <div class="result-count">
                  <span>0 </span>���� �˻����</div>
                <div class="group-btn">
                  <button class="btn-delete" id="delete">�ʱ�ȭ</button>
                  <button class="btn-search">�˻�</button>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="result">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col"></th>
			      <th scope="col">����</th>
			      <th scope="col">��� ����</th>
			      <th scope="col">�ٹ� ����</th>
			      <th scope="col">���</th>
			      <th scope="col">����</th>
			      <th scope="col">���</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">�Ｚ����</th>
			      <td>�Ｚ���� ���� ���� ä��</td>
			      <td>����</td>
			      <td>����</td>
			      <td>��������</td>
			      <td>����Ʈ����</td>
			      <td>����</td>
			    </tr>
			    <tr>
			      <th scope="row">LG</th>
			      <td>�Ｚ���� ���� ���� ä��</td>
			      <td>����</td>
			      <td>����</td>
			      <td>��������</td>
			      <td>����Ʈ����</td>
			      <td>����</td>
			    </tr>
			    <tr>
			      <th scope="row">LG</th>
			      <td>�Ｚ���� ���� ���� ä��</td>
			      <td>����</td>
			      <td>����</td>
			      <td>��������</td>
			      <td>����Ʈ����</td>
			      <td>����</td>
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
    <script src="<c:url value='/js/extension/choices.js' />"></script>
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