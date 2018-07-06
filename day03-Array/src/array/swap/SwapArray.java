package array.swap;
/**
 * 두 변수의 값을 서로 맞바꾸는
 * swap기법을 적용하여
 * 배열의 순서를 뒤집어 보는 클래스
 * 
 * @author win10
 *
 */
public class SwapArray {

	public static void main(String[] args) {
		//1.선언 2.초기화
		int[] numbers = {10, 20, 30, 40, 50, 60, 70
				        ,80, 90, 100, 110, 120}; 
	/***************************
	 * 	배열을 뒤집는 로직의 구성
	 * **************************
	 * 1.전체 배열의 끝까지 순회를 하면
	 *   배열이 두번 뒤집어져 값이 변화가 없다
	 *   
	 * 2.배열의 순서를 뒤집기 위해서는
	 * 	 길이의 반만 작업을 수행해야 함.
	 * 0         :       11  : length - 1
	 * 1         :       10
	 * 2         :        9
	 * 3         :        8
	 * 4         :        7
	 * 5         :        6
	 * 0~5까지의 인덱스 값은 (numbers.length / 2)보다
	 * 작은 동안
	 * 
	 * 0 < idx < numbers.length / 2
	 * 맞바꿀 원소의 인섹스 : length -1 - idx
	 * 
	 */
		//3.
		for(int idx = 0; idx < numbers.length /2; idx++) {
			//swap을 위한 임시변수
			int temp;
			//앞쪽 원소 백업
			temp = numbers[idx];
			//뒷쪽 원소 값 복사
			numbers[idx] = numbers[numbers.length - 1 - idx];
			//백업 우너소를 뒷쪽 칸에 복사
			numbers[numbers.length - 1 - idx] = temp;
		}
			for(int number : numbers) {
				System.out.printf("%d \t",number);
				}
		}
}