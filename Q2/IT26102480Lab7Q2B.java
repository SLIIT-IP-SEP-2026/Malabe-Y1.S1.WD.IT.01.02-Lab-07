public class  IT26102480Lab7Q2B{
	public static void main(String[]args){
		int rowCount , columcount;
		
		for( rowCount=1 ; rowCount<6 ; rowCount++) {
			System.out.print(rowCount+" - ");
			
			for (columcount=1; columcount<=rowCount ; columcount++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}	