import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Cosmos {
    public static void main(String[] args) throws IOException {
        int Pos=0,EndPos = 0,speed=0,sum=0;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите позицию до которой необходимо добраться марсоходу");
            EndPos=Integer.parseInt(reader.readLine());

        Operations operation=new Operations();

    for(;;){
            if (Pos<EndPos) {
                speed=operation.A(speed);
                Pos += speed;
                sum++;
                System.out.println("Произошло увеличение скорости движения марсохода,\n нынешняя позиция:"+Pos);
            }else
                if(Pos==EndPos){
                    System.out.println("Количество выполненных операций= "+sum);
                    System.out.println("Нынешняя позиция марсохода = "+Pos);
                    System.out.println();
                    System.out.println("Программа окончила своё выполнение!");
                break;}
                else {
                    speed=operation.R();
                    Pos+=speed;
                    sum++;
                    System.out.println("Произошло уменьшение скорости движения марсохода,\n нынешняя позиция:"+Pos);
                }
            System.out.println("*");
        }

        System.out.println("Запуск второго модуля программы!");
        int SecondEndPos=EndPos,sum2 = 1;
        if(SecondEndPos%2==0) {
            sum2=0;
            while (SecondEndPos > 0) {
                SecondEndPos = SecondEndPos / 2;
                sum2++;
            }
        }else
        {
            SecondEndPos-=1;
            while (SecondEndPos > 0) {
                SecondEndPos = SecondEndPos / 2;
                sum2++;
            }
        }
        System.out.println("Количество необходимый операций= "+sum2);
    }
}
