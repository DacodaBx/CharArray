// Takes a String and breaks it down by character.

public class CharArray {
    public static void main(String[] args){

        String s = "LadySwan";
        char[] swn = s.toCharArray();
        
        for(int i = 0; i < swn.length; i++){
            System.out.println(swn[i]);
        }
        

    }
}
