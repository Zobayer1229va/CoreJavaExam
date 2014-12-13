package month.design;

public class Use_Enum {
	Month month; 
		 
		Use_Enum(Month month){ 
	 		this.month = month ; 
			 
		} 
	 	 
	 	public void Which_Month_It_Is(){ 
	 		 
	 		 
	 		switch(month){ 
	 		 case January:
	 			System.out.println("Month Beginnings");
	 			break;
	 			
	 		    case February:
	 				System.out.println("Romans celebrated the festival of forgiveness");
	 				break;
	 		    case March:
	 				System.out.println("  Mars, the Roman god of war");
	 				break;
	 		    case April:
	 				System.out.println("Roman month Aprilis, perhaps derived from aperire");
	 				break;
	 		    case May:
	 				System.out.println("Maia, Roman goddess, mother of Mercury by Jupiter and daughter of Atlas");
	 				break;
	 		    case June:
	 				System.out.println(" Juno, chief Roman goddess");
	 				break;
	 		    case July:
	 				System.out.println("Renamed for Julius Caesar in 44 BC");
	 				break;
	 		    case August:
	 				System.out.println(" Formerly Sextilis");
	 				break;
	 		    case September:
	 				System.out.println(" chief Roman goddess");
	 				break;
	 		    case October:
	 				System.out.println("Eighth month");
	 				break;
	 		    case November:
	 				System.out.println("Ninth Roman month ");
	 				break;
	 		    case December:
	 				System.out.println("Last month of Years");
	 				break;
	 		   default: 
	 			   	System.out.println("Incorreect Input "); 
	 			   	break; 

	 		}


}
}