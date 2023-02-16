public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){

        //put your code here
        int i=0, sum=0;
        if (array==null) {
            return 0;
        }
        for (i=0;i<array.length;i++) {
            if (array[i]%2==0) {
                sum+=array[i];
            }
        }
        return sum;
    }
}

