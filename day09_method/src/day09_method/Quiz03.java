package day09_method;

public class Quiz03 {
	public int multipleCheck(int n1) {
		if(n1 % 3 == 0) return 0;
		else return 1;
	}
	public void outPut(int n1,int re) {
		if(re == 0)
			System.out.println(n1+"�� 3�� ��� �Դϴ� ");
		else
			System.out.println(n1+"�� 3�� ����� �ƴմϴ�");
	}


}
