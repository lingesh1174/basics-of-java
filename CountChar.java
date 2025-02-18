public class CountChar
{
	public static void main(String[] args) {
	    String str="abcabcabc";
	    int count=0;
	    boolean d=false;
	    for(int i=0;i<str.length();i++){
	        d=false;
	        for(int j=i+1;j<str.length();j++)
	        if(str.charAt(i)==str.charAt(j)){
	            d=true;
	        }
	        if(d==false)
	            count++;
	    }
		System.out.println(count);
	}
}