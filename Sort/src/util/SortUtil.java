package util;

public class SortUtil {
	
	private SortUtil() {
		
	}
	/**
	 * ð������
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
	/*for(i = 0;i < length - 1;i++) //�Ƚ�m-1��
	{
		for(j = i + 1;j < length;j++) //ÿ�ִ� i+1��ʼ�Ƚ�
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
				if(arr[index] > arr[j]) index = j; //��¼��СԪ�ص��±�
			}
			if(index == i) continue;//û�и���  ����ѭ��
			else //����±���� �ͽ���Ԫ��λ��
			{
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
