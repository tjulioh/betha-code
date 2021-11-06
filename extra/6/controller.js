var listaController = angular.module('calculadoraControllerApp', []);
 
listaController.controller('CalculadoraControllerCtrl', ['$scope', function($scope) {
    var vm = this;

    vm.calcular = function() {
        var imc = vm.peso / (vm.altura*vm.altura)
        console.log(imc)
        vm.resultado = "Olá " + vm.nome + " voce está com "
        if(imc < 18.5){
            vm.resultado += "Abaixo do peso normal";
        }else if(imc >= 18.5 || vm.imc < 24.9){
            vm.resultado += "Peso normal";
        }else if(imc >= 25.0 || vm.imc < 29.9){
            vm.resultado += "Excesso de peso";
        }else if(imc >= 30.0 || vm.imc < 34.9){
            vm.resultado += "Obesidade classe I";
        }else if(imc >= 35.0 || vm.imc < 39.9){
            vm.resultado += "Obesidade classe II";
        }else if(imc >= 40.0){
            vm.resultado += "Obesidade classe III";
        }
      };
}]);