package person;

public class Testing {

    public static void main(String[] args) {
        // Testing person class by setting the date before and after birthday and invalid DoB by passing a string instead of a formatted date
        System.out.println("Testing Person Class:");
        Person Alex = new Person("Alex", "18/06/1994");
        System.out.println(Alex.toString());
        System.out.println(Alex.age("16/06/2017"));
        System.out.println(Alex.age("26/06/2017"));
        System.out.println(Alex.age("invalid DoB"));
        System.out.println();

        // Testing student class by getting the name, dob, student number, final mark and grade
        System.out.println("Testing Student Class:");
        Student Sajidah = new Student("Sajidah", "01/03/1997", "675324", 60, 70, 50, 80, 90);
        System.out.println(Sajidah.toString());
        System.out.println(Sajidah.getFinalMark());
        System.out.println(Sajidah.getGrade());
        System.out.println();
        
        Student Maria = new Student("Maria", "01/03/1997", "89624897", 40, 60, 50, 30, 20);
        System.out.println(Maria.toString());
        System.out.println(Maria.getFinalMark());
        System.out.println(Maria.getGrade());
        System.out.println();
        

        // Testing Undergraduate Student class by getting the name, dob, student number, final mark and grade
        System.out.println("Testing Undergraduate Student Class:");
        UndergraduateStudent Akther = new UndergraduateStudent("Akther", "10/04/1997", "7865325", 60, 80, 50, 70, 90, 2017, "Computer Science");
        System.out.println(Akther.toString());
        System.out.println(Akther.getFinalMark());
        System.out.println(Akther.getGrade());
    }
}
