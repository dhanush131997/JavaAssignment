package DailyAssignment;

public class TestPatym {

	public static void main(String[] args) {
		IRCTC i=new IRCTC();
		Paytm p1=new Paytm(i);
		p1.BooktrainTicket("dubai","nepal");
	}

}
