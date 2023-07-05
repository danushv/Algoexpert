import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    //return new int[0];
int []emptyoutput={};
int [] output=new int[2];

for (int i=0;i<array.length-1;i++)
{
for(int j=i+1;j<array.length;j++)
{
if(array[i]+array[j]==targetSum)
{
output[0]=array[j];
output[1]=array[i];
}
}
}
if(output[0]!=0||output[1]!=0)
return output;
else
return emptyoutput;
  }
}
