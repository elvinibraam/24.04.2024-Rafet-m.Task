import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       /* Proqram işə düşdüyü zaman, kompüterin təsadüfi bir rəqəm seçməsini təmin edin
        (məsələn, 1 ilə 100 arasında bir rəqəm).Tesadufi reqem asagidaki kimi tutulurRandom random = new Random();
        int randomNumber = random.nextInt(100) + 1;İstifadəçiyə "Bir rəqəm təxmin edin (1-100 arası):"
        kimi bir mesaj göstərin və istifadəçinin bir rəqəm təxmin etməsini istəyin.
                İstifadəçinin daxil etdiyi təxminə əsasən nəzərə alın:
        Təxmin düzgündürsə, "Təbriklər! Doğru təxmin etdiniz." mesajını göstərin və proqramı bağlayın.
                Təxmin yanlışdırsa, istifadəçiyə "Biraz daha böyük bir rəqəm daxil edin."
        və ya "Biraz daha kiçik bir rəqəm daxil edin." kimi bir ipucu verin və istifadəçinin yeni bir təxmin etməsini istəyin.
                İstifadəçi doğru rəqəmi tapana qədər bu prosesi təkrarlayın.*/


        menu();
    }

    public static void menu() {
        Random random = new Random();
        int secretDigit = random.nextInt(100) + 1;
        int guessDigit = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir rəqəm təxmin edin (1-100 arası):");

        while (guessDigit != secretDigit) {
            guessDigit = letsGuess(scanner);

            if (guessDigit == secretDigit) {
                System.out.println("Təbriklər! Doğru təxmin etdiniz.");
            } else {
                letsAdvice(guessDigit, secretDigit);
            }
        }

    }

    public static int letsGuess(Scanner scanner) {
        return scanner.nextInt();

    }

    public static void letsAdvice(int guess, int secretNum) {
        if (guess < secretNum) {
            System.out.println("Biraz daha böyük bir rəqəm daxil edin.");
        } else {
            System.out.println("Biraz daha kiçik bir rəqəm daxil edin.");
        }
    }
}
