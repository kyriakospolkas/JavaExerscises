public class Season{

   public static void main(String[] args){
//askisi 3	
	int month = Integer.parseInt(args[0]);
	if (month >=3 && month <=5){
	System.out.println("It s spring");
	}else if (month >=6 && month <=8){
	System.out.println("It s summer");
	}else if (month >=9 && month <=11){
	System.out.println("It s autumn");
	}else if ((month >=1 && month <=2) || month == 12){
	System.out.println("It s winter");
	}
//askisi 4
	switch(month){
	case 1:
	System.out.println("It has 31");
	break;
	case 2:
	System.out.println("It has 28");
	break;
	case 3:
	System.out.println("It has 31");
	break;
	case 4:
	System.out.println("It has 30");
	break;
	case 5:
	System.out.println("It has 31");
	break;
	case 6:
	System.out.println("It has 30");
	break;
	case 7:
	System.out.println("It has 31");
	break;
	case 8:
	System.out.println("It has 31");
	break;
	case 9:
	System.out.println("It has 30");
	break;
	case 10:
	System.out.println("It has 31");
	break;
	case 11:
	System.out.println("It has 30");
	break;
	case 12:
	System.out.println("It has 31");
	break;
}






}
}