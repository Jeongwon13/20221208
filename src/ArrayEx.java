import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		
		//Scanner문 불러오기
		Scanner scanner = new Scanner(System.in);
		
		//배열 변수 선언
		String[] arr01;
		
		//사용자가 볼 질문 예제
		System.out.print("몇개의 연락처를 생성하세요?");
		
		//사용자가 값 입력할 수 있도록 nextInt 생성
		int count = scanner.nextInt();
		
		if(count >= 0) {
			
			//아래 배열명에 사용자에게 입력받는 count값을 변수로 대입. 
			arr01 = new String[count];
			System.out.println("새로 생성 예정인 연락처의 총 갯수는 " + arr01.length);
			
			if(count == 0) {
				System.out.println("저장공간 부족! 연락처를 생성할 수 없습니다.");
				
				//아래 0이 아닐 경우 "이름을 입력하세요:" 란에 사용자가 이름을 입력하기 위해 else scanner.nextLine() 사용
			}else {
				
				scanner.nextLine();
			
			for(int a = 0; a < count; a++) {
				System.out.print("배열의 방 번호: " + a + "에 저장할 사람 이름을 입력하세요.");
				
				//왜 변수 name이 나왔는지 잘 모르겠음.
				//아래 while문에 isEmpty를 사용하기 위한 변수가 필요해서 그런건가?
				String name = scanner.nextLine();
				
				//아래 while문은 없어도 되는거 같은데 맞나? (name.isEmpty)
				while(name.isEmpty()) {
					System.out.println("이름을 입력하지 않았습니다.");
					System.out.println("이름 입력은 필수입니다 : ");
					name = scanner.nextLine();
				}
				System.out.println("사용자가 입력한 이름은 " + name);
				
				//아래 왜 배열[a]에 name을 대입했는지 모르겠음.
				arr01[a] = name;
				
				//갑자기 왜 String email ="";가 나왔지
				String email = "";
				
				do {
						System.out.print("이메일 주소를 입력하세요: ");
						email = scanner.nextLine();
				}while(email.isEmpty());
				
				System.out.println("사용자가 입력한 이메일 주소: " + email);
				
				
				//아래는 내가 위에서부터 하면서 느낌대로 만들어 본 것.
				String number = "";
				
				
				do {
						System.out.print("연락처를 입력하세요: ");
						number = scanner.nextLine();
				}while(number.isEmpty());
						System.out.println("사용자가 입력한 연락처 번호: " + number);
				
				//근데 아래 이거 진짜 왜 하는건지 모르겠음.
				arr01[a] = number;
				
				System.out.println("배열 arr01에 저장된 연락처 번호: " + arr01[a]);
				

				
			
				}
				//아래 향상 for문은 } 빠져나와서 쓰는게 맞나?
				for(String b : arr01) {
					System.out.println(b);
			}
		}
		
		}
	}
}
