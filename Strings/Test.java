public class Test {

    public static void main(String[] args){

     // Reverse a string using StringBuilder
     String str1 = "tamanappa";
     String reversed = new StringBuilder(str1).reverse().toString();
     System.out.println(reversed);

     // Reverse a string using for loop
     String str2 = "indetamanappa";
     String reversed2 = "";
     for (int i=str2.length()-1;i>=0;i--){
        reversed2 += str2.charAt(i);
     }
     System.out.println(reversed2);

     // Reverse first char with last char
     String str3 = "TamanappaInde";
     char first = str3.charAt(0);
     char last = str3.charAt(str3.length()-1);
     String middle = str3.substring(1, str3.length()-1);
     String result = last + middle + first;
     System.out.println(result);

    // Reverse a string using array
    String str4 = "tamanappainde";
    char[] arr = str4.toCharArray();
    for (int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
    }

    // Using recursion
    System.out.println(reverse("tamanappa"));

    // Using two pointers
    String str6 = "inde tamanappa";
    char[] arr2 = str6.toCharArray();

    int left = 0;
    int right = arr2.length-1;

    while (left < right){

        char temp = arr2[left];
        arr2[left] = arr2[right];
        arr2[right] = temp;

        left++;
        right--;
    }
    System.out.println(new String(arr2));


    // Reverse a first word from senetence
    String str7 = "tamanappa inde";
    String[] words = str7.split(" ");

    String firstWord = words[0];
    String reversedWord = "";

    for (int i=firstWord.length()-1;i>=0;i--){
        reversedWord += firstWord.charAt(i);
    }
    System.out.println(reversedWord + " " + words[1]);

    }

    // Reverse String using recursion
    public static String reverse(String str5) {
        if (str5.isEmpty()) {
            return str5;
        }
        return reverse(str5.substring(1)) + str5.charAt(0);
    }
    

}