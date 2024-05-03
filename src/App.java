import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //DIAVASMA MEGETHOUS TOY PINAKA
        Scanner sc = new Scanner(System.in);
        System.out.println("Dose tin diastasi toy pinaka:");
        int N = sc.nextInt();

        //DIMIOURGIA PINAKA KAI DIAVASMA TON TIMON TOY
        int m[] = new int[N]; 
        for (int i=0; i<N; i++){
            System.out.println("Dose tin timi toy pinaka gia tin thesi " + i);
            m[i] = sc.nextInt();
        }

        //KLISI METHODON
        int max = Methods.findMax(m);
        System.out.println("To megalitero stoixeio toy pinaka vriskete stin thesi:" + max);


        double avg = Methods.findAvg(m);
        System.out.println("O mesos oros ton stoixeion toy pinaka einai:" + avg);

        System.out.println("Ta stoixeia toy pinaka:");        
        Methods.display(m);

        System.out.println("Dose dyo thesis apo ton pinaka ton opoion ta stoixeia theleis na kaneis swap:");
        int k = sc.nextInt();
        int l = sc.nextInt();
        Methods.swap(m, k, l);
        sc.close();
    }
}

