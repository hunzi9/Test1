package generics;

public class Triple<T extends Number & Comparable<T>> {
    private T value1;
    private T value2;
    private T value3;

    public Triple(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    private T sum(){
        Number sum = value1.doubleValue() + value2.doubleValue()+value3.doubleValue();
        return (T)sum;
    }

    private T largest(){
        T res = value1;
        if(value2.compareTo(res)>0){
            res = value2;

        }
        if(value3.compareTo(res)>0){
            res = value3;

        }
        return res;
    }

    public static void main(String[] args) {
        Triple<Integer> t = new Triple<>(8,10,3);
        System.out.println("Sum is "+t.sum());
        System.out.println("Largest is "+t.largest());
    }
}
