console.log("Hello Word!"); 

let matriz = [
    [1,2],
    [3,2],
    [5,6]
];

//Adiconar nova linha
matriz.push(["Ana", "Pedro"])

console.log(matriz);

for(let linha=0; linha<matriz.length;linha++){
    for(let col=0; col<matriz[linha].length; col++){
        console.log(matriz[linha][col])
    }
}

//Alterar existente
matriz[2][0]="Bruno"

//Alterar inexistente = ERROR
//matriz[4][0]="Vinicius"

console.log(matriz)