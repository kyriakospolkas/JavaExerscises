public class ageSchool{
  public static void main(String[] args){
//askisi 1
	int age = Integer.parseInt(args[0]);
	int age1 = Integer.parseInt(args[1]);	
	if (age >= 5 && age <12){
	   System.out.println("eisai sto dimotiko");
	}else if (age >= 12 && age <15){
	         System.out.println("eisai sto gimnasio"); 
	}else if (age >= 15 && age <18){
		 System.out.println("eisai sto likeio");
		}
//askisi 8(den trexei)
	String message;
	message = (age1>18)?"adult":"child";
}
}