package Dec26_2018;

public class Test_ {


		public static void main(String[] args) {
			fun1();
			System.out.println(fun4(2, 4));
		}

		public static void fun1() {
			fun2(2, 5);
		}

		public static void fun2(int a, int b) {
			int t1 = a;
			int t2 = b;
			fun3((t1 + t2) + "");
			String res = (t1 + t2) + "";
			fun3(res);
		}

		public static void fun3(String res) {
			System.out.println(res);
			fun4(3, 4);
		}

		public static boolean fun4(int a, int b) {

			int i = a;
			int j = b;
			System.out.println(a + " " + b);
			return true;
		}

	}