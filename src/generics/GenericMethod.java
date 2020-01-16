package generics;

public class GenericMethod {
    private static <T> boolean isEqual(GenericClass<T> g1,GenericClass<T> g2){
        return g1.getItem().equals(g2.getItem());
    }


    public static void main(String[] args) {
        GenericClass<String>g1 = new GenericClass<>();
        g1.setItem("xi'an");

        GenericClass<String>g2 = new GenericClass<>();
        g2.setItem("xi'an");

        boolean isEqual = GenericMethod.isEqual(g1,g2);
        System.out.println(isEqual);
    }
}
