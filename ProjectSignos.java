import java.util.Scanner;
class Main {
public static void main(String[] args){
var scanner = new Scanner(System.in);
System.out.println("Ingrese mes:");
var mes = scanner.nextInt();
String signo = null;
switch ( mes ) {
  case 1:
  signo = "Capricornio";
  break;
  case 2:
  signo = "Acuario";
  break;
  case 3:
  signo = "Piscis";
  break;
  case 4:
  signo = "Aries";
  break;
  case 5:
  signo = "Tauro";
  break;
  case 6:
  signo = "Geminis";
  break;
  case 7:
  signo = "Cancer";
  break;
  case 8:
  signo = "Leo";
  break;
  case 9:
  signo = "Virgo";
  break;
  case 10:
  signo = "Libra";
  break;
  case 11:
  signo = "Escorpio";
  break;
  case 12:
  signo = "Sagitarop";
  break;
default:
signo = "Mes invalido";  
}
System.out.println("Signo: " + signo + "\nPara el mes de: " + mes);
System.out.println("Adiós");
}
}
