
public class Chapter1_9_v1 {
	static boolean isSubstring(String str1, String str2) {
		int result = str1.indexOf(str2);
		int result2 = str2.indexOf(str1);
		if(result != -1) return true;
		else if(result2 != -1) return true;
		else return false;
	}
	static boolean isRotatestring(String s1, String s2) {
		String str = s1 + s1;
		if(s1.length() == s2.length()) {
			if(isSubstring(str, s2)) return true;
			else return false;
		}
		else return false;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		if(isRotatestring(str1, str2)) System.out.println("循環してる");
	}
}
