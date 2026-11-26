public class CustomAnnot_impl {

    public static void main(String[] args) {

        CustomAnnot.MyAnnotation a = Student.class
                .getAnnotation(CustomAnnot.MyAnnotation.class);

        System.out.println(a.name());
        System.out.println(a.version());
    }

    @CustomAnnot.MyAnnotation(name = "Rahul", version = 2)
    public class Student {

        void show() {
            System.out.println("Hello Java");
        }
    }
}