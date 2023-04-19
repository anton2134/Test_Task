import java.util.Scanner;

public class Main {

    public static class Povtor{
        int[] arr;
        Povtor(int[] Mas) {
            int i;
            arr = new int[Mas.length];
            for(i=0; i< arr.length; i++) {
                arr[i] = Mas[i];
            }
        }

        public  void povtor() {
            int i, j, dch;
            int [] count = new int [arr.length];
            for(i=0; i<arr.length; i++) {
                dch = arr[i];
                count[i] = 0;
                for(j=1; j<arr.length-1; j++) {
                    if(dch == arr[j]) count[i]++;
                }
                if(count[i] > 1) System.out.print(arr[i] + " ");


            }

           }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, i;
        System.out.println("Введите количество чисел");
        N = scanner.nextInt();
        int[] Mas = new int[N+2];
        for(i = 1; i<N+1; i++) {
            Mas[i] = scanner.nextInt();
        }

        Povtor Dmas = new Povtor(Mas);
        Dmas.povtor();

    }
}