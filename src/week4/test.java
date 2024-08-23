package week4;

public class test {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        if(a == b) {
            System.out.println("같습니다");
        } else{
            System.out.println("다릅니다");
        }
        a+= "d";
        b+= "d";
        if(a == b) {
            System.out.println("같습니다");
        } else{
            System.out.println("다릅니다");
        }
    }
}
