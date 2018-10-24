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

        Operations operation=new Operations();
        for(;;){
            if (Pos<EndPos) {
                speed=operation.A(speed);
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
                    speed=operation.R();
                    Pos+=speed;
                    sum++;}
                else{
                    System.out.println("Для эффективного достижение цели нужен ранний сброс скорости");



          /*          for(int l1 = 0; l1< Factorial.calcFactorial(EndPos)*2; l1++){
                        sum=0;
                        Pos=0;
                        for(int i1 = 0; i1< Factorial.calcFactorial(EndPos)*2; i1++) {
                            if (i1 == minus_position) {
                                speed = operation.R();
                                Pos += speed;
                                sum++;

                            }
*/
//Работает неверно
                            /*for (int l = 0; l < Factorial.calcFactorial(EndPos); l++) {
                                sum = 0;
                                Pos = 0;
                                int g=0;
                                for (int i = 0; i < EndPos; i++) {

                                    if (i == minus_position && g==0) {
                                        speed = operation.R();
                                        Pos += speed;
                                        sum++;
                                        g=1;

                                    }
                                    if (Pos == EndPos) {
                                        answers.add(sum);
                                        break;
                                    } else if((Pos-EndPos)<4 && (Pos-EndPos)>0 ){
                                        speed=operation.R();
                                        Pos+=speed;
                                        sum++;
                                    }

                                    else if (Pos <= EndPos + 3) {
                                        speed = operation.A(speed);
                                        Pos += speed;
                                        sum++;

                                    } else break;
                                    *//*{
                                        speed = operation.R();
                                        Pos += speed;
                                        sum++;

                                    }*//*
                                    System.out.println("Позиция= "+Pos);
                                }
                                minus_position++;
                            }
                       *//* }}*//*




                                System.out.println("Минимальное количество операций= "+*//*minIndex*//* answers);
                    System.out.println(*//*Collections.min(answers)*//*sum);*/
                    break;
                    }
                }

            }
            System.out.println("*");

        for (int l = 0; l < EndPos; l++) {
            System.out.println("Старт___________");
            sum = 0;
            Pos = 0;
            speed=0;
            /*int g=0;*/
            for (int i = 0; i < Factorial.calcFactorial(EndPos); i++) {
                System.out.println("Входная Позиция= "+Pos);

                if (i == minus_position /*&& g==0*/) {
                    speed = operation.R();
                    Pos += speed;
                    sum++;
                   /* g=1;*/
                    System.out.println("Отнимаем позицию");
                }
                if (Pos == EndPos) {
                    answers.add(sum);
                    break;
                } else if((Pos-EndPos)<4 && (Pos-EndPos)>0 ){
                    speed=operation.R();
                    Pos+=speed;
                    sum++;
                    System.out.println("Уходим назад если можем");
                }

                else if (Pos <= EndPos + 3) {
                    speed = operation.A(speed);
                    Pos += speed;
                    sum++;
                    System.out.println("Идём вперёд");

                } else {
                    System.out.println("Вылет ебанный");
                    break;}
                                    /*{
                                        speed = operation.R();
                                        Pos += speed;
                                        sum++;

                                    }*/
                System.out.println("Позиция= "+Pos);
            }
            System.out.println("операции= "+sum);
            System.out.println("Конец внутреннего цикла");
            minus_position++;
        }
        /* }}*/




        System.out.println("Минимальное количество операций= "+/*minIndex*/ answers);
        System.out.println(Collections.min(answers));

        }

    }

