import java.io.*;

import java.util.*;

public class lab6 {

    static int[] vowel(String temp) {
        int count_a = 0;
        int count_e = 0;
        int count_i = 0;
        int count_o = 0;
        int count_u = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == 'a') {
                count_a += 1;
            } else if (temp.charAt(i) == 'e') {

                count_e += 1;
            } else if (temp.charAt(i) == 'i') {
                count_i += 1;
            } else if (temp.charAt(i) == 'o') {
                count_o += 1;
            }

            else if (temp.charAt(i) == 'u') {
                count_u += 1;
            }
        }
        System.out.println("a:" + count_a);
     System.out.println("e:" + count_e);
        System.out.println("i:" + count_i);
        System.out.println("o:" + count_o);
        System.out.println("u:" + count_u);
        int[] a={count_a,count_e,count_i,count_o,count_u};
        return a;
    }
    static int[] num(String temp){
        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;
        int count_5 = 0;
        int count_6 = 0;
        int count_7 = 0;
        int count_8 = 0;
        int count_9 = 0;
        int count_0=0;

        for (int i = 0; i < temp.length(); i++) {
           switch(temp.charAt(i)){
            case '1':
                 count_1+=1;
                 break;
            case '2':
                count_2+=1;
                 break;
            case '3':
                 count_3+=1;
                  break;
            case '4':
                count_4+=1;
                   break;
            case '5':
                count_5+=1;
                 break;
            case '6':
                 count_6+=1;
                  break;
            case '7':
                  count_7+=1;
                   break;
             case '8':
                    count_8+=1;
                    break;
            case '9':
                    count_9+=1;
                     break;
            case '0':
                count_0+=1;
                 break;
           } 
            }

        
           
            System.out.println("1:" + count_1);
          System.out.println("2:" + count_2);
           System.out.println("3:" + count_3);
        System.out.println("4:" + count_4);
        System.out.println("5:" + count_5);
        System.out.println("6:" + count_6);
        System.out.println("7:" + count_7);
        System.out.println("8:" + count_8);
        System.out.println("9:" + count_9);
        System.out.println("0:" + count_0);
        int[] a={count_1,count_2,count_3,count_4,count_5,count_6,count_7,count_8,count_9,count_0};
        return a;

        }


        static void  word(String temp){
            String[] words = temp.split("\\s+");
            Set<String> uniqueElements = new HashSet<>(Arrays.asList(words));
            String[] unique = uniqueElements.toArray(new String[uniqueElements.size()]);
            int[] wordCounts = new int[unique.length];
            for(int i=0;i<unique.length;i++){
                int count_w=0;
                for(int j=0;j<words.length;j++){
                    if(unique[i]==words[j]){
                        count_w=count_w+1;
                    }
                }wordCounts[i] = count_w;
            }
            System.out.println("Word counts:");
         for (int i = 0; i < unique.length; i++) {
    System.out.println(unique[i] + ": " + wordCounts[i]);
         }
         
        }

        
    static void alphabet(String temp){
            char[] unique = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            char[] alpha=new char[temp.length()];
            for(int k=0;k<temp.length();k++){
                alpha[k]=temp.charAt(k);
            }
            int[] wordCounts=new int[unique.length];
            for(int i=0;i<unique.length;i++){
                int count_w=0;
                for(int j=0;j<alpha.length;j++){
                    if(unique[i]==alpha[j]){
                        count_w=count_w+1;
                    }
                }wordCounts[i] = count_w;
            }
            System.out.println("Word counts:");
         for (int i = 0; i < unique.length; i++) {
    System.out.println(unique[i] + ": " + wordCounts[i]);
         }
         
        }

    

    public static void main(String[] args) {
        
        String temp = "";
        try {
            File file = new File("C:/Users/malav/Downloads/text.txt");
            Scanner read = new Scanner(file);

           
            while (read.hasNextLine()) {
                temp += read.nextLine().toLowerCase();
                
            }
            temp=temp.replaceAll("\\.", "");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(temp);
        System.out.println("Vowels");
        vowel(temp);
       System.out.println("Numbers");
        num(temp);
        word(temp);
        alphabet(temp);
    }

}