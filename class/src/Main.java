public class Main {

    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student();
        student[1] = new Student("Кузнецов","721",2,3,4,5);
        student[2] = new Student("Васильев","621",3,3,4,3);
        student[3] = new Student("Попов","111",2,4,4,4);
        student[4] = new Student("Новиков","131",3,5,4,4);

        for (int a=0; a<5; a++){
            student[a].metod();
            System.out.println();
        }
    }
}
class Student{
    String fio;
    String group;
    int kurs;
    int oc1;
    int oc2;
    int oc3;

    Student(String p, String n, int k, int o1, int o2, int o3 ){
        fio=p;
        group=n;
        kurs=k;
        oc1=o1;
        oc2=o2;
        oc3=o3;
    }
    Student() {
        fio="Свиридов";
        group="811";
        kurs=3;
        oc1=4;
        oc2=4;
        oc3=3;
    }
    void metod(){
        System.out.println(fio);
        System.out.print(group+" группа");
        System.out.print(kurs+" курс");
    }
}