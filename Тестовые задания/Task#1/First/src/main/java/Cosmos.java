import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Cosmos {
    public static void main(String[] args) throws IOException {
        int Pos = 0, EndPos = 0, speed = 0, sum = 0;
        ArrayList<Integer> answers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите позицию до которой необходимо добраться марсоходу");
        try { EndPos = Integer.parseInt(reader.readLine());
        }catch (NumberFormatException e){
            System.out.println("Вы неверно ввели число!\nПожалуйста ,перезапустите программу и попробуйте снова!");
            System.exit(0);
        }
        //Алгоритм подсчёта для простых и отриацительных финальных позиций
        for (;;) {
            if (Pos < EndPos) {
                speed = A(speed);
                Pos += speed;
                sum++;
            } else if (Pos == EndPos) {
                answers.add(sum);
                System.out.println();
                break;
            } else if(EndPos<0){
                speed = R();
                Pos += speed;
                sum++;
            }
                else{
                if ((Pos - EndPos) < 4) {
                    speed = R();
                    Pos += speed;
                    sum++;
                } else {
                    break; }
            }
        }
        //Алгоритм подсчёта всех вариаций для финальных позиций отличных от нуля
        int minus_position = 0;
        if(EndPos>=0){
        for (int l = 0; l < EndPos; l++) {
            sum = 0;
            Pos = 0;
            speed = 0;
            for (int i = 0; i < EndPos; i++) {

                if (i == minus_position) {
                    speed = R();
                    Pos += speed;
                    sum++;
                }
                if (Pos == EndPos) {
                    answers.add(sum);
                    break;
                } else if ((Pos - EndPos) < 4 && (Pos - EndPos) > 0) {
                    speed = R();
                    Pos += speed;
                    sum++;
                } else if (Pos <= EndPos + 3) {
                    speed = A(speed);
                    Pos += speed;
                    sum++;
                } else {
                    speed = R();
                    Pos += speed;
                    sum++;
                }
            }
            minus_position++;
        }
    }
    //Окончание работы двух алгоритмов
        System.out.println("Минимальное количество операций= "+ answers);
        System.out.println("Минимальное количество операций= "+ Collections.min(answers)); }

    private static int A(int speed){//Метод управляющий скоростью движения вперёд
        if (speed<1){
            speed=1;
        }else{
            speed*=2;
        }
        return speed; }

    private static int R(){//Метод управляющий скоростью движения назад
        return -1; }
    }

