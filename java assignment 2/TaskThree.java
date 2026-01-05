import java.util. Scanner;
public class TaskThree{
 public static void main(String...args){
Scanner obtained = new Scanner (System.in);

int sum=0;



for(int counter=1;counter<=10; counter++){
System.out.printf("Enter score");
int scorenum= obtained.nextInt();


sum+=scorenum;

}

int averagesum=sum/10;
System.out.printf("Total score/n "sum);






System.out.print("average:"+ averagesum);


}
}



