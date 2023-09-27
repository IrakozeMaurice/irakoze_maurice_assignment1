<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sign up</title>
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
	<div class="form_register">
		<h1>Sign up</h1>
		<form method="POST" action="/register" id="register_form">
			<div>
				<label for="student_id">Student ID</label> <input type="text"
					id="student_id" name="student_id" /> <span
					class="student_id format hidden">5 digits Example: 21435</span>
			</div>
			<br />
			<div>
				<label for="firstname">Firstname</label> <input type="text"
					id="firstname" name="firstname" /> <span
					class="firstname format hidden">at least 2
					characters(max 30)</span>
			</div>
			<br />
			<div>
				<label for="lastname">Lastname</label> <input type="text"
					id="lastname" name="lastname" /> <span
					class="lastname format hidden">at least 2
					characters(max 30)</span>
			</div>
			<br />
			<div>
				<label for="faculty">Faculty</label> <select name="faculty"
					id="faculty">
					<option disabled selected hidden>Please select</option>
				</select>
			</div>
			<br />
			<div>
				<label for="department">Department</label> <select name="department"
					id="department">
					<option value="">Please select</option>
				</select>
			</div>
			<br />
			<div>
				<label for="address">Address</label> <input type="text" id="address"
					name="address" /> <span class="address format hidden">at
					least 2 characters(max 30)</span>
			</div>
			<br />
			<div>
				<label for="phone_number">Phone number</label> <input type="text"
					id="phone_number" name="phone_number" /> <span
					class="phone_number format hidden">10 digit
					phone number starting with 078, 079, 073 or 072</span>
			</div>
			<br />
			<div>
				<label for="email">email</label> <input type="text" id="email"
					name="email" /> <span class="email format hidden">Example:
					johndoe@example.com</span>
			</div>
			<br />
			<div>
				<label for="password">Password</label> <input type="password"
					id="password" name="password" /> <span
					class="password format hidden">at least 6 characters</span>
			</div>
			<div>
				<br />
				<div>
					<label for="confirm_password">Confirm password</label> <input
						type="password" id="confirm_password" name="confirm_password" />
					<span class="confirm_password format hidden">at
						least 6 characters</span>
				</div>
				<br />
				<button class="btn btn-block" id="register_btn" type="submit">
					Sign up</button>
			</div>
		</form>
	</div>

	<script src="js/auth.js"></script>
	<script src="js/app.js"></script>
</body>
</html>
