interface Hello {
    void show();
}

class Anonymous_Class {
    public static void main(String[] args) {
        Hello h = new Hello() {
            public void show() {
                System.out.println("Hello");
            }
        };

        h.show();
    }
}