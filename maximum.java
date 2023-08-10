//     -----------Name:- Atul Kumar --------Univ. Roll No:- 2215000411 ----------

public class maximum {
    public static void main(String[] args)
	{
		int arr[]={2,6,23,67,90};
        int max=0;
        for (int i=0; i<5;i++ )
        {
            if(max<arr[i])
                max=arr[i];
        }
		System.out.println(max);	
	}
}
