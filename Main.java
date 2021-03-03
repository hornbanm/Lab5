import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.00);
    student1.setMajor("Electrical Engineering");

    student1.print();


    Student student2 = new Student();
    student2.setName("Noah Hornback");
    student2.setGPA(4.3);
    student2.setMajor("International Business & Information Systems");

    student2.print();


    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());

    double sum = 0.0;
    for (int i = 0; i < gpas.size(); i++) {
      sum += gpas.get(i);
    }

    System.out.println("The average GPA is " + sum / gpas.size());  
  }
}