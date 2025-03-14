console.log("Hello Word!"); 

let matriz = [
    [1,2],
    [3,2],
    [5,6]
];
console.log(matriz);

for(let linha=0; linha<matriz.length;linha++){
    for(let col=0; col<matriz[linha].length; col++){
        console.log(matriz[linha][col])
    }
}