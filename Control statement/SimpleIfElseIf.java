class Test
 {
    public static void main(String[] args) 
	{
        int score = 90;

        if (score >= 90) 
		{
            System.out.println("Excellent Marks :");
        } 
		else if (score >= 80)
		{
            System.out.println("Very Good Marks :");
        } 
		else if (score >= 70) 
		{
            System.out.println("Good Marks :");
        } 
		else if (score >= 60) 
		{
            System.out.println("Average Marks :");
        } 
		else 
		{
            System.out.println("Needs Improvement");
        }
    }
}