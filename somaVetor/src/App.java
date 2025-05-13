public class App {
    public static void main(String[] args) throws Exception {
        
        int []vetor = {10,20,30,40,50,60,70,80,90,100};
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){

            soma += vetor[i];

        }

        System.out.println("A soma dos elementos eh " + soma);

    }
}
