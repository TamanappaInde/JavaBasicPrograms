package StringsExamples;

public class StringExamples {

	public static void main(String[] args) {

		// Replace Special characters from string
		String str = "This !@# <> $%^ Street Account";
		String cleaned = str.replaceAll("[^a-zA-Z]", " ");
		//System.out.println(cleaned);

		// Remove duplicates using loop
		String str1 = "mississippi";
		StringBuilder result = new StringBuilder();
		for (int i=0; i<str1.length();i++) {
			char c = str1.charAt(i);
			if (result.indexOf(String.valueOf(c)) == -1) {
				result.append(c);
			}
		}
		//System.out.println(result);
		
		// Replace spaces with _
		String str2 = "Java Programming Language";
		String result2 = str2.replaceAll("\s+", "_");
		//System.out.println(result2);
		
		// In- Test out-TTeesstt
		String str3 = "Test";
		StringBuilder result3 = new StringBuilder();
		for (char c : str3.toCharArray()) {
			result3.append(c).append(c);
		}
		//System.out.println(result3);
		
		// Remove vowels
		String str4 = "Education";
		String result4 = str4.replaceAll("[AEIOUaeiou]", "");
		//System.out.println(result4);
		
		// Reverse half string
		String str5 = "Computer";
		String firstHalf = str5.substring(0, 4);
		String secondHalf = str5.substring(4, 8);
		String result5 = firstHalf + new StringBuilder(secondHalf).reverse().toString();
		//System.out.println(result5);
		
		// Take last word at first and first at last
		String str6 = "Automation";
	    char firstChar = str6.charAt(0);
	    char lastChar = str6.charAt(str6.length()-1);
	    String middleChar = str6.substring(1, str6.length()-1);
	    String result6 = lastChar + middleChar + firstChar;
	    System.out.println(result6);
	    
	    

	}

}
