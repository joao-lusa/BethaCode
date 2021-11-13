function Notas(nome, nota1, nota2, nota3){
    this.nome = nome
    this.nota1 = nota1
    this.nota2 = nota2
    this.nota3 = nota3
}
function gravarCadastro(){
    var nomeTela = document.querySelector("#nome").value;
    var notaTela1 = document.querySelector("#nota1").value;
    var notaTela2 = document.querySelector("#nota2").value;
    var notaTela3 = document.querySelector("#nota3").value;

    var novoCadastro = new Notas(nomeTela, notaTela1, notaTela2, notaTela3);

    var media = (parseFloat(novoCadastro.nota1) + parseFloat(novoCadastro.nota2) + parseFloat(novoCadastro.nota3)) / 3
    var status
    if(media < 7){
        status = "reprovado"
    }else{
        status = "aprovado"
    }

    var exibir = "O aluno " + novoCadastro.nome + " foi com média " + media.toFixed(2) + " este aluno está " + status;
    //document.getElementById('exibirCalculo').innerHTML = exibir
    document.querySelector("#exibirCalculo").textContent = exibir

}












