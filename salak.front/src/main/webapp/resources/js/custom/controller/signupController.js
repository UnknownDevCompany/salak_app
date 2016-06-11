'use strict';
app.controller('loginController', ['$scope', '$location', function ($scope, $location) {

    $scope.loginData = {
        userName: "",
        password: "",
        useRefreshTokens: false
    };

    $scope.message = "";

    $scope.login = function () {
    	
    	$location.path('/orders');

    };
    
}]);