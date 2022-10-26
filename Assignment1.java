package NestedLooping;

public class Assignment1 {
	public static void main(String[] args) {
		int n=10;
		int j;
		for(int i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0&&i<3*n/4||j==3*n/4&&i<3*n/4||i-j==(n+2)/2||i+j==n+3&&j<3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(j==0||i==0&&j<3*n/4||i==n-1&&j<3*n/4||i==(n-1)/2&&j<3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(j==0||i==j||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==(n-1)/4||j+i==3*(n)/4&& j>=n/4 || i-j==2 && j<=3*(n)/4 && j>n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0||i==0&&j<3*(n-1)/4||j==3*(n-1)/4||i==n/2&&j<3*(n-1)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(i==0&&j<=3*n/4||j==3*n/8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			for(j=0;j<n;j++)
			{
				if(i==0&&j<=n/2||j==0||j==n/2&&i<n/2||i==(n/2)&&j<=n/2||i-j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(j==0||i==0&&j<3*(n-1)/4||j==3*(n-1)/4||i==n/2&&j<3*(n-1)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(i==0&&j<3*n/4||j==3*n/8||i==n-1&&j<3*n/8||j==0&&i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0||i==n-1&&j<(3*n)/4||j==3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==n/2&&i>3*n/8||i==n/4&&j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0||i==j||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=0;j<n;j++)
			{
				if(j==n/4||i==0&&j>n/4&&j<3*n/4||i==n-1&&j>n/4&&j<3*n/4||i==(n-1)/2&&j>n/4&&j<3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0||i==n-1&&j<(3*n)/4||j==3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(i==0&&j<=n/2||j==0||j==n/2&&i<n/2||i==(n/2)&&j<=n/2||i-j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0||i==0&&j<3*n/4||j==3*n/4||i==n-1&j<3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(j=0;j<n;j++)
			{
				if(j==0||i==j||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			// Name = VENKAT RAJU
		System.out.println();
		}
	}

}
