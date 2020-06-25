<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<div class="container d-flex justify-content-center">
        <form class="w-25 py-3" id="form" method="POST" enctype="application/x-www-form-urlencoded">
              <h1 class="h3 mb-3 font-weight-normal">Sign in</h1>
              <div class="form-group">
                    <label for="username" class="sr-only">Username</label>
                    <input type="text" id="username" class="form-control my-2 ${response.success.equals('false') ? 'border-danger' : ''}" placeholder="Username" required autofocus="" name="username">
              </div>
              <div class="form-group">
                  <label for="password" class="sr-only">Password</label>
                  <input type="password" id="password" class="form-control my-2 ${response.success.equals('false') ? 'border-danger' : ''}" placeholder="Password" required name="password">
              </div>

              <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>
    </div>
</body>
</html>