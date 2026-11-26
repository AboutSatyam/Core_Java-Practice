class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class BOOM_AnyType_Data {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Java");
        Box<Double> b3 = new Box<>(99.5);

        System.out.println(b1.getData());
        System.out.println(b2.getData());
        System.out.println(b3.getData());

        b1.setData(200);
        System.out.println(b1.getData());
    }
}