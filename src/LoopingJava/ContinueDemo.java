package LoopingJava;

public class ContinueDemo {
    public static void main(String[] args) {
    for(int i=0; i<=20; i++){
        if(i==10){
            continue;
        }
        System.out.println(i);
    }
}
}
/* Quiz: 1 what is the output?
public class ContinueDemo {
    public static void main(String[] args) {
    for(int i=0; i<=10;i=i+3){
        if(i==10){
            continue;
        }
        System.out.println(i);
    }
}
}
//output 0,3,6,9
*/
