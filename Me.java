public class Me{
public static void main(String[] args){
int n=6;
for(int i=1; i<=n; i++){
for(int j=1; j<=n-1; j++){
if(i==1||i==n/2||j==1||(j==n-1&&i<n/2))
System.out.print("*");
else
System.out.print(" ");
}
System.out.print(" ");
for(int k=1; k<=n-1; k++){
if(i==1||i==n/2||k==1||(k==n-1&&i<n/2))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
