package SortTasks_01;

import java.util.Arrays;

public class TestSortID 
{
	public static void main(String[] args)
	{
	 
	                     
	  Student[] students = new Student[3];
	  students[0] = new Student(52645," Smith");
	  students[1] = new Student(98765," Jones");
	  students[2] = new Student(1354," Johnson");
	                           
	 
	                           
	  for ( int i = 1; i < students.length; ++i ) 
	  {
          for ( int j = 0; j < i; ++j ) 
          {
              if ( students[i].id < students[j].id ) 
              {
                  Student tmp = students[i];
                  for ( int k = i - 1; k >= j; --k )
                      students[k + 1] = students[k];
                  students[j] = tmp;
              }
          }
      }
	                           
	  for(int i = 0; i < students.length; i++)
	  {
	    System.out.println(students[i].id + students[i].name);
	  }
	}
}
