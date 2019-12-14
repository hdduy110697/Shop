    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ include file="/common/taglib.jsp" %>
        <div class="container">

        <div class="logo float-left">
        <!-- Uncomment below if you prefer to use an image logo -->
        <h1 class="text-light"><a href="<c:url value="/trang-chu"/>" class="scrollto"><span>Shop</span></a></h1>
        <!-- <a href="#header" class="scrollto"><img src="img/logo.png" alt="" class="img-fluid"></a> -->
        </div>
        <nav class="main-nav float-right d-none d-lg-block">
        <ul>
            <li class="active"><a href="<c:url value="/trang-chu"/>">Home</a></li>
            <li><a href="#">HII</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Portfolio</a></li>
            <li><a href="#">Team</a></li>
            <li class="drop-down"><a href="">Drop Down</a>
                <ul>
                    <li><a href="#">Drop Down 1</a></li>
                    <li class="drop-down"><a href="#">Drop Down 2</a>
                        <ul>
                            <li><a href="#">Deep Drop Down 1</a></li>
                            <li><a href="#">Deep Drop Down 2</a></li>
                            <li><a href="#">Deep Drop Down 3</a></li>
                            <li><a href="#">Deep Drop Down 4</a></li>
                            <li><a href="#">Deep Drop Down 5</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Drop Down 3</a></li>
                    <li><a href="#">Drop Down 4</a></li>
                    <li><a href="#">Drop Down 5</a></li>
                </ul>
            </li>
        <li><a href="#footer">Contact Us</a></li>
        <li><a href="<c:url value="/cart"/>"><i class="fa fa-cart-plus" style="font-size:25px;">
            <div id="num">${sizeGioHang}</div>
        </i></a></li>
        <c:if test="${not empty userNhanVien}">
<%--            in web controler--%>
            <li class="nav-item">
                <a class="nav-link" href="#">WELCOME ${userNhanVien.hoten}</a>
            </li>
            <li>
                <a href="<c:url value="/dang-nhap?action=logout"/>" id="log-out">Đăng Xuất</a>
            </li>
        </c:if>
        <c:if test="${empty userNhanVien}">
            <li><a href="<c:url value="/dang-nhap"/>">Login</a></li>
        </c:if>

        </ul>
        </nav><!-- .main-nav -->
        </div>
