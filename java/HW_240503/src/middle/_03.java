package middle;

public class _03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			boolean isChange = false;
			if((i + 1) % 3 == 0 ) {
				newStr += "3";
				isChange = true;
			}
			if((i + 1) % 5 == 0) {
				newStr += "5";
				isChange = true;
			}
			if(!isChange)
				newStr += str.charAt(i);
			
		}
		
		System.out.println(newStr);
	}

}
