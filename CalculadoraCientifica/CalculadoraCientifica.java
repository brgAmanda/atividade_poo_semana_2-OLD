public class CalculadoraCientifica {

    public Double raiz(Integer a) {
        return Math.sqrt(a);
    }

    public Double raiz(Double a) {
        return Math.sqrt(a);
    }

    public Double raiz(String a) {
        return Math.sqrt(Double.parseDouble(a));
    }

    public Double potencia(Byte a, Byte b){
        return Math.pow(a,b);
    }

    public Double potencia(String a, String b) {
        return Math.pow(Double.parseDouble(a), Double.parseDouble(b));
    }

    public Double potencia(Integer a, Double b) {
        return Math.pow(a,b);
    }

}