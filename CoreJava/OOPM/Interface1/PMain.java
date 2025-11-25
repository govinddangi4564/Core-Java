package Interface1;

public class PMain {
    public static void main(String[] args) {
        PQ ob = new PQ();
        ob.show();   // from PInter
        ob.hi();     // from QInter
        ob.hello();  // default method from PInter
        ob.wish();   // default method from QInter
    }
}

