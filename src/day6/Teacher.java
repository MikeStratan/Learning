package day6;

class Teacher {
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    void evaluate(String studentName){
        int mark = (int)(Math.random() * 4+2);
        System.out.println("Преподаватель "+this.name+" оценил студента с именем "+studentName+" по предмету "+this.subject+" на оценку "+mark+".");
    }
    //Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”.
}

