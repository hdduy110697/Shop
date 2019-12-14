$(document).ready(function() {
    var color;

    $('.color-choose input').on('click', function() {
        // iam do
        color = $(this).val();
        var masanpham= $("#masanpham").val();
        // /
        var headphonesColor = $(this).attr('data-image');
        $('.active').removeClass('active');
        $('.left-column img[data-image = ' + headphonesColor + ']').addClass('active');
        $(this).addClass('active');
        // and here
        $.ajax({
            url: "/shopclother_war_exploded/api/GetSizeProduct",
            // method:get,
            type: "GET",
            data: {
                color: color,
                masanpham:masanpham
            },
            success: function (data) {
                showMessage(data)
            },
            error: function (err) {
                alert('error!');
                console.log(err); //prints error object to console
            }
        })
    })
    $( ".cable-choose button" ).click(function() {
        $('.cable-choose .active').removeClass('active');
        $(this).addClass('active');
    });
    // when cleck  add to cart
    $( "#AddToCart" ).click(function() {
        var size = $(".cable-choose .active").val();
        if (size==null) {
            alert('chọn kích cỡ muốn  mua');
            return;
        }
        var masanpham= $("#masanpham").val();
        $.ajax({
            url: "/shopclother_war_exploded/api/ThemGioHang",
            // method:get,
            data: {
                type : "GET",
                color: color,
                size:size,
                masanpham:masanpham
            }, success : function(results){
                // trả về kết quả số lượng hàng có trong giỏ để hiển thị ra
                if (results>0){
                    $('#num').html(results);
                }else {
                    $('#num').css("display","none");
                }
            }
        })

    });


});

function showMessage(results) {
    var res = results.split(" ");
    var ex= ['M', 'L','XL'];
    var diff = $(ex).not(res).get();
    res.forEach(function(element) {
        if (element == 'M') {
            $('#M').html("M")
            $('#M').css("display", "inline-block");
        } else if (element == 'L') {
            $('#L').html("L")
            $('#L').css("display", "inline-block");
        }else if (element == 'XL') {
            $('#XL').html("XL")
            $('#XL').css("display", "inline-block");
        }
    });
    diff.forEach(function(element) {
        if (element == 'M') {
            $('#M').html("M")
            $('#M').css("display", "none");
        } else if (element == 'L') {
            $('#L').html("L")
            $('#L').css("display", "none");
        }else if (element == 'XL') {
            $('#XL').html("XL")
            $('#XL').css("display", "none");
        }
    });
}


