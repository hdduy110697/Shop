<%--
  Created by IntelliJ IDEA.
  User: BSC
  Date: 09/07/2019
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>

<!--Coded with love by Mutiullah Samim-->
<div class="flex col-2 row" id="form">
    <div class="left col">
        <div class="col-spacer LoginForm" >
            <div class="form-header"><i class="fas fa-lock icon txtglow"></i><span>Login Form</span></div>
        </div>
        <div class="col-spacer SignUpForm" style="display:none;">
           <div class="form-header"><i class="fas fa-lock icon txtglow"></i><span>Sign Up Form</span></div>
       </div>
<%--        login form--%>
        <div class="input-wrap LoginForm">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-user"></i></div>
                <input type="text" name="tendangnhap" id="tendangnhap" placeholder="Username or Email"/>
            </div>
        </div>
        <div class="input-wrap LoginForm">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-key"></i></div>
                <input type="password"name="password" id="password" placeholder="Password"/>
            </div><a class="input-desc LoginForm" href="#">Forgot your password or username?</a>
        </div>
<%--        end login form--%>
<%--        SignUpForm--%>
        <form method="post" name="signup" id="signup">
        <div class="input-wrap SignUpForm"style="display: none">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-user"></i></div>
                <input type="text" name="Username" id="Username" placeholder="Username"/>
            </div>
        </div>
        <div class="input-wrap SignUpForm" style="display: none;">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-key"></i></div>
                <input type="password"name="passwordSignUp" id="passwordSignUp" placeholder="Password"/>
            </div>
        </div>
        <div class="input-wrap SignUpForm" style="display: none";>
            <div class="input-icon">
                <div class="icon"><i class="fas fa-key"></i></div>
                <input type="password"name="passwordSignUpAgain" id="passwordSignUpAgain" placeholder="Re-Password"/>
            </div>
        </div>
        <div class="input-wrap SignUpForm" style="display: none">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-user"></i></div>
                <input type="text" name="email" id="email" placeholder="Email"/>
            </div>
        </div>
        <div class="input-wrap SignUpForm"style="display: none">
                <input type="radio" name="gender"   value="0">Female
                <input type="radio" name="gender"  value="1">Male
        </div>
        <div class="input-wrap SignUpForm"style="display: none">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-user"></i></div>
                <input type="text" name="FullName" id="FullName" placeholder="Full Name"/>
            </div>
        </div>
        <div class="input-wrap SignUpForm"style="display: none">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-user"></i></div>
                <input type="text" name="Address" id="Address" placeholder="Address"/>
            </div>
        </div>
        <div class="input-wrap SignUpForm"style="display: none">
            <div class="input-icon">
                <div class="icon"><i class="fas fa-user"></i></div>
                <input type="text" name="CMND" id="CMND" placeholder="CMND"/>
            </div>
        </div>
        </form>
        <div class="flex space mt-5">
            <div class="cb-wrap">
                <input class="glow" id="remember" type="checkbox" name="rembember"/>
                <label for="remember" >Remember me</label>
            </div>
            <c:if test="${not empty test}">
                <button id="login" class="primary" <%--type="submit"--%>accesskey=""  >SIGN-IN</button>
                <button id="sigh-up" class="primary"  <%--type="submit"--%>accesskey="" >SIGN-UP</button>

            </c:if>
            <c:if test="${empty test}">
                <button id="login" class="primary" <%--type="submit"--%>accesskey=""  >SIGN-IN</button>
                <button id="sigh-up" class="primary"  <%--type="submit"--%>accesskey="" >SIGN-UP</button>
            </c:if>

        </div>
<%--        end sign-up form--%>
        <c:if test="${not empty test}">
            <div id="messageDiv" class="LoginForm" style="display:block; color: red;">${test}</div>
        </c:if>
        <c:if test="${empty test}">
            <div id="messageDiv" class="LoginForm" style="display:none;"></div>
        </c:if>
    </div>
    <div class="right col flex column">
        <div class="col-spacer"></div>
        <button class="twitter social"><i class="fab fa-twitter fa-fw"></i>Sign in with Twitter</button>
        <button class="facebook social"><i class="fab fa-facebook-f fa-fw"></i>Sign in with Facebook</button>
        <button class="googleplus social"><i class="fab fa-google-plus-g fa-fw"></i>Sign in with Google+</button>
        <button class="linkedin social"><i class="fab fa-linkedin-in fa-fw"></i>Sign in with Linkedin</button>
    </div>
</div>