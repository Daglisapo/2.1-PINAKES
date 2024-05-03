public class Methods {
    public static int findMax (int[] m){
        int max = m[0];
        int pos = 0;
        for (int i=1; i<m.length;i++){
            if (max<m[i]){
                max = m[i];
                pos = i; 
            }
        }
        return pos;
    }
    public static double findAvg(int m[]){
        int avg =0;
        for (int i=0; i<m.length;i++){
            avg = avg + m[i];
        }
        avg = avg/m.length;
        return avg;
    }
    public static void display (int m[]){
        for (int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }
    }
    public static void swap(int m[], int i, int j){
        int temp; 
        temp = m[i];
        m[i]=m[j];
        m[j]=temp;
    }
}
