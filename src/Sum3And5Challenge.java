public class Sum3And5Challenge {
    public static void main(String[] args){

        int counter = 0;
        int mySum = 0;
        for (int i=1; i<=1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Incluindo o número " + i);
                mySum += i;
                counter += 1;
            }
            if (counter == 5){
                System.out.println("A soma dos números é " + mySum);
                break;
            }
        }
    }
}
