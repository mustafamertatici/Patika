package patika.StudentInformationSystems;

public class ClassStudentInformationSystems {
    public static void main(String[] args) {
        /*
        Öğrenci Not Sistemi
    Course Sınıfı Özellikleri :

    Nitelikler : name,code,prefix,note,Teacher
    Metotlar : Course() , addTeacher() , printTeacher()
    Teacher Sınıfı Özellikleri :

    Nitelikler : name,mpno,branch
    Metotlar : Teacher()
    Student Sınıfı Özellikleri :

    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
         */

        Teacher t1=new Teacher("Mahmut Hoca","TRH","09545646845");
        Teacher t2=new Teacher("Granhman Bell","FZK","0000");
        Teacher t3=new Teacher("kültuymaz","BIO","111");
       Course tarih=new Course("Tarih","101","TRH");
       tarih.addTeacher(t1);
       Course fizik=new Course("Fizik","102","FZK");
       fizik.addTeacher(t2);
       Course biyo=new Course("Biyoloji","101","BIO");
       biyo.addTeacher(t3);

       Student s1=new Student("inek Şaban","!23","4",tarih,fizik,biyo);
       s1.addBulkExamNote(100,78,50);
       s1.isPass();

       Student s2=new Student("Güdük Necmi","124","4",tarih,fizik,biyo);

        s2.addBulkExamNote(30,60,70);
        s2.isPass();






     //  Student s1=new Student("inek şaban","123","4",tarih)

    }

}
