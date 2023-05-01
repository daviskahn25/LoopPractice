public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();

    }

    public LoopWorld(){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();


    }

    public void pattern1(){
        System.out.println("****************** Pattern 1: ");
        for (int i = 0; i < 26; i = i +5){
            System.out.println(i);
        }
    }

    public void pattern2(){
        System.out.println("****************** Pattern 2: ");
        for (int i = 2; i < 28; i = i +5){
            System.out.println(i);
        }
    }

    public void pattern3(){
        System.out.println("****************** Pattern 3: ");
        for (int i = 21; i > 0; i = i -4){
            System.out.print(i+"   ");
        }
        System.out.println();
    }

    public void pattern4(){
        System.out.println("****************** Pattern 4: ");
        for (int i = 1; i < 7; i = i +1){
            System.out.print(i * i +"  ");
        }
        System.out.println();
    }

    public void pattern5(){
        System.out.println("****************** Pattern 5: ");
        for (int x = 1; x<5;x++) {
            for (int i = 1; i < 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void pattern6(){
        System.out.println("****************** Pattern 6: ");
        for (int i = 1; i<6;i++){
            for (int x = 0; x<i-1;x++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

    public void pattern7(){
        System.out.println("****************** Pattern 7: ");
        for (int i = 1; i<6;i++) {
            for (int x = 0; x < 6-i; x++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void pattern8(){
        System.out.println("****************** Pattern 8: ");
        for (int i = 1; i<6;i++) {
            for (int x = 0; x < i - 1; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < 6 - i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(){
        System.out.println("****************** Pattern 9: ");
        for (int x = 1; x <8;x++){
            System.out.println(" ");
            for (int y = 1; y<x-1; y++){
                System.out.print(y);
            }
        }
    }

    public void pattern10(){

    }










}
