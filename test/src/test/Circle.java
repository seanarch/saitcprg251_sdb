package test;

public class Circle {
	
		private int id;
		private String color;
		private double radius;
		
		public Circle() {
			
		}
		
		public Circle(int id, String color, double radius) {
			this.id = id;
			this.color = color;
			this.radius = radius;
			
		}
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		
		public String toString() {
			return "Circle: id = " + id + " , color = " + color + " , radius = " + radius;
		}
		
		public double getArea() {
			return radius * radius * Math.PI;
		}
}


 


