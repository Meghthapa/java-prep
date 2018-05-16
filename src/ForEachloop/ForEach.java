package ForEachloop;

/**
 * Created by meght on 3/24/2018.
 */
public class ForEach {
    public static void main(String[] args) {
        StringBuilder[] s = {new StringBuilder("Samyra "),
        new StringBuilder("Thapa ")};

        for(int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }
        for (StringBuilder samy:s){
            System.out.println(samy);

        }
        for(StringBuilder samy:s){
            samy.append("tomorrow samyra rice feeding");
            System.out.println(samy);
        }
    }
}
