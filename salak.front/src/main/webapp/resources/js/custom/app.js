var app = angular.module('salak', [ 'ngRoute', 'angular-loading-bar']);

app.config(function ($routeProvider) {
	 
    $routeProvider.when("/home", {
        controller: "homeController",
        templateUrl: "../../html/partials/home.html"
    });
 
    $routeProvider.when("/login", {
        controller: "loginController",
        templateUrl: "../../html/partials/login.html"
    });
 
    $routeProvider.when("/signup", {
        controller: "signupController",
        templateUrl: "../../html/partials/signup.html"
    });
 
    $routeProvider.when("/orders", {
        controller: "ordersController",
        templateUrl: "../../html/partials/orders.html"
    });
 
    $routeProvider.otherwise({ 
    	redirectTo: "/home" 
    });
    
});
