public class Dem02 {
    public static void main(String[] args) {
                /* 
        , Nested Loops
            Via +

            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
         */


        for (int i = 0; i < 9; i++) {
            int k=Math.abs(5-i);
            if (i>=5) k=k+2;
            for (int j = 0; j < k; j++) {
                
                System.out.print("+ ");  
                
                
            }
            System.out.println(); 
        }

    }
    
}
