package basics;

public class FrequencyOfCharacter {
		public static void main(String[] args){
			String str = "babali";
			System.out.println(str);
			// count frequency of char 'a,'
			int count = str.length() - str.replace("a", "").length();
			System.out.println("frequancy  a: "+count);
		}
	}
