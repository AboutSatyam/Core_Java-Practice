public class Inheritance {

   final void show() {
        System.out.println("Parent Method Called ");
    }
}

class ChildInheri extends Inheritance {

    static void main(String[] args) {
        ChildInheri in = new ChildInheri();
        in.show();
    }


}
