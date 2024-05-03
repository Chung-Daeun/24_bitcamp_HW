package middle;



public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String problem = "aaannngggjjjeeeuusi";
		String answer = "";
		
		int len = 0;
		
		for(int i = 0;  i < problem.length(); i++) {
			boolean isDue = false;
			for(int j = 0; j < len; j++) {
				if(problem.charAt(i) == answer.charAt(j)) {
					isDue = true;
					break;
				}
			}
			if(!isDue) {
				answer += problem.charAt(i);
				len++;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
