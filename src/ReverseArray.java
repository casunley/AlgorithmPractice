public class ReverseArray {
	public static int[] reverseArray(int[] arr){
		
		for(int i = 0; i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		return arr;
		
	}
	public static void main(String[] args){
		int[] array = {1,2,3,4,5};
		System.out.println("Normal: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		reverseArray(array);
		System.out.println("\n" + "Reversed: ");
		
		for(int j = 0; j < array.length; j++){
			System.out.print(array[j] + " ");
		}
	}

}
