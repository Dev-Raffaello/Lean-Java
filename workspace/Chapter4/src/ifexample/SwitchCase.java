package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char meadalColor;
		
		switch (rank) {
		case 1: meadalColor = 'G';
		break;
		case 2: meadalColor = 'S';
		break;
		case 3: meadalColor = 'B';
		break;
		default: meadalColor='A';
		}
		System.out.println(rank + "등 메달 색깔은" + meadalColor +"입니다.");

	}

}
