
public class Calculadora {
	private int Numero1;
	private int Numero2;
	
	public void Calculadora(int n1, int n2){
		this.Numero1 = n1;
		this.Numero2 = n2;
	}
	public int suma(){
		return this.Numero1+this.Numero2;
	}
	public double division(){
		return this.Numero1/this.Numero2;
	}
}
