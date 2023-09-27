class University
{
    String university_name,university_code,university_rank,university_address;
    
    public void setData(String university_name,String university_code,String university_rank,String university_address)
    {
        this.university_name=university_name;
        this.university_code=university_code;
        this.university_rank=university_rank;
        this.university_address=university_address;
    }
} 
class College extends University
{
    String college_name,college_code,college_rank,college_address;
    
    public void setData(String university_name,String university_code,String university_rank,String university_address,String college_name,String college_code,String college_rank,String college_address)
    {
        this.setData(university_name,university_code,university_rank,university_address);  
        this.college_name=college_name;
        this.college_code=college_code;
        this.college_rank=college_rank;
        this.college_address=college_address;
    }
}
class Student extends College
{
    String name,branch,course;
    int roll_no,sem;
    
    public void setData(String name,String branch,String course,int roll_no,int sem,String university_name,String university_code,String university_rank,String university_address,String college_name,String college_code,String college_rank,String college_address)
    {
        this.setData(university_name,university_code,university_rank,university_address,college_name,college_code,college_rank,college_address);
        this.name=name;
        this.branch=branch;
        this.course=course;
        this.roll_no=roll_no;
        this.sem=sem;
    }
}
class Test
{
    public static void main(String args[])
    {
        Student ob=new Student();
        ob.setData("Raghav","CS","BSc",723456,3,"DAVV","48831","1 Rank","Rigal Square","PMBGSC","57876","50 Rank","Nasiyaroad");
        System.out.println("University name  \t:\t"+ob.university_name);
        System.out.println("University code  \t:\t"+ob.university_code);
        System.out.println("University rank  \t:\t"+ob.university_rank);
        System.out.println("University address\t:\t"+ob.university_address);
        System.out.println("College  name       \t:\t"+ob.college_name);
        System.out.println("College  code      \t:\t"+ob.college_code);
        System.out.println("College  rank      \t:\t"+ob.college_rank);
        System.out.println("College  address   \t:\t"+ob.college_address);
        System.out.println("Student  name      \t:\t"+ob.name);
        System.out.println("Student  Roll_no  \t:\t"+ob.roll_no);
        System.out.println("Student  branch  \t:\t"+ob.branch);
        System.out.println("Student  course  \t:\t"+ob.course);
        System.out.println("Student  Sem      \t:\t"+ob.sem);
    }
}