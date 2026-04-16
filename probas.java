import java.util.Arrays;
import java.util.List;
public class probas {
    private static final double PI = 3.14;
    public static void main(String[] args){
        System.out.println("Bos días");
        List<String> colorins = Arrays.asList("vermello","laranxa","verde");
        System.out.println(colorins.get(2));

        String[] libros={"Don Quijote", "Crimen e Castigo"};
        for (int i = 0; i<libros.length;i++){
            System.out.println(libros[i]);
        }
    }



    public double getArea(double r){
        return PI * r * r;
    }


    public void method(){
        int altura = 1;
        int base = 2;
        area = base * altura;

    }
    
}