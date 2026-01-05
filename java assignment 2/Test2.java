import java.util.Scanner;
public class Test2{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    boolean first = true;
    while (first == true){
        String menu = """
    1. Lagos
    2. Imo

    3. Ogun
    4. Osun
    5. Oyo
    6. Back
""";
        System.out.println(menu);
        int menuOption = input.nextInt();
        switch (menuOption){
        case 1 ->
        {System.out.println("Welcome to Lagos!");
        first = false;}

        case 2 ->
        {System.out.println("Welcome to Imo!");
        first = false;}
    case 3 -> {
    boolean second = true;
        while (second == true){
System.out.println("Welcome to Ogun!");
        String Ogun = """
        1. Ifo
        2. Sango

        3. Ewekoro
        4. Back
""";
System.out.println(Ogun);
        int ogunOption =
        input.nextInt();
        switch (ogunOption){
        case 1 ->
        {System.out.println("Welcome to Ifo!");
        System.exit(0);}
        
        case 2 ->
{System.out.println("Welcome to Sango!");
        second =
        false;
        first =
        false;}
        case 3 ->
{System.out.println("Welcome to Ewekoro!");
        second =
        false;
        first =
        false;}
        case 4 -> second =
        false;


}
}
}
    case 4 ->
{System.out.println("Welcome to Osun!");
        first = false;}
        case 5 ->
{System.out.println("Welcome to Oyo!");
        first = false;}
        case 6 -> first = false;

