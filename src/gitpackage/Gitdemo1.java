package gitpackage;

public class Gitdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nikita", nstr = "";
		char ch;
		for (int i = 0; i <= s.length(); i++) {

			ch = s.charAt(i);
			nstr = ch + nstr;

		}
		System.out.println(nstr);

	}

}
