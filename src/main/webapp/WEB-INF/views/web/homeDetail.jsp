<%--
  Created by IntelliJ IDEA.
  User: BSC
  Date: 09/21/2019
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<section class="clearfix" id="intro1">
    <main class="container2">
    <!-- Left Column / Headphones Image -->
    <div class="left-column">
        <img data-image="none" class="active" src="<c:url value='/template/web/img/imgshop/${product.AvatarForHomePage()}'/>" alt="">
        <c:forEach items="${product.chitietsanpham}" var="ChiTietSanPham">
            <img data-image="${ChiTietSanPham.mausanpham.tenmau}" src="<c:url value='/template/web/img/imgshop/${ChiTietSanPham.hinhsanpham}'/>" alt="">
        </c:forEach>
    </div>


    <!-- Right Column -->
    <div class="right-column">

        <!-- Product Description -->
        <div class="product-description">
            <span>Headphones</span>
            <h1>${product.nameProduct}</h1>
            <p>${product.description}</p>
        </div>

        <!-- Product Configuration -->
        <div class="product-configuration">

            <!-- Product Color -->

            <div class="product-color">
                <span>Color</span>
<%--                get id back to sever--%>
                <input type="radio" id="masanpham" name="masanpham" value="${product.id_product}" style="display: none;">

                <div class="color-choose">
                    <c:forEach items="${DetailProductDontHaveSameColor}" var="ChiTietSanPham">
                        <div>
                            <input data-image="${ChiTietSanPham.mausanpham.tenmau}" type="radio" id="${ChiTietSanPham.mausanpham.tenmau}" name="color" value="${ChiTietSanPham.mausanpham.tenmau}" checked>
                            <label for="${ChiTietSanPham.mausanpham.tenmau}">
                                <span>${ChiTietSanPham.mausanpham.tenmau}<br>
                                    <img src="<c:url value='/template/web/img/imgshop/${ChiTietSanPham.hinhsanpham}'/>"style="width: 100px;height: 130px;">
                                </span>
                            </label>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <!-- Cable Configuration -->
            <div class="cable-config">
                <span>Kích Thước</span>

                <div class="cable-choose">
                    <c:forEach items="${sizes}" var="size">
                        <button id="${size.size}" style="display: none;" value="${size.size}">${size.size}</button>
                    </c:forEach>
                </div>
                <a href="#">How to configurate your headphones</a>
            </div>
        </div>

        <!-- Product Pricing -->
        <div class="product-price">
            <span>${product.priceProduct}</span>
            <a href="#" class="cart-btn" id="AddToCart" >Add to cart</a>
        </div>
    </div>
    </main>
</section>