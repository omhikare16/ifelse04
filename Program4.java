/*A student has passed his 12 th standard exam he thinks he might get marks upto 85
percent. Suggest the better career field depending upon the marks assumption.(take
hardcoded values)
Input 1: percentage >85.00;
Output: Medical
Input 2: percentage <=85.00 and percentage >75.00;
Output: Engineering;
Input 1: percentage<=75.00 and percentage>=65.00;
Output: pharmacy or bachelor in science;*/
class Code4{
	public static void main(String[] args){
		float per=86.96f;
		if(per>85.00){
			System.out.println(per + "  --> medical is best");
		}
		else if(per>75.00 && per<85.00){
			System.out.println(per + " --> Engineering is best");
		}
		else if(per>75.00 && per<65.00){
			System.out.println(per + " --> pharmacy or bachelor in science is best");
		}
		float per1=80.00f;
                if(per1>85.00){
                        System.out.println(per1 + "  --> medical is best");
                }
                else if(per1>75.00 && per1<85.00){
                        System.out.println(per1 + " --> Engineering is best");
                }
                else if(per1>75.00 && per1<65.00){
                        System.out.println(per1 + " --> pharmacy or bachelor in science is best");
                }
		float per2=62.90f;
                if(per2>85.00){
                        System.out.println(per2 + "  --> medical is best");
                }
                else if(per2>75.00 && per2<85.00){
                        System.out.println(per2 + " --> Engineering is best");
                }
                else if(per2>75.00 && per2<65.00){
                        System.out.println(per2 + " --> pharmacy or bachelor in science is best");
                }
	}
}
