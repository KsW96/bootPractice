<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>DungsShop</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/header.css">
<link rel="stylesheet" href="/css/login.css" />
<script src="/js/login.js"></script>
    <script src="/js/detail.js"></script>
    <script src="/js/header.js"></script>
</head>
<body>
        <header class="py-3 bg-light">
	      <div class="row flex-nowrap justify-content-between align-items-center">
	        <div class="col-2 pt-1 ms-3">
	          <a class="navbar-brand" id="logo" href="/main">DUNGS</a>
	        </div>
	        <div class="col-6 text-center">
	          <form class="d-flex" role="search" name = "name" action="/search">
	              <input class="form-control me-1 rounded-pill" name="search" type="search" autocomplete="off" placeholder="재료 검색">
	              <button class="btn btn-sm btn-outline-warning rounded-pill" type="submit">
	                  <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="mx-3" role="img" viewBox="0 0 24 24" focusable="false"><title>Search</title><circle cx="10.5" cy="10.5" r="7.5"></circle><path d="M21 21l-5.2-5.2"></path></svg>
	              </button>
	          </form>
	        </div>
	        <div class="col-3 d-flex justify-content-end align-items-center">
	        		<a class="text-muted me-4" href="/DungsMall/cart.do">
	              		<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(0, 0, 0, 1);transform: msFilter"><path d="M21.822 7.431A1 1 0 0 0 21 7H7.333L6.179 4.23A1.994 1.994 0 0 0 4.333 3H2v2h2.333l4.744 11.385A1 1 0 0 0 10 17h8c.417 0 .79-.259.937-.648l3-8a1 1 0 0 0-.115-.921z"></path><circle cx="10.5" cy="19.5" r="1.5"></circle><circle cx="17.5" cy="19.5" r="1.5"></circle></svg>
		          	</a>
		          	<a class="text-muted me-4" href="/DungsMall/receipt.do">
		              	<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" style="fill: rgba(0, 0, 0, 1);transform: msFilter"><path d="M20 12v6a1 1 0 0 1-2 0V4a1 1 0 0 0-1-1H3a1 1 0 0 0-1 1v14c0 1.654 1.346 3 3 3h14c1.654 0 3-1.346 3-3v-6h-2zm-6-1v2H6v-2h8zM6 9V7h8v2H6zm8 6v2h-3v-2h3z"></path></svg>
		          	</a>
<c:if test="${empty login}">
    <a class="btn btn-outline-secondary me-5 rounded-pill" href="/login">Login</a>
</c:if>
<c:if test="${login eq 'true'}">
    <a class="btn btn-outline-secondary me-5 rounded-pill" href="/login/logout">Logout</a>
</c:if>
	        </div>
	      </div>
    	</header>
	<main>
		<!-- 로그인 창 -->
		<div class="container mt-5">
			<div class="row justify-content-center">
				<div class="col-mt-6">
					<div class="card p-4">
						<form action="/login/loginCheck" method="post">
							<div class="mb-3">
								<label for="id" class="form-label">아이디</label> <input
									type="text" class="form-control" id="id" name="id" required>
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">비밀번호</label> <input
									type="password" class="form-control" id="password"
									name="password" required>
							</div>
							<div class="mb-3">
								<div class="d-grid gap-2">
									<input class="btn btn-warning" type="submit"
										style="font-weight: bold;" value="로그인"></input>
								</div>
							</div>
						</form>
						<button class="btn btn-warning" type="button"
							style="font-weight: bold;"
							onclick="location.href='/DungsMall/join.do'">회원가입</button>
					</div>
				</div>
			</div>
		</div>
	</main>
</html>