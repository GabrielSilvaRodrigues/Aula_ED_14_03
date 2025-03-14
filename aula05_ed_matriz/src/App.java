public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[3][2];
        
        //Acesso direto: linha e coluna
        //Hard code ou código engessado
        matriz[0][0]=1;
        matriz[0][1]=2;

        matriz[1][0]=3;
        matriz[1][1]=4;

        matriz[2][0]=5;
        matriz[2][1]=6;

        //Tipagem incorreta
        //matriz[2][1]="7";
        
        // Estourando a matriz: informar uma linha ou coluna inexistente
        //matriz[2][2]=7;
        
        //Percorrendo uma matriz
        //connsultar elementos
        //Incerir elementos
        for(int linha=0; linha<matriz.length;linha++){
            for(int col=0; col<matriz[linha].length; col++){
                System.out.print(matriz[linha][col]+" ");
            }
            System.out.println("");
        }
    }
}
