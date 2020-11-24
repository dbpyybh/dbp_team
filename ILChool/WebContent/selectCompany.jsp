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
              <input id="search" type="text" placeholder="기업명을 입력하세요" />
              <div class="icon-wrap">
                <svg class="svg-inline--fa fa-search fa-w-16" fill="#ccc" aria-hidden="true" data-prefix="fas" data-icon="search" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                  <path d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path>
                </svg>
              </div>
            </div>
          </div>
          <div class="advance-search">
            <span class="desc">채용공고 상세 검색</span>
            <div class="row">
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">기업 형태</option>
                    <option>대기업</option>
                    <option>매출 1000대 기업</option>
                    <option>금융기관</option>
                    <option>중견기업</option>
                    <option>강소기업</option>
                    <option>외국계 기업</option>
                    <option>벤처 기업</option>
                    <option>공공기관·공기업</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">근무 지역</option>
                    <option>서울</option>
                    <option>경기</option>
                    <option>인천</option>
                    <option>부산</option>
                    <option>대구</option>
                    <option>광주</option>
                    <option>대전</option>
                    <option>울산</option>
                    <option>세종</option>
                    <option>강원</option>
                    <option>경남</option>
                    <option>경북</option>
                    <option>전남</option>
                    <option>전북</option>
                    <option>충남</option>
                    <option>충북</option>
                    <option>제주</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">산업</option>
                    <option>서비스업</option>
                    <option>제조·화학</option>
                    <option>IT·웹·통신</option>
                    <option>은행·금융업</option>
                    <option>미디어·디자인</option>
                    <option>교육업</option>
                    <option>의료·제약·복지</option>
                    <option>판매·유통</option>
                    <option>건설업</option>
                    <option>기관·협회</option>
                  </select>
                </div>
              </div>
            </div>
            <div class="row second">
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">직종</option>
                    <option>경영·사무</option>
                    <option>영업·고객상담</option>
                    <option>생산·제조</option>
                    <option>IT·인터넷</option>
                    <option>전문직</option>
                    <option>교육</option>
                    <option>미디어</option>
                    <option>특수계층·공공</option>
                    <option>건설</option>
                    <option>유통·무역</option>
                    <option>서비스</option>
                    <option>디자인</option>
                    <option>의료</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">근무 형태</option>
                    <option>정규직</option>
                    <option>계약직</option>
                    <option>인턴직</option>
                    <option>아르바이트</option>
                    <option>파견직</option>
                    <option>프리랜서</option>
                    <option>기간제</option>
                    <option>무기계약직</option>
                  </select>
                </div>
              </div>
              <div class="input-field">
                <div class="input-select">
                  <select data-trigger="" name="choices-single-defaul">
                    <option placeholder="" value="">경력</option>
                    <option>신입</option>
                    <option>경력</option>
                    <option>경력무관</option>
                  </select>
                </div>
              </div>
            </div>
            <div class="row third">
              <div class="input-field">
                <div class="result-count">
                  <span>0 </span>개의 검색결과</div>
                <div class="group-btn">
                  <button class="btn-delete" id="delete">초기화</button>
                  <button class="btn-search">검색</button>
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
			      <th scope="col">제목</th>
			      <th scope="col">기업 형태</th>
			      <th scope="col">근무 지역</th>
			      <th scope="col">산업</th>
			      <th scope="col">직종</th>
			      <th scope="col">경력</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">삼성전자</th>
			      <td>삼성전자 신입 공개 채용</td>
			      <td>대기업</td>
			      <td>서울</td>
			      <td>전기전자</td>
			      <td>소프트웨어</td>
			      <td>신입</td>
			    </tr>
			    <tr>
			      <th scope="row">LG</th>
			      <td>삼성전자 신입 공개 채용</td>
			      <td>대기업</td>
			      <td>서울</td>
			      <td>전기전자</td>
			      <td>소프트웨어</td>
			      <td>신입</td>
			    </tr>
			    <tr>
			      <th scope="row">LG</th>
			      <td>삼성전자 신입 공개 채용</td>
			      <td>대기업</td>
			      <td>서울</td>
			      <td>전기전자</td>
			      <td>소프트웨어</td>
			      <td>신입</td>
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
