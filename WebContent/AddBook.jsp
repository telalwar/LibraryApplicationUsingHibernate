<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Book here</title>
</head>
<body style="background-color: black;" text="white">
	<div style="width: 100%; text-align: center">
		<img style="align: center;" src="Images/books.jpg" width="904"
			height="328" />
	</div>

	<div style="padding: 10% 10% 10% 10%;">
		<form name="AddBook" ACTION="AddBookServlet" method="post"
			onsubmit="return check_students()">
			<fieldset>
				<legend>Add book here:</legend>
				<p>
					<label>Book Name</label> <input name="bookName" type="text" />
				</p>
				<p>
					<label>Author</label> <input name="author" type="text" />
				</p>
				<p>
					<label>Available</label> <select name="availability"><option>yes</option>
					</select>
				</p>
				<p>
					<label>Edition</label><input name="edition" type="text" />
				</p>
				<input type="hidden" name="ForAddingBook" value="ForAddingBook">
				<br style="clear: both;" />
				<p>
					<input class="button" type="submit" value="Add Book" />
				
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>