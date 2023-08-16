package 선형.큐;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("추가1");
        queue.add("추가2");
        queue.add("추가3");


        String[] arr = new String[queue.size()];

        System.out.println(queue.size());
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.remove();
        }

        System.out.println(Arrays.toString(arr));
    }
}