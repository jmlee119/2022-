import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_1744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	
		int[] arr = new int[n];
		int minus = 0;
		for (int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i]<=0) {
				minus++;
			}
		}
		Arrays.sort(arr);
		int ans =0; 
		// �� ���� �������� �ΰ��� ���ϱ�
		for (int i=1; i<minus; i++ ) {
			ans += (arr[i-1] * arr[i]);
		}
		if (minus %2 == 1) { 	//������ ������ Ȧ���϶� �׳� �������� �� �ϱ�  
			ans += arr[minus-1];
		}
		if ((n-minus)%2==1) { // ����� ������ Ȧ���� �� ���ڸ� ���ϱ� 
			ans += arr[minus];
		}
		for(int i= n-1; i>minus; i-=2) { // ����κ� �ΰ��� ����
			int mul = arr[i] * arr[i-1];
			int sum = arr[i] + arr[i-1];
			if (mul > sum) {
				ans += mul;
			}
			else { // ������� 1�� ������ ��� 
				ans += sum;
			}
		}
		System.out.println(ans);
		
//		���� , ����  ( -2 * -2 = 4)
//		���� , 0 ( -2 * 0 = 0)
//		0, ��� (0 + 4 = 4)
//		��� , ��� (6 * 4 = 24)

	}
}
