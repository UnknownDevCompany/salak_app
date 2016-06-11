'use strict';
app.factory('authService', ['$http', '$q', 'localStorageService', 'ngAuthSettings', function ($http, $q, localStorageService, ngAuthSettings) {

    var authentication = {
        isAuth: false,
        userName: "Daniel",
        useRefreshTokens: false
    };

}]);