public class ReverseString_ChangeLocationSpace {
    
    public static void main(String[] args) {
        String str = "Tamanappa Inde Sastur";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
