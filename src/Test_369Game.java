import java.util.Scanner;

/**
 * �ٹ������� ���� ���� ������ �����Ͻÿ� ����-�ϼ� 01-15 02-15 03-16 04-16 05-17 06-17 07-18 08-18
 * 09-19 10-19 ~ 21-25 22-25 �������� 25�� ����������α׷�(�⺰)
 * 
 * @author smart04
 *
 */
public class Test_369Game {

	public static void main(String[] args) {
		// ����ڷκ��� �Է��� �ޱ����� scan��ü ����
		Scanner scan = new Scanner(System.in); // ���� �Է¹޴� �Լ� Scan
		System.out.println("�Ʒ��� Ŀ���� �ΰ� 369�� �Է��ϼ���.");
		int user = 0; // ���� ���� user(���̸�)

		// �ݺ��� ����� ���� ����=============================
		do {
			System.out.println("usage:������� �Է��ϼž��մϴ�.");
			user = scan.nextInt();
		} while (user < 1); // do~while���� ���� ;�����ݷ��� �����Ѵ�.
		// �ݺ��� ����� ���� ����=============================

		// ���� �� �Է½ÿ� �ٹ����� ���� ����====================
		int longevityYear = user / 12;
		if (user % 12 > 0) {
			longevityYear++;
		}
		// ���� �� �Է½ÿ� �ٹ����� ���� ����====================

		// �ٹ������� ���� �������� ���� ����=====================
		switch (longevityYear) {
		case 1:
			System.out.println("���������� "+(user-1)+"�� �Դϴ�.");
			break;
		case 2:
			System.out.println("���������� 15�� �Դϴ�.");
			break;
		case 3:
		case 4:
			System.out.println("���������� 16�� �Դϴ�.");
			break;
		case 5:
		case 6:
			System.out.println("���������� 17�� �Դϴ�.");
			break;
		case 7:
		case 8:
			System.out.println("���������� 18�� �Դϴ�.");
			break;
		case 9:
		case 10:
			System.out.println("���������� 19�� �Դϴ�.");
			break;
		case 11:
		case 12:
			System.out.println("���������� 20�� �Դϴ�.");
			break;
		case 13:
		case 14:
			System.out.println("���������� 21�� �Դϴ�.");
			break;
		case 15:
		case 16:
			System.out.println("���������� 22�� �Դϴ�.");
			break;
		case 17:
		case 18:
			System.out.println("���������� 23�� �Դϴ�.");
			break;
		case 19:
		case 20:
			System.out.println("���������� 24�� �Դϴ�.");
			break;

		default:
			System.out.println("���������� 25�� �Դϴ�.");
			break;
		// �ٹ������� ���� �������� ���� ����=====================
		}

	}
}