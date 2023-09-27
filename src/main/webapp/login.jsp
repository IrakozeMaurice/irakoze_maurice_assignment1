<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Login</title>
<link rel="stylesheet" href="css/app.css" />
</head>
<body>
	<div class="container topbar flex">
		<div>
			<img src="img/logo.png" width="50" height="50" alt="college logo" />
		</div>
		<div>
			<p>123 Awd ave Kigali 8577</p>
			<p>email@example.ocm</p>
			<p>(250)788 45200</p>
		</div>
	</div>
	<div class="content">
		<div class="form_login">
			<h1>Sign in to your account</h1>
			<form method="POST" action="/login" id="login_form">
				<div>
					<label for="student_id">Student ID</label> <input type="text"
						id="student_id" name="student_id" />
				</div>
				<br />
				<div>
					<label for="password">Password</label> <input type="password"
						id="password" name="password" />
				</div>
				<br />
				<div>
					<button class="btn btn-block" type="submit">Sign in</button>
				</div>
			</form>
		</div>
	</div>

	<script src="js/auth.js"></script>
	<script src="js/app.js"></script>
</body>
</html>
