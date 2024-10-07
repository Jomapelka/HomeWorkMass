import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] heights = new int[12];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(28) + 163;
            System.out.println(heights[i]);
        }
    }
}
