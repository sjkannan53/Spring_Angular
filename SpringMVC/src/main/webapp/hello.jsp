<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="demoApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJs Demo</title>
<script src="js/angular.min.js"></script>
<script src="js/app.js"></script>
</head>
<body>
 <div ng-controller="demoCtrl">
  <table border="1">
   <tr>
    <td>Book Name</td>
    <td ng-bind="book"></td>
   </tr>
   <tr>
    <td>Author</td>
    <td ng-bind="author"></td>
   </tr>
  </table>
 </div>
</body>
</html>