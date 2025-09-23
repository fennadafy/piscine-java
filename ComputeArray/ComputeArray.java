public class ComputeArray {
    public static int[] computeArray(int[] array) {
        int[] result = new int[array.length];
        for (int i =0 ; i<array.length ; i++){
            if (array[i] %3 ==0){
                // System.out.println("r");
                System.out.println(array[i]);
                result[i] = array[i] *5;
            }
            if (array[i]%3 ==1){
                // System.out.println("t");
                System.out.println(array[i]);

                result[i]= array[i] + 7 ;
            }
            if (array[i]%3 ==2){
                // System.out.println("y");
                System.out.println(array[i]);

                result[i]=array[i];
            }
        }
        return result;
    }
}