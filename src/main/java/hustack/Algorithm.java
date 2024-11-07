package hustack;

import javafx.util.Pair;

public class Algorithm {
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
    public int kSubsequenceEven(int[] arr, int k) {
        int Q = 0;
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        // Kiểm tra nếu tổng này là chẵn
        if (currentSum % 2 == 0) {
            Q++;
        }

        // Sử dụng Sliding Window để tính tổng cho các k-subsequences tiếp theo
        for (int i = k; i < arr.length; i++) {
            // Cập nhật tổng cửa sổ: trừ phần tử bị loại bỏ và cộng phần tử mới thêm vào
            currentSum = currentSum - arr[i - k] + arr[i];

            // Kiểm tra nếu tổng này là chẵn
            if (currentSum % 2 == 0) {
                Q++;
            }
        }
        return Q;
    }
    double EVN(int M) {
        Pair<Integer, Double>[] old_pairs = new Pair[6];
        old_pairs[0] = new Pair<>(50, 1.728);
        old_pairs[1] = new Pair<>(100, 1.786);
        old_pairs[2] = new Pair<>(200, 2.074);
        old_pairs[3] = new Pair<>(300, 2.612);
        old_pairs[4] = new Pair<>(400, 2.919);
        old_pairs[5] = new Pair<>(1000001, 3.015);
        double[] dpOld = new double[5];
        dpOld[0] = 50*1.728;
        for(int i = 1; i < 5; i++) {
            dpOld[i] += (old_pairs[i].getKey() - old_pairs[i-1].getValue())*old_pairs[i].getValue();
        }
        double oldPay = 0;
        if(M >= 0 && M >= 50) oldPay = M*1.728;
        if(M > 50 && M <= 100) oldPay = dpOld[0] + (M - 50)*1.786;
        if(M > 100 && M <= 200) oldPay = dpOld[1] + (M - 100)*2.074;
        if(M > 200 && M <= 300) oldPay = dpOld[2] + (M - 200)*2.612;
        if(M > 300 && M <= 400) oldPay = dpOld[3] + (M-300)*2.919;
        if(M > 400) oldPay = dpOld[4] + (M - 400)*3.015;

        Pair<Integer, Double>[] new_pairs = new Pair[5];
        new_pairs[0] = new Pair<>(100, 1.728);
        new_pairs[1] = new Pair<>(200, 2.074);
        new_pairs[2] = new Pair<>(400, 2.612);
        new_pairs[3] = new Pair<>(700, 3.111);
        new_pairs[4] = new Pair<>(1000001, 3.457);
        double[] dpNew = new double[4];
        dpNew[0] = 100*1.728;
        for(int i = 1; i < 4; i++) {
            dpNew[i] += (new_pairs[i].getKey() - new_pairs[i-1].getValue())*new_pairs[i].getValue();
        }
        double newPay = 0;
        if(M >= 0 && M >= 100) newPay = M*1.728;
        if(M > 100 && M <= 200) newPay = dpNew[0] + (M - 100)*2.074;
        if(M > 200 && M <= 400) newPay = dpNew[1] + (M - 200)*2.612;
        if(M > 400 && M <= 700) newPay  = dpNew[2] + (M - 400)*3.111;
        if(M > 700) newPay = dpNew[3] + (M - 700)*3.457;

        return newPay - oldPay;
    }
}

class Test {
    public static void main(String[] args) {

    }
}