package questao30;

public class p30 {

    public static void main(String[] args) {
        int y = 12;
        int z = -4;
        int w = 0;
        int x;
        
        for(x=0;x<9;x=x+3){
            while(w<3){
                y=z+w++;
            }
            if(x%2==0)
                y=z+x;
            else
                y++;
            z++;
            System.out.println("x:"+ x+" y:" + y + " z:" + z);
        }
            
    }
    
}
