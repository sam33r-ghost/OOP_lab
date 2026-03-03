interface Function {
    int evaluate(int x);
}

class Half implements Function {

    @Override
    public int evaluate(int x) {
        return x / 2;
    }
}

class Client {

    public static int[] processArray(int[] arr) {

        Function f = new Half();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = f.evaluate(arr[i]);
        }

        return result;
    }
}

public class Array {
    public static void main(String[] args) {

        int[] data = {10, 25, 40, 7};

        int[] output = Client.processArray(data);

        for (int val : output) {
            System.out.print(val + " ");
        }
    }
}