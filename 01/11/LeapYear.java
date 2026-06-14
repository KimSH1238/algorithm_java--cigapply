public class LeapYear{
    public static void main(String[] args){
        int year=2012;
        boolean isLeapYear;

        isLeapYear=(year%4 ==0);
        System.out.println("윤년 여부는 : ");
        System.out.println(isLeapYear);
        System.out.println("");
    }
}