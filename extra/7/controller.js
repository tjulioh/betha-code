var listaController = angular.module('arrayControllerApp', []);
 
listaController.controller('arrayControllerCtrl', ['$scope', function($scope) {
    var vm = this;
    vm.editando = false;
    vm.total = 0;
    vm.index = -1;
    $scope.itens = [];

    vm.adicionar = function() {  
        let item = {
            nome: vm.nome,
            endereco: vm.endereco,
            cpf: vm.cpf,
            presenca: vm.presenca
        }

        if(vm.index === -1){
            $scope.itens.push(item);
            vm.nome = "";
            vm.endereco = "";
            vm.cpf = "";
            vm.presenca = true;
        }else{
            $scope.itens[vm.index] = item;
            vm.nome = "";
            vm.endereco = "";
            vm.cpf = "";
            vm.presenca = true;
        }
        vm.index = -1;
        vm.editando = false;

        vm.totalFalta = 0;
        vm.totalPresenca = 0;
        for(var i = 0; i < $scope.itens.length; i++) {
            if($scope.itens[i].presenca){
                vm.totalPresenca += 1;
            } else {
                vm.totalFalta += 1;
            }
        }
    };

    vm.editar = function(index, item) {  
        vm.nome = item.nome;
        vm.endereco = item.endereco;
        vm.cpf = item.cpf;
        vm.presenca = item.presenca;
        vm.index = index;
        vm.editando = true;
    }

    vm.excluir = function(index){
        $scope.itens.splice(index, 1);
    }

}]);