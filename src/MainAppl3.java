
public class MainAppl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int x[] = new int[5];

int y[] = new int[] {5, 14, 25, 1, -1};
int min = y[0];
int max = y[0];

for (int i = 0;i < y.length; i++) {
	if(y[i] < min) {
		min = y[i];
	}
	if(y[i] > max) {
		max = y[i];
	}
}
System.out.println("min" + min);
System.out.println("max" + max);
//System.out.println(y[1]);
	}

}
