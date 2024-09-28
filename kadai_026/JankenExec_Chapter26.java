package kadai_026;

public class JankenExec_Chapter26 {
	
	public static void main(String[] args) {
		
		Jyanken_Chapter26 jyanken =new Jyanken_Chapter26();
		
		String me = jyanken.getMyChoice();
		
		String you = jyanken.getRandom();
		
		jyanken.playGame(me,  you);
	}

}
