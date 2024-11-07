package hustack;

import java.util.Scanner;

public class Deploy {
    Scanner scanner = new Scanner(System.in);
    Algorithm method = new Algorithm();
    public void convertTextToUpperCase() {

        StringBuilder inputText = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputText.append(line).append("\n");
        }

        String upperCaseText = method.toUpperCase(inputText.toString());

        System.out.println(upperCaseText);
        scanner.close();
    }
    public void SolveDegree_2() {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("NO SOLUTION");
        } else if (delta == 0) {
            // Nghiệm kép
            double x0 = -b / (2 * a);
            System.out.printf("%.2f%n", x0);
        } else {
            // Hai nghiệm phân biệt
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            // Đảm bảo x1 < x2
            if (x1 > x2) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }
            System.out.printf("%.2f %.2f%n", x1, x2);
            scanner.close();
        }
    }
    public void kSubsequenceEven() {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println(method.kSubsequenceEven(arr, k));
        scanner.close();
    }

    public void YearMonthDate() {
        String s = scanner.nextLine();
        if (s.matches("\\d{4}-\\d{2}-\\d{2}")) {
            // Tách chuỗi thành các phần tử
            String[] parts = s.split("-");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);

            // Kiểm tra tính hợp lệ của tháng và ngày
            if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
                // In kết quả theo yêu cầu
                System.out.printf("%d %d %d%n", year, month, day);
            } else {
                System.out.println("INCORRECT");
            }
        } else {
            System.out.println("INCORRECT");
        }

        scanner.close();
    }
    public void ListAllNumber1toN() {
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(i + " " +  i*i);
        }
        scanner.close();
    }

    public void CountOddEven() {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int odd = 0, even = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] %2 == 0) ++even;
            else ++odd;
        }
        System.out.println(odd + " " + even);
        scanner.close();
    }
    public void ConvertTimeToSeconds() {
        // Đọc chuỗi đầu vào
        String s = scanner.nextLine();

        // Kiểm tra định dạng bằng regex
        if (s.matches("\\d{2}:\\d{2}:\\d{2}")) {
            // Tách chuỗi thành các phần tử
            String[] parts = s.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);

            // Kiểm tra tính hợp lệ của giờ, phút và giây
            if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
                // Tính số giây từ thời điểm này
                int totalSeconds = hours * 3600 + minutes * 60 + seconds;
                System.out.println(totalSeconds);
            } else {
                System.out.println("INCORRECT");
            }
        } else {
            System.out.println("INCORRECT");
        }

        scanner.close();
    }
    public void EVN() {
        int M = scanner.nextInt();
        System.out.println(method.EVN(M));
        scanner.close();
    }
    public void CountWords() {
        StringBuilder text = new StringBuilder();

        // Đọc từng dòng cho đến khi gặp dòng trống
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;  // Kết thúc khi gặp dòng trống
            }
            text.append(line).append(" ");
        }

        // Tách các từ dựa trên khoảng trắng
        String[] words = text.toString().trim().split("\\s+");

        // Đếm số từ (0 nếu chuỗi rỗng)
        int wordCount = text.toString().trim().isEmpty() ? 0 : words.length;

        // In kết quả
        System.out.println(wordCount);

        scanner.close();
    }
    public void TextReplacement() {
        // Đọc xâu P1, P2 và T từ đầu vào
        String P1 = scanner.nextLine();
        String P2 = scanner.nextLine();

        String T = scanner.nextLine();

        // Thực hiện thay thế P1 bằng P2 trong văn bản T
        String result = T.toString().replace(P1, P2);

        // In kết quả
        System.out.print(result);

        scanner.close();
    }
}
