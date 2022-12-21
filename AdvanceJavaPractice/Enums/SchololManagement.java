package AdvanceJavaPractice.Enums;
//TASK:okul yönetimi için öğrenci ve teacher silme programı yazınız.
//User için role tanımlayın(ADMIN,TEACHER,STUDENT) ve role göre silme yetkisi veriniz.
//öğrenci silme yetkisi: ADMIN-TEACHER
//teacher silme yetkisi: ADMIN
public class SchololManagement {
    public static void main(String[] args) {

        Student student=new Student("Ummu");
        Teacher teacher=new Teacher("Betus");

Userr user1=new Userr("Fatih",Role.Role_admin);
Userr user2=new Userr("Gulsah",Role.Role_Teacher);
Userr user3=new Userr("Osman",Role.Role_Student);

deleteStudent(student,user1);
deleteTeacher(teacher,user2);
deleteTeacher(teacher,user3);


    }
    public static void deleteStudent(Student student,Userr user) {
if(user.getRole().equals(Role.Role_admin)||user.getRole().equals(Role.Role_Teacher)){

    System.out.println(user.getRole().name+" tarafindan silindi");

}else System.out.println("yetkisiz");
    }
    public static void deleteTeacher(Teacher teacher,Userr user) {
        if(user.getRole().equals(Role.Role_admin)){

            System.out.println(user.getRole().name+" tarafindan silindi");

        }else System.out.println("yetkisiz");
    }
}
