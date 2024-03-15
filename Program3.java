/*3.Write a program to check whether the given character is a vowel or consonant.(take hard
coded values)
Input 1: ‘a’
Output: a is vowel
Input 2: ‘D’
Output: D is consonant*/
class Code3{
	public static void main(String[] args){
		char ch='a';
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'  || ch=='u'){
			System.out.println(ch + " is a vowel");
		}
		else{
			System.out.println(ch + " is a consonant");
		}
		char ch1='D';
                if(ch1=='a'|| ch1=='e' || ch1=='i' || ch1=='o' ||  ch1=='u'){
                        System.out.println(ch1 + " is a vowel");
                }
                else{
                        System.out.println(ch1 + " is a consonant");
                }
	}
}

