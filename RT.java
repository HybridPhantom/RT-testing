import java.util.HashMap;

public class RT{
    public int hashCode1(String hello){
        int hash = 0;
        int num = 0;
        int index = 1;

        for (int i =0; i < hello.length(); i++){
            hash = (hash * 31) + hello.charAt(i);
            while (hash != num){
                num = hello.charAt(i) + index;
                index ++;
                if(hash == num){
                    return num;
                }
            }
            // hash += hello.charAt(i);
        }
        return hash;
    }

    public static void main(String[] args){
        RT test = new RT();
        int result = test.hashCode1(">]");
        System.out.println(result);
    }
}