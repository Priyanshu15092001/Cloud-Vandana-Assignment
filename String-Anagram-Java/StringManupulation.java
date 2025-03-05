import java.util.*;
class StringManupulation{
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1=kb.nextLine();
        System.out.println("Enter second string: ");
        String s2=kb.nextLine();

        System.out.println(checkAnagram(s1,s2));
        
        
    }

    public static boolean checkAnagram(String s1, String s2)
    {
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0;i<s2.length();i++)
        {
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()!=0) return false; 
        }

        return true;
    }
}