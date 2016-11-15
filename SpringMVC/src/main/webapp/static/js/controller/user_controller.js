'use strict';


 
angular.module('myApp').controller('UserController', ['$scope','$http', 'UserService', function($scope,$http, UserService) {
 
	 
	   var self = this;
	   self.vm={
				username:'',
				password:'',
				success:'',
				error:''
		}
    self.user={id:null,username:'',address:'',email:''};
    self.users=[];

  self.register = register;
    self.error='';
    self.success='';
    self.reset = reset;
  
    self.login = login;
	 function login(vm) {
  	   $http.post("app/call/login",vm)
         .then(
         function (response) {
          alert(response.data.message);
          console.log(response.data.success);
          if(response.data.success==true){
        	  self.vm.success=response.data.message;
          }else{
        	  self.vm.error=response.data.message;
          }
          
         },
         function(errResponse){
             console.log('Error while fetching Users');
             
         }
     );
  }
	 
	
	   

	    function register() {
	    	   $http.get("app/call/helloworld")
	           .then(
	           function (response) {
	             alert(data);
	           },
	           function(errResponse){
	               console.log('Error while fetching Users');
	               
	           }
	       );
	    }

	   


	    function reset(){
	        self.user={id:null,username:'',address:'',email:''};
	        $scope.myForm.$setPristine(); //reset Form
	    }
}]);
