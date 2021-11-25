public class Retângulo implements FiguraGeometrica{
    
    private int altura;
    private int base;
    private int lado1;
    private int lado2;
    public int getAltura() {
        return altura;
    }
   public int getLado1() {
    return lado1;
}
public void setLado1(int lado1) {
    this.lado1 = lado1;
}
public int getLado2() {
    return lado2;
}
public void setLado2(int lado2) {
    this.lado2 = lado2;
}
 public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public int getArea() {
        int Area;
        Area = base*altura;
        return Area;
    }
    @Override
    public int getPerimetro() {
        int Perimetro;
        Perimetro=lado1*2+lado2*2;
        return Perimetro;
    }
    @Override
    public String getNomeFigura(){
        
        return "Retângulo";
    }


}    
    
