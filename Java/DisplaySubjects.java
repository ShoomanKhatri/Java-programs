import java.util.Scanner;
import java.util.Arrays;

public class DisplaySubjects {
    public static void main(String[] args) {
        String[] subjects = new String[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the subjects you study in BCA 3rd semester:");
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = scan.nextLine();
        }

        Arrays.sort(subjects);

        System.out.println("Subjects in ascending order:");
        for (String subject : subjects) {
            System.out.println(subject);
        }

        scan.close();
    }
}