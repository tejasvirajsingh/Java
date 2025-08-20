public class sumOfFloat {
    public static void main(String args[]){
        float sum;
        int i ;
        sum = 0.0F;
        for(i = 1; i<= 5 ; i++){
            sum = sum + 1/(float)i ;
            System.out.println(" i = " + i);
            System.out.println(" sum = " + sum);

        }
    }
}
