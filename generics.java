public class TwoGen<T, V> {
    T obj1;
    V obj2;
    TwoGen(T ob1, V ob2) {
        obj1 = ob1;
        obj2 = ob2;
    }
    void showType() {
        System.out.println("Type of T is "+obj1.getClass().getName());
        System.out.println("Type of V is "+obj2.getClass().getName());
    }
    T getObj1() {
        return obj1;
    }
    V getObj2() {
        return obj2;
    }
}
public class Main {
    public static void main(String args[]) {
        TwoGen<Integer, String>  obj  =new TwoGen<Integer, String>(99, "Java");
        obj.showType();
        int v= obj.getObj1();
        String str = obj.getObj2();
        System.out.println("Integer value : "+v);
        System.out.println("String value : "+str);

    }
}
