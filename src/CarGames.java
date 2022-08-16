public class CarGames {
    public static void main(String[] args) {
        // car game을 통해서 car 인스턴스를 생성해보자
        //2대의 차를 만들어보자

        Car c1 = new Car();

        // 생성자로 car 한대를 만들고, model을 설정하려고 한다.
        // 멤버변수에 접근할 수 없다고 에러가 발생한다.
        // c1.model("tesla model y");
        // 세터 메서드를 만들었기 때문에 아까와 다르게 세터 메서드를 사용할 수 있다.
        c1.setModel("tesla model y");
        c1.setColor("red");
        c1.setPower(180);

        // 문제: 객체에 들어가는 필드값들이 여러개라면 일일이 이렇게 넣어주는게 불편하고 기계적인 일이 될 수 있겠구나.
        // 이러한 구조를 사용하는 경우도 있지만, 보완해줄 수 있는 구조를 만들 수 있다.

        // 똑같이 car 생성자를 만들건대 파라미터를 받는 생성자를 만들거다.

        Car c2 = new Car("tesal model x", "white", 250);

        c1.go();
        c2.go();
    }
}
