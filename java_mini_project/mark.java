import java.io.*;
import java.util.*;

class mark{
public static void main(String ar[])throws Exception
{
int cse,java,osy,sen,total,roll;
String name,sem,branch;
double per;
cse=0;
java=0;
sen=0;
osy=0;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter your name: ");
String str=br.readLine();
System.out.println("Enter your semester: ");
String str6=br.readLine();
System.out.println("Enter your branch: ");
String str7=br.readLine();
System.out.println("Enter your RollNo: ");
int str1=Integer.parseInt(br.readLine());
System.out.println("Enter your CSE mark:  ");
int str2=Integer.parseInt(br.readLine());
System.out.println("Enter your JAVAmark:");
int str3=Integer.parseInt(br.readLine());
System.out.println("Enter your SEN mark:");
int str4=Integer.parseInt(br.readLine());
System.out.println("Enter your OSY mark:");
int str5=Integer.parseInt(br.readLine());

total=str2+str3+str4+str5;
per=total/4;

System.out.println("\n\n\n\nName:"+str);
System.out.println("Semester:"+str6);
System.out.println("Branch:"+str7);
System.out.println("Roll No:"+str1);

System.out.println("...................................................................");
System.out.println("\nSubjects"+"						"+"Marks");
System.out.println("....................................................................");
System.out.println("JAVA"+ "							"+str3);
System.out.println("OSY"+ "							"+str5);
System.out.println("CSE"+ "							"+str2);
System.out.println("SEN"+ "							"+str4);
System.out.println("....................................................................");
System.out.println("Total"+ "							"+total);
System.out.println("....................................................................");
System.out.println("Percentage"+ "						"+per);

if(str2<40 && str3<40 && str4<40 && str5<40)
{
	System.out.println("\n\nResult State:"+"		Fail			"+"4 ATKT");
}
else
{
	if(str2<40 || str3<40 || str4<40 || str5<40)
		System.out.println("\n\nResult State:"+"					"+" ATKT");
	else
		System.out.println("\n\nResult State:"+"						"+"Pass");
}
}
}