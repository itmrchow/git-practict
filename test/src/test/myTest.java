package test;

public class myTest {

	public static void main(String[] args) {
		
		
//		renderCircle(new ConcreteCircle(3.33));
//        renderCircle(new HollowCircle(10.2));
	}

	public static void renderCircle(AbstractCircle circle) {
		circle.render();
	}

	public abstract class AbstractCircle {
		protected double radius;

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public double getRadius() {
			return radius;
		}

		public abstract void render();

	}

	public class ConcreteCircle extends AbstractCircle {


		public ConcreteCircle(double radius) {
			this.radius = radius;
		}

		@Override
		public void render() {
			System.out.printf("畫一個半徑 %f 的實心圓\n", getRadius());
		}
	}

	public class HollowCircle extends AbstractCircle {

		public HollowCircle() {

		}

		public HollowCircle(double radius) {
			this.radius = radius;
		}

		@Override
		public void render() {
			System.out.printf("畫一個半徑 %f 的空心圓\n", getRadius());
		}
	}
}

