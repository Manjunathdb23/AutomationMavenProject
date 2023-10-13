
public class Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abcdefg";
		 int k=2;
		 
		 char[] elements = s.toCharArray();
		        char [] rstr = new char[s.length()];
		        int index=0;
		        while(k < elements.length){

		            for(int i = k-1 ; i > 0 ; k--){
		                rstr[index] =  elements[k];
		                index++;
		            }

		            for(int j= index ; j < 2*k ; j++){
		                rstr[index] = elements[j];
		                index++;
		            }
		        }
		    System.out.println(rstr.toString());

	}

}
