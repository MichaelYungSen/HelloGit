
package hellogit;

import java.util.Scanner;

public class HelloGit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name");
        String name = input.nextLine();
        System.out.println("Hello" + name);
    }
    
}
