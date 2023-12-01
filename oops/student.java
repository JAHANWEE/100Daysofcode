package oops;
class Record{
        int rollNo;
        int marks;
        String name;

}
public class student {
    public static void main(String[] args){
        Record s1 = new Record();
        s1.rollNo=1;
        s1.name="Ram";
        s1.marks =100;

        Record s2 = new Record();
        s2.rollNo=3;
        s2.name="Tanu";
        s2.marks =50;

        Record s3 = new Record();
        s3.rollNo=2;
        s3.name="Shyam";
        s3.marks =70;

        Record students[] =new Record[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name +": "+students[i].marks);       //Ram: 100
            // Tanu: 50
            // Shyam: 70
        // }

        //foreach or enhanced for-loop 
        for(Record stud :students){
            System.out.println(stud.name +" :" +stud.marks);
        }
    }
}
