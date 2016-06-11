'use strict';
app.controller('ordersController', [ '$scope', 'ordersService',
		function($scope, ordersService) {

			$scope.orders = [ {
				orderID : '1',
				customerName : 'lelele',
				shipperCity : 'Flatland'
			} ];

		} ]);