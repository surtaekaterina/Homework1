import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char pTemp = '1';
		
		do
		{
		System.out.println("input sing");
		pTemp=sc.next().charAt(0);
		}
		while(pTemp!='q');
		System.out.println("Exit");
		}
	}


