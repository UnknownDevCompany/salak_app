'use strict';
app.controller('indexController', [ '$scope', '$location',
	function($scope, $location) {

		$scope.logOut = function() {
			authService.logOut();
			$location.path('/home');
		}

		$scope.firstName = 'lalalalaa';

		$scope.authentication = {
			isAuth : false,
			userName : "",
			useRefreshTokens : false
		};

} ]);