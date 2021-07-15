import java.util.Scanner;
public class Main
{
	//BubbleSort
	public void BubbleSort(int array[])
	{
		//Get length of array
		int len = array.length;

		//Outer For loop
		for(int i=0;i<len-1;i++)
		{
			//Inner For Loop
			for(int j=0;j<len-i-1;j++)
			{
				//Logic
				if(array[j] > array[j+1])
				{
					//Swapping algorithm
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void main(String args[]) 
	{
		//Instances
		Main obj = new Main();	//Main Class Instance
		Scanner scan = new Scanner(System.in);//Scanner instance

		int array1[] = new int[5];	//Array1
		int array2[] = new int[5];    //Array2
		int ans[] = new int[5];	//Ans array

		//Get Input for Array1
		System.out.println("Enter Array1 : ");
		for(int i=0;i<array1.length;i++)
			array1[i] = scan.nextInt();

		//Get Input for Array2
		System.out.println("Enter Array2 : ");
		for(int i=0;i<array2.length;i++)
			array2[i] = scan.nextInt();

		//Exceptions being catched if any
		try
		{
			Runtime.getRuntime().exec("clear");	//Clears the terminal
		}
		catch(Exception e)
		{
			System.out.println("Something is wrong!");	//Show this message
		}

		//Add Array1 and Array2 and store it in ans
		for(int i=0;i<ans.length;i++)
			ans[i] = array1[i] + array2[i];	

		//Show before bubble sort
		System.out.print("\n[ ");
		for(int i : ans)
			System.out.print(i+" ");
		System.out.print("]\n");

		//Bubble Sort algorithm begins
		obj.BubbleSort(ans);

		//Show after bubble sort
		System.out.print("[ ");
		for(int i : ans)
			System.out.print(i+" ");
		System.out.print("]\n");
	}
}
