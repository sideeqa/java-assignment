//public class RandomExample {
//    public static void main(String[] args) {
//        double rand = Math.random();
//        System.out.println("Random number: " + rand);
//    }
//}
//
//
//
//
//
//
//
//
//import java.util.Random;
//
//public class RandomExample2 {
//    public static void main(String[] args) {
//        Random random = new Random();
//        int number = random.nextInt(10);
//        System.out.println("Random integer: " + number);
//    }
//}
//
//
//
//



import java.security.secureRandom;

public class RollDie{
    public static void main(string[]args){
        secureRandom randomNumbers= new secureRandom();


        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0; 
        int frequency6 = 0;

for(int roll = 1; roll <= 60_000_000; roll++){
    int face = 1 + randomNumber.nextInt(6);

         switch (Case) { 
            case 1:
                ++frequency1;
            break;

             case 2:
                ++frequency2;
            break;
       
             case 3:
                ++frequency3;
            break;

             case 4:
                ++frequency4;
            break;
             case 5:
                ++frequency5;
            break;

             case 6:
                ++frequency6;
            break;


}

}
        system.out.println("Case\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6");
                
           
}
}


































