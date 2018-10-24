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
                if((Pos-EndPos)<3){
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

                            for (int l = 0; l < Factorial.calcFactorial(EndPos) * 2; l++) {
                                sum = 0;
                                Pos = 0;
                                for (int i = 0; i < Factorial.calcFactorial(EndPos) * 2; i++) {
                                    if (i == minus_position) {
                                        speed = operation.R();
                                        Pos += speed;
                                        sum++;

                                    }
                                    if (Pos == EndPos) {
                                        answers.add(sum);
                                        break;
                                    } else if((Pos-EndPos)<3 && (Pos-EndPos)>0 ){
                                        speed=operation.R();
                                        Pos+=speed;
                                        sum++;
                                    }

                                    else if (Pos < EndPos + 2) {
                                        speed = operation.A(speed);
                                        Pos += speed;
                                        sum++;

                                    } else
                                        break;
                                }
                                minus_position++;
                            }
                       /* }}*/




                                System.out.println("Минимальное количество операций= "+/*minIndex*/ answers);
                    System.out.println(Collections.min(answers));
                    break;
                    }
                }

            }
            System.out.println("*");

        }

    }

