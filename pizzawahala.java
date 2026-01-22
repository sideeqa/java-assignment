import java.util Scanner;

public class pizzawahala{

public static void main(string [] args){;


}

}

Scanner input= new scanner(system.in);
System.out.println("Enter number of people");
int number= input.nextline();

        ___________________________________________
        |pizza type|Number of slice |Price per box|
        ____________________________________________
        |Sapa Size |     4        |  2000      |    
        ___________________________________________
        |Small money|     6        |   2400      |
        ____________________________________________
        |Big BOYS   |      8        |  3000      | 
        ____________________________________________
        |odogwu     |      12       | 4200       |
System.out.println("pizza_menu");

iye_eyan_ti_o_fe_je_pizza=("Eniyan melo lo fe je pizza?: ");
iru_pizza_ti_afe=("Iru pizza wo le fe je?: ");
switch: (iru_pizza_ti_afe){

    case "sapa size"->{
        iye_slice_ti_o_wa_ninu_apamo=4;
        iye_ti_box_je=2000;
        }
    case "small money"->{

        iye_slice_ti_o_wa_ninu_apamo=6;
        iye_ti_box_je=2400;
}

    case"big boys"->{
        iye_slice_ti_o_wa_ninu_apamo=8;
        iye_ti_box_je=3000;
}

    case "odogwu"->{
        iye_slice_ti_o_wa_ninu_apamo=12;
        iye_ti_box_je=4200;
}


}

iye_apamo_ti_a_fe_ra = math.ceil(iye_eyan_ti_o_fe_je_pizza / iye_slice_ti_o_wa_ninu_apamo);


iye_ti_o_ku_ninu_slice_ti_a_ra = iye_apamo_ti_a_fe_ra*iye_slice_ti_o_wa_ninu_apamo-iye_eyan_ti_o_fe_je_pizza;


iye_ti_olura_ma_san_fun_oja_ti_o_ra = iye_apamo_ti_a_fe_ra * iye_ti_box_je;

print(f"Iye apamo ti a fe ra je:{iye_apamo_ti_a_fe_ra} ");

print(f"iye_ti_o_ku_ninu_slice_ti_a_ra:{iye_ti_o_ku_ninu_slice_ti_a_ra} ");

print(f"Iye owo oja: {iye_ti_olura_ma_san_fun_oja_ti_o_ra}");
