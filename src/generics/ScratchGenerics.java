package generics;

class GenecicKlass<P>{
    P ob;

    public GenecicKlass(P ob) {
        this.ob = ob;
    }

    public P getOb() {
        return ob;
    }

    void getType(){
        System.out.println("Type is"+ob.getClass().getName());
    }
}

public class ScratchGenerics {
    public static void main(String[] args) {
        GenecicKlass<Double> dOb = new GenecicKlass<>(3.14);
        dOb.getType();
        System.out.println("Value is "+ dOb.getOb());

       GenecicKlass<String>strdOb = new GenecicKlass<>("generics demo");
        strdOb.getType();
        System.out.println("Value is "+ strdOb.getOb());

    }
}
