package rectangle2;

public class Calculo {
	double width = 0;
	 double height = 0;
	 
	 
	 public  double  area() {
		 return  width * height;
	 }
	 public double perimeter() {
		 return 2 *( width + height);
	 }
	 public double diagonal() {
		 return Math.sqrt( width * width + height *height);
	 }

}
