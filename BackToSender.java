import java.util.Scanner;
    public class BackToSender{
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

           
    double payment = 0;
    int success = 0;
    

String riderMenu = """

        _________________________________________________
        | collection rates |Amount per persels| Base pay|
        |__________________|__________________|_________|
        |less than 50%     |               160|    5000 |
        |                  |                  |         | 
        |__________________|__________________|_________|
        |50-59%            |               200|     5000|
        |__________________|__________________|_________|
        |60-69%            |               250|     5000|
        |_________________ |__________________|_________|
        | 70%              |               500|     5000|
        |__________________|__________________|_________|

""";
    System.out.print(riderMenu);
boolean continueMainLoop = true;
while (continueMainLoop) {
}

System.out.print("Enter the number of delivery: " );
 success = input.nextInt();

    if (success < 0){
    System.out.println("Theres no payment for you oga");
    

   } else if (success < 50){
    payment =(success * 160) + 5000;
    System.out.println("The amount of the day is:" + payment);



   } else if
     (success >= 50 && success <= 59){
    payment = (success * 200 )+ 5000;
    System.out.println("The amount of the day is: " + payment);



    }else if
     (success >= 60 && success <= 69){
    payment = (success * 250)+ 5000;
    System.out.println("The amount of the day is: " + payment);

   } else if

     (success >= 70){
    payment = (success * 500)+ 5000;
    System.out.println("The amount of the day is: " + payment);
}

    





    
    while (continueMainLoop){
        System.out.println("would you like to ask more question (yes/no):");
        String continueLoop = input.next().toLowerCase();
        if (continueLoop.equals("yes") != true){
            continueMainLoop = false;

        }else{
            continueMainLoop = true;
            break;
    }
            

}

    
  } } 

