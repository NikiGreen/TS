public class Operations {
    int A(int speed){
        if (speed==0 || speed<0){
            speed=1;
        }else{
            speed*=2;
        }
        return speed;
    }

    int R(){

        return -1;
    }
}
