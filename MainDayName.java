package DailyAssignment;
import java.util.Scanner;
public class MainDayName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date(dd mm yy)");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		DateName d1=new DateName(dd,mm,yy);
		System.out.println(d1.getDayName());
	}

}
