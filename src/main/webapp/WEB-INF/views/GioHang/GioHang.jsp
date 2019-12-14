<%--
  Created by IntelliJ IDEA.
  User: BSC
  Date: 09/07/2019
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<div class="shopping-cart">

    <div class="column-labels">
        <label class="product-image">Image</label>
        <label class="product-details">Product</label>
        <label class="product-price">Price</label>
        <label class="product-quantity">Quantity</label>
        <label class="product-removal">Remove</label>
        <label class="product-line-price">Total</label>
    </div>

<%--        start here--%>
    <c:forEach items="${gioHangs}" var="giohang">
        <div class="product">
            <div class="product-image">
                <img src="<c:url value='/template/web/img/imgshop/${giohang.chiTietSanPham.hinhsanpham}'/>">
            </div>
            <div class="product-details">
                <div class="product-title">${giohang.chiTietSanPham.sanpham.nameProduct}</div>
                <p class="product-description">Born from running culture, these men's shoes deliver the freedom of a cage-free design</p>
            </div>
            <div class="product-price">${giohang.chiTietSanPham.sanpham.priceProduct}</div>
            <div class="product-quantity">
                <input type="number" value="${giohang.numberInCart}" min="1">
            </div>
            <div class="product-removal">
                <button class="remove-product">
                    <input class="IdDetail" value="${giohang.chiTietSanPham.machitietsanpham}" style="display: none;">
                    Remove
                </button>
            </div>
            <div class="product-line-price">${giohang.chiTietSanPham.sanpham.priceProduct*giohang.numberInCart}</div>
        </div>
    </c:forEach>
<%--    end here--%>
    <div class="totals">
        <div class="totals-item">
            <label>Subtotal</label>
            <div class="totals-value" id="cart-subtotal" >${totalMoney}</div>
        </div>
        <div class="totals-item">
            <label>Tax (5%)</label>
            <div class="totals-value" id="cart-tax">${totalMoney*(5/100)}</div>
        </div>
        <div class="totals-item">
            <label>Shipping</label>
            <div class="totals-value" id="cart-shipping">15000</div>
        </div>
        <div class="totals-item totals-item-total">
            <label>Grand Total</label>
            <c:if test="${totalMoney==0}">
                <div class="totals-value" id="cart-total">0</div>
            </c:if>
            <c:if test="${totalMoney!=0}">
                <div class="totals-value" id="cart-total">${totalMoney+totalMoney*(5/100)+15000}</div>
            </c:if>
        </div>
    </div>

    <button class="checkout" id="openForm">Checkout</button>
    <button class="checkout" id="closeFormSold ">Close</button>
    <form id="contactform" name="contact" method="post" action="#" style="display: none;">
        <p class="note"><span class="req">*</span> Asterisk fields are required</p>
        <div class="row">
            <label for="name">Họ và tên <span class="req">*</span></label>
            <input type="text" name="name" id="name" class="txt" tabindex="1" placeholder="Họ và tên" required>
        </div>

        <div class="row">
            <label for="address">Địa chỉ <span class="req">*</span></label>
            <input type="text" name="address" id="address" class="txt" tabindex="2" placeholder="Địa chỉ" required>
        </div>

        <div class="row">
            <label for="phone">Số điện thoại <span class="req">*</span></label>
            <input type="tel" name="phone" id="phone" class="txt" tabindex="3" placeholder="số điện thoại" required>
        </div>

        <div class="row">
            <label for="message">Message <span class="req">*</span></label>
            <textarea name="message" id="message" class="txtarea" tabindex="4" required></textarea>
        </div>

        <div class="center">
            <input type="submit" id="submitbtn" name="submitbtn" tabindex="5" value="Send Message">
        </div>
    </form>
</div>
