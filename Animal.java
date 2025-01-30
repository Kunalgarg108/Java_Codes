class X {
    int a,b;
    X(int a, int b) {
        this.a = a;
        this.b = b;
    }   

    void print() {
        System.out.println(this.a);
    }
}


class Dog extends X {
    int c;
    Dog(int c) {
        this.c = c;
    }

    @Override
    void print() {
        System.out.println(this.c);
    }
}

public class Animal {
    public static void main(String[] args) {
        X x = new Dog
    }
}
