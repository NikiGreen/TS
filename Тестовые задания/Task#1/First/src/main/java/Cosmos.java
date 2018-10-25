import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;

public class Cosmos {
    public static void main(String[] args) throws IOException {
        //Всё работает
        int Pos=0,EndPos = 0,speed=0,sum=0,minus_position=0;
        ArrayList<Integer> answers=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите позицию до которой необходимо добраться марсоходу");
            EndPos=Integer.parseInt(reader.readLine());

        for(;;){
            if (Pos<EndPos) {
                speed=A(speed);
                Pos += speed;
                sum++;
            }else
                if(Pos==EndPos){
                    System.out.println("Количество необходимых операций= "+sum);
                    System.out.println("Нынешняя позиция марсохода = "+Pos);
                    answers.add(sum);
                    System.out.println();
                    System.out.println("Программа окончила своё выполнение!");
                break;}
                else {
                if((Pos-EndPos)<4){
                    speed=R();
                    Pos+=speed;
                    sum++;}
                else{
                    System.out.println("Для эффективного достижение цели нужен ранний сброс скорости");
                    break;
                    }
                }

            }
            System.out.println("*");

    for (int l = 0; l < EndPos; l++) {
        System.out.println("Старт___________");
        sum = 0;
        Pos = 0;
        speed = 0;
        /*          int g=0;*/
        for (int i = 0; i < EndPos; i++) {
            System.out.println("Входная Позиция= " + Pos);

            if (i == minus_position /*&& g==1*/) {
                speed = R();
                Pos += speed;
                sum++;

                System.out.println("Отнимаем позицию");
            }
            /*g=1;*/
            if (Pos == EndPos) {
                answers.add(sum);
                break;
            } else if ((Pos - EndPos) < 4 && (Pos - EndPos) > 0) {
                speed = R();
                Pos += speed;
                sum++;
                System.out.println("Уходим назад если можем");
            } else if (Pos <= EndPos + 3) {
                speed = A(speed);
                Pos += speed;
                sum++;
                System.out.println("Идём вперёд");

            } else {
                /* break;}*/
                /*{*/
                speed = R();
                Pos += speed;
                sum++;
                System.out.println("Отнимаем позицию так число слишком сильно вышло за передлы");
            }
            System.out.println("Позиция= " + Pos);
        }
        System.out.println("операции= " + sum);
        System.out.println("Конец внутреннего цикла");
        if (sum > 1000) {
            System.out.println("Количество операций превышает 1000,дальнейший подсчёт не эффективен");
            break;
        }
        minus_position++;
    }

        System.out.println("Минимальное количество операций= "+ answers);
        System.out.println("Минимальное количество операций= "+Collections.min(answers));

        }

    private static int A(int speed){
        if (speed<1){
            speed=1;
        }else{
            speed*=2;
        }
        return speed;
    }

    private static int R(){
        return -1;
    }
    }

