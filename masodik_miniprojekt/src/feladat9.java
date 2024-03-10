public class feladat9 {
    public static void main(String[] args){
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                if (x == y){
                    System.out.print(x + " ");
                }else
                {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
    }
}
