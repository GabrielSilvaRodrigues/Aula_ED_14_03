class Aluno{
    constructor(nome, ra, curso){
        this.nome=nome;
        this.ra=ra;
        this.curso=curso;
    }
    Imprimir(){
        console.log("Nome: "+this.nome)
        console.log("RA: "+this.ra)
        console.log("Curso: "+this.curso)
    }
}

let alunos = [
    new Aluno("Kaue", 12345, "ADS"),
    new Aluno("João", 12345, "ADS"),
    new Aluno("Ana", 12345, "ADS"),
]

console.log(alunos)
alunos.forEach(alunos=>alunos.Imprimir())