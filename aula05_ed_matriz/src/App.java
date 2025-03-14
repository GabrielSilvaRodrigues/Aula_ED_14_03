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
        // for(int linha=0; linha<matriz.length;linha++){
        //     for(int col=0; col<matriz[linha].length; col++){
        //         System.out.print(matriz[linha][col]+" ");
        //     }
        //     System.out.println("");
        // }
        int[] idade = new int[2];
        Aluno[] alunos = new Aluno[3];
        Aluno a = new Aluno("Kaué", "Ads", 12345);
        Aluno a1 = new Aluno("João", "Ads", 12346);
        Aluno a2 = new Aluno("Ana", "Ads", 12347);

        alunos[0] = a;
        alunos[1] = a1;
        alunos[2] = a2;

        alunos[0] = new Aluno("Kaué", "Ads", 12345);
        alunos[1] = new Aluno("João", "Ads", 12346);
        alunos[2] = new Aluno("Ana", "Ads", 12347);

        //percorrer valores
        for(int i=0; i<alunos.length;i++){
            System.out.println(alunos[i].getNome());
            System.out.println(alunos[i].getRa());
        }
        // for(int linha=0; linha<matriz.length;linha++){
        //     for(int col=0; col<matriz[linha].length; col++){
        //         System.out.print(matriz[linha][col]+" ");
        //     }
        //     System.out.println("");
        // }
    }
}
