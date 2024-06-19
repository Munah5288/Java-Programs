public class StudentMarks{
    public static void main(String[] args) {
       int totalUnits = 5;
       int Java programming = 75;
       int Application Programming = 60;
       int Network Design = 55;
       int Human Computer Interaction = 50;
       int Structured Cabling = 69;
       int sum;
         sum = Java programming+Application Programming+Network Design +Human Computer Interaction+Structured Cabling;
        double average = (double) sum/totalUnits;
    if(average>=70 && average<=100){
    System.out.println("Grade: A");
}
else if(average>=60 && average<=69){
      System.out.println("Grade: B");

}
else if(average>=50 && average<=59){
      System.out.println("Grade: C");

}
else if(average>=40 && average<=49){
      System.out.println("Grade: D");
}
else{
System.out.println("Fail");
}
}
}