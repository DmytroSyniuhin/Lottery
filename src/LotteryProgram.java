import java.util.Arrays;
public class LotteryProgram {
    public static void main(String[] args) {
        int[] arrayOrganizer = new int[7];

        for (int i = 0; i < arrayOrganizer.length; i++) {
            arrayOrganizer[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arrayOrganizer);

        System.out.println("Відсортований масив чисел загаданих організатором лотореї: " + Arrays.toString(arrayOrganizer));

        int[] arrayPlayer = new int[7];
        for (int j = 0; j < arrayOrganizer.length; j++) {
            arrayPlayer[j] = (int) (Math.random() * 10);
        }
        Arrays.sort(arrayPlayer);

        System.out.println();

        System.out.println("Відсортований масив чисел вгаданих гравцем: " + Arrays.toString(arrayPlayer));

        int count = 0;
        for (int k = 0; k < arrayOrganizer.length; k++) {
            if (arrayPlayer[k] == arrayOrganizer[k]) {
                count++;
            }
        }
        System.out.println();

        System.out.println("Кількість збігів: " + count);
    }
}
