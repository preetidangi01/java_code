class Pattern 
{
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
			if (j >= n + 1 - i) {
				System.out.print(i + " ");
        }
		else 
		{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}