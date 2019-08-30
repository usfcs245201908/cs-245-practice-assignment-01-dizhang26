public class Practice01MathIterative implements Practice01Math{
	public int fact (int n) throws Exception{
		if (n<0){
			throw new Exception();
		}
		int a=1;
		for (int i=1; i<=n; i++){
			a=a*i;
		}
		return a;
	}	
	public int fib (int n) throws Exception{
		if (n<0){
			throw new Exception();
		}
		if (n<=1){
			return n;
		}
		int a=1;
		int b=1;
		for (int i=2; i<n; i++){
			int temp = a;
			a+=b;
			b=temp;
		}
		return a;
	}

}