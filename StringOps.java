public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // String test = "Hello World";
       // String test2 = "One two tHRee world";
       // System.err.println(capVowelsLowRest(test2));
     //   System.err.println(camelCase(test));
        
    }

    public static String capVowelsLowRest (String string) {
        String isSolution = "";

        for (int j = 0; j < string.length(); j++) {
            char currentChar = string.charAt(j);

            if(currentChar=='a' || currentChar=='i' || currentChar=='e' ||
             currentChar=='o' || currentChar=='u'){
                isSolution += (char)(currentChar - 32);
            } else if(currentChar=='A' || currentChar=='I' || currentChar=='E' ||
             currentChar=='O' || currentChar=='U')  {
                isSolution += currentChar;


            } else if (currentChar >= 'A' && currentChar <= 'Z') {
            isSolution +=  (char)(currentChar + 32);  
 
        } else {
            isSolution += currentChar; 

       }

   }
        return isSolution;

 }

    public static String camelCase (String string) {
            String isSolution = "";
            boolean isFirst = false;
    
            for (int i = 0; i < string.length(); i++) {
                char currentChar = string.charAt(i);
    
                // space case (ignore)
                // if (currentChar == ' ') {
                // continue;
                // }
    
                if (i > 0) {
                    // first char at word that isn't the first word (need to be upper case)
                    if (currentChar > ' ' && string.charAt(i - 1) == ' ' && isFirst) {
                        if (currentChar >= 'a' && currentChar <= 'z') {
                            isSolution += (char) (currentChar - 32);
                        } else {
                            isSolution += currentChar;
                        }
                        // continue;
                    }
    
                    if (currentChar > ' ' && string.charAt(i - 1) > ' ' && i > 0) {
                        // any other char (need to be lower case)
                        if (currentChar >= 'A' && currentChar <= 'Z') {
                            isSolution += (char) (currentChar + 32);
                        } else {
                            isSolution += currentChar;
                        }
                    }
                }
    
                // first letter in the string
                if (currentChar > ' ' && !isFirst) {
                    isFirst = true;
                    if (currentChar >= 'A' && currentChar <= 'Z') {
                        isSolution += (char) (currentChar + 32);
                    } else {
                        isSolution += currentChar;
                    }
                    // continue;
                }
            }
    
            return isSolution;
        }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == chr){
                count++;
            }
        }

        int[]isSolution = new int [count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
           if(string.charAt(i) == chr){
            isSolution[index] = i;
            index++;
           }
        }

        return isSolution ;

            
        }


    }
