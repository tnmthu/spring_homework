$('#form').submit((event) => {
    event.preventDefault();
    $.ajax({
        type: 'POST',
        url: '/login',
        dataType: 'json',
        data: {
            'username': $('#username').val(),
            'password': $('#password').val()
        },
        success: (response) => {
            console.log(response);
        },
        error: (error) => {
            console.error(error);
        }
    })

});
