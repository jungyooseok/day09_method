package day09_method;

public class Quiz04 {
	public int primeCheck(int n1) {
		int cnt=0;
		for(int i=1;i<=n1;i++) {
			if(n1 % i == 0 )cnt++;
		}
		return cnt;
	}
	public void outPut(int n1,int re) {
		if(re == 2)
			System.out.println(n1+"�� �Ҽ� �Դϴ� ");
		else
			System.out.println(n1+"�� �Ҽ��� �ƴմϴ�");
	}

}
