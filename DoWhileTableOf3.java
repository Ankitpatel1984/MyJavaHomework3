package myjavahomework3;

public class DoWhileTableOf3 {
    public static void main(String[] args) {
        int i = 3;
        int j = 1;
        do {
            System.out.println(i + "*" + j + "=" + (i*j));
            j++;
        }
        while (j<=10);

    }
}
