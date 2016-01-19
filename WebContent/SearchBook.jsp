<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search book here</title>
</head>
<body>
<div style="width: 100%; text-align: center">
		<img  src="Images/BookSearch.jpg" width="904"
			height="328" />

	<form name="AddBook" ACTION="AddBookServlet" method="post"
			onsubmit="return check_students()">
			<fieldset style="display:inline;text-align: center"">
				<legend>Enter name of book to search:</legend>
				<p>
					<label>Book Name</label> <input name="bookName" type="text" />
				</p>
				<br style="clear: both;" />
				<input type="hidden" name="ForSearchingBook" value="ForSearchingBook">
				<p>
					<input class="button" type="submit" value="Search Book" />
				
				</p>
				</fieldset>
				</form>
					</div>
</body>
</html>