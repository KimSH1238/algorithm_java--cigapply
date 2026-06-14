// 메소드 안의 문장들은 순차적으로 실행된다는 것을 이용

public class Caltime{
    public static void main(String[] args){
        final double light_speed=30e4;
        //final 을 붙여서 부동소수점형 기호상수로 정의하고 있다
        double distance=40e12;

        double secs;
        secs=distance/light_speed;
        double light_year=secs/(3600.0*24*365);

        System.out.println("걸리는 시간은 "+light_year+"광년 입니다.");
    }
}