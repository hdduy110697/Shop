$("#login").click( function(){
    $('.LoginForm').css("display","block");

    $('.SignUpForm').css("display","none");

    var username = $("#tendangnhap").val();
    var password = $("#password").val();
    // xuat ra
    if(username == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Username is required </font>");
        return;
    }
    if(password == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Password is required </font>");
        return;
    }
    // xuat

    $.ajax({
        url : "api/KiemTraDangNhap",
        // method:get,

        data : {
            type : "GET",
            tendangnhap : username,
            password : password
        },
        success : function(results){
            if(results != null && results != ""){
                showMessage(results);
                $('#messageDiv').css("display","block");
            }else{
                $('#messageDiv').css("display","none");
                $('#messageDiv').html("");
                alert("Some exception occurred! Please try again.");
            }
        }
    })
});
function showMessage(results) {
    if (results == 'SUCCESS') {
        urlNow=window.location.href;
        urlNew=urlNow.replace("/dang-nhap","/trang-chu");
        window.location=urlNew;
        // alert(urlNew);
        // $('#messageDiv').html("<font color='green'>You are successfully logged in. </font>")
    } else if (results == 'FAILURE') {
        $('#messageDiv').html("<font color='red'>Username or password incorrect </font>")
    }
}
// sign -up

$("#sigh-up").click( function(){
    $(".SignUpForm").css("display","block");
    $(".LoginForm").css("display","none");
    var Username = $("#Username").val();
    var passwordSignUp = $("#passwordSignUp").val();
    var passwordSignUpAgain = $("#passwordSignUpAgain").val();
    var email = $("#email").val();
    var gender = $("#gender").val();
    var FullName = $("#FullName").val();
    var Address = $("#Address").val();
    var CMND = $("#CMND").val();
    var test= $(this).attr("test");
    // lien tuc return cho den khi thoa het tat cac dieu kien
    if(Username == "" ){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Username is required </font>");
        return;
    }
    if(passwordSignUp == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Password is required </font>");
        return;
    }
    if(passwordSignUpAgain == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Re Password is please </font>");
        return;
    }
    if(email == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>email is required </font>");
        return;
    }
    if(gender == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>gender is required </font>");
        return;
    }
    if(FullName == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>FullName is required </font>");
        return;
    }
    if(Address == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Address is required </font>");
        return;
    }
    if(CMND == ""){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>CMND is required </font>");
        return;
    }
    // kiem tra xem mk có trùng nhau chưa
    if (passwordSignUp !=passwordSignUpAgain){
        $('#messageDiv').css("display","block");
        $('#messageDiv').html("<font color='red'>Re-Password Incorrect </font>");

    }else {
        $('#signup').submit() ;
        return;
    }
});
// function check(check) {
//     if (check==0) {
//
//     }
// }
// $('.active'ad{
//     $(".SignUpForm").css("display","block");
//     $(".LoginForm").css("display","none");
// })


