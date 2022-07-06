import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		for (int i=n1; i<=n2; i++) if(isPrime(i)) System.out.println(i);
	   }
	   
	   private static boolean isPrime(int key) { // �Ҽ� �Ǻ� �Լ�
	      if(key==1) return false; // 1�� �Ҽ��� �ƴϴ�
	      for(int i=2; i<=Math.sqrt(key); i++) if(key%i == 0) return false; // key�� false�̸� �Ҽ�(1�� �ڱ��ڽ� ���� ���������� ���� �ֱ� ������)
	      return true;
	   }
	   
	}
