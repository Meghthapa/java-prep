package Methods;

/**
 * Created by meght on 4/1/2018.
 */
public class PassingData {
    public static void main(String[] args) {
        int number =4;
        System.out.println("number="+number);
        newNumber(number);
        System.out.println("number="+number);

        String name ="Megh";
        System.out.println("name="+name);
        newName(name);
        System.out.println("name="+name);

        StringBuilder sb = new StringBuilder();
        build(sb);
        System.out.println(sb);
    }
    public static void newNumber(int number){
        System.out.println("in number new number="+number);
        number =10;
        System.out.println("in after newNumber="+number);
    }
    public static void newName(String name){
        System.out.println("in new name="+ name);
        name = "Thapa";
        System.out.println("in after new name= "+ name);
    }
    public static void build(StringBuilder s){
        s.append("Thapa1");
    }
}
