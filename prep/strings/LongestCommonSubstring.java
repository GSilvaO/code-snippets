public class LongestCommonSubstring {
    public static void main(String[] args) {
        String[] words = new String[] { "flower", "flow", "flea" };

        System.out.println(lcs(words));
    }

    public static String lcs(String[] stringList) {
        if(stringList == null) throw new NullPointerException();
        if(stringList.length == 0) return "";

        String baseString = stringList[0];

        for(int wordPosition = 0; wordPosition < stringList[wordPosition].length(); wordPosition++) {
            for(int stringPosition = 1; stringPosition < stringList.length; stringPosition++) {
                if(baseString.charAt(wordPosition) != stringList[stringPosition].charAt(wordPosition))
                    return baseString.substring(0, wordPosition);
            }
        }

        return baseString;
    }
}
