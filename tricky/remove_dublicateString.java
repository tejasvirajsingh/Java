public class remove_dublicateString{
    public static void main(String[] args){
        String input ="Mr max a@nd tejasvi raj singh";
        StringBuilder answer = new StringBuilder("");
        int [] arr = new int [52];
        for (int i= 0; i< input.length(); i++)
        {
            char currentChar = input.charAt(i);
            int index;
            if  (currentChar >= 'a' && currentChar<= 'z') {
                index = currentChar - 'a';
                
            }
            else if (currentChar >= 'A' && currentChar <= 'Z'){
                index = currentChar - 'A' + 26;
                
            } else {
                continue;
            }
            if (arr[index]== 0){
                answer.append(currentChar);
                arr[index]= 1;
            }
        
            }
            System.out.println(answer.toString());
            
      
    }
}