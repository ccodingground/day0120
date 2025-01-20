package sort;

public class BubbleSortTest {

	public static void main(String[] args) {
		// 배열에 요소들을 오름차순으로 정렬하세요
		              //0  1  2  3  4  5  6
		int[] numbers= {64,34,25,12,22,90,11};
		System.out.println("정렬전");
		for(int number:numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
		
		bubbleSort(numbers);
		
		System.out.println("정렬후");
		for(int number:numbers) {
			System.out.print(number+" ");
		}
		System.out.println();

	}

	private static void bubbleSort(int[] numbers) {
		// 버블정렬처리하세요
		int n=numbers.length;
		for(int i=0;i<n-1;i++) {
			if(numbers[i] > numbers[i+1]) {
				//두수를 교환하세요
				int temp=numbers[i];
				numbers[i]=numbers[i+1];
				numbers[i+1]=temp;
			}
		}
		
		
		
	}

}
