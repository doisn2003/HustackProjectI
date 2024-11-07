package hustack;

import java.util.Scanner;

public class Deploy {
    public void convertTextToUpperCase() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputText.append(line).append("\n");
        }

        Method method = new Method();
        String upperCaseText = method.toUpperCase(inputText.toString());

        System.out.println(upperCaseText);
    }

    public void
}
