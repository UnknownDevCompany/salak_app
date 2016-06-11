'use strict';
app.factory('ordersService', ['$http', function ($http) {

    var ordersServiceFactory = {};

    var _getOrders = function () {
    	   	
    	var results = [
           {
           	orderID : '1',
            customerName : 'lelele',
            shipperCity : 'Flatland' 
           }
    	];
    	
    	return results;

    };

    ordersServiceFactory.getOrders = _getOrders;

    return ordersServiceFactory;

}]);