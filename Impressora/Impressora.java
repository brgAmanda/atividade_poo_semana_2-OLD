public class Impressora {

    public void exibir(Float a) {
        System.out.println(a.toString());
    }

    public void exibir(Float a, Float b) {
        System.out.println(a.toString() + ", " + b.toString());
    }

    public void exibir(Float a, String b) {
        System.out.println(a.toString() + ", " + b);
    }
    

    public void exibir(String a, Float b) {
        System.out.println(a + ", " + b.toString());
    }

    public void exibir(String a, String b, String c) {
        System.out.println(a + ", " + b + ", " + c);
    }

    public void exibir(int a, String b) {
        System.out.println(a + ", " + b);
       
    }

}