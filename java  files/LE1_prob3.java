class Main{
    public static void main(String[] args){
        int rows = 4;
        System.out.println("Pattern");
        for(int i = rows; i >0; i--){
            for(int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}