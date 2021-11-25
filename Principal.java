public class Principal {
    public static void main(String[] args) {
        Retângulo retangulo = new Retângulo();
        retangulo.setBase(7);
        retangulo.setAltura(5);
        retangulo.setLado1(12);
        retangulo.setLado2(6);
        System.out.println(retangulo.getPerimetro());
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getNomeFigura());
    }

}
