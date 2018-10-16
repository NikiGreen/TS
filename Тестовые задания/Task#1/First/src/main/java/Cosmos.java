import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

            }else
                if(Pos==EndPos){
                    System.out.println("Количество необходимых операций= "+sum);
                    System.out.println("Нынешняя позиция марсохода = "+Pos);
                    System.out.println();
                    System.out.println("Программа окончила своё выполнение!");
                break;}
                else {
                    speed=operation.R();
                    Pos+=speed;
                    sum++;

                }
            System.out.println("*");
        }


    }
}
