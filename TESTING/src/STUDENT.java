

class data{
	String name;
	int rollno;
	int [] marks;
	 String NAME(){
		 String N = name;
		 return N;
	 }
	 int ROLLNO(){
		 int R= rollno;
		 return R;
	 }
	 
	
	
	
}
public class STUDENT {
	 
	 static void MARKS(int [] m){
		 for(int i =0; i<m.length;i++)
		 {
			// System.out.println(m[i]);
			 System.out.print(m[i]+" ");
		 }
	 }

	public static void main(String[] args) {
		 data student = new data();
		 student.name ="sandra";
		 student.rollno = 2278;
		 System.out.println(student.name);
		 System.out.println(student.rollno);
		 student.name ="rohit";
		 student.rollno = 2279;
		 System.out.println(student.name);
		 System.out.println(student.rollno);
		 
		 int [] mark = new int [] {55,96,68,85,94};
		 MARKS(mark);
	}

}
