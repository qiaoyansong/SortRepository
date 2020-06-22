package util;

public class SortUtil {
	//Hello World
	private SortUtil() {
		
	}
	/**
	 * 冒泡排序
	 * 
	 */
	public static void bubbleSort(int[] arr) {
		//[1,2,3,4,5]
		int i = 0, j = 0;
		int length = arr.length;//5
		int temp;
		for(i = 0;i < length - 1;i++)
		{
			for(j = 0;j < length - i - 1;j++)
			{
				if(arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	/*for(i = 0;i < length - 1;i++) //比较m-1轮
	{
		for(j = i + 1;j < length;j++) //每轮从 i+1开始比较
		{
			if(arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}*/
	public static void selectSort(int[] arr) {
		//[1,2,3,4,5]
		int i = 0,j = 0;
		int length = arr.length;//5
		int temp;
		int index;
		for(i = 0; i < length; i++)
		{
			index = i;
			for(j = i + 1; j < length; j++)
			{
				if(arr[index] > arr[j]) index = j; //记录最小元素的下标
			}
			if(index == i) continue;//没有更改  继续循环
			else //如果下标更改 就交换元素位置
			{
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
