/**
 * final 키워드를 이용해서 리터럴을 기호상수로 나타낼 수 있다.
 */

public class Constant{
    public static void main(String[] args){
        final double KM_PER_MILE=1.609344;

        double km;
        double mile=60;
        km=KM_PER_MILE*mile;

        System.out.println("60마일은 "+km+"킬로미터 입니다.");
    }
}