
public class q6{
    public static void main(String[] args){
        int k = 0;
        for(int i = 0; i < 10; i++){
            k += i;
            if(i == 3){
                break;
            }
        }
        System.out.println(k);
    }
}
