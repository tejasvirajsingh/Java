public class remove_specialchar{ 
    public static void main(String[] args) {
    
         String sentence = "Mr max ji hero of the JONhi& because of the $sO 4 .";
    
    
         String cleanedSentence = sentence.replaceAll("[^a-zA-z0-9\\s]", "");
    
         System.out.println("Original Sentence : " + sentence);
         System.out.println("Cleaned Sentence : "+ cleanedSentence.trim());
    
    
    
    }
    }