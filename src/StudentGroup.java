import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		
			
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		for(int i=0;i<length;i++)
			System.out.println(student[i]);
		return null;
	}

	@Override
	public void setStudents(Student[] students) 
	{
		// Add your implementation here
		
		
		
		for(int i=0;i<length;i++)
		{
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			student[i]=Integer.parseInt(b.readLine());
			try
			{
			if(student[i]==null)
			{
				throw new IllegalArgumentException("demo");
			}
			}	
			catch(Exception e)
				{
					System.out.println("IllegalArgumentException");
				}
				
			}		
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int a=
		return student[index];
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	int ind;
	ind=index;
	System.out.println("enter a value");
		BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		student[ind]=Integer.parseInt(b.readLine());
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		System.out.println("enter number of elements you want to enter");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		int b[]=new b[length+n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			b[i]=Integer.parseInt(br.readLine());
		}
		int k=lenght+n;
		for(int j=n+1,index=0;j<k;j++,index++)
		{
			b[j]=a[index];
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
