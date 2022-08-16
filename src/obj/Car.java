package obj;
/**
 *  https://dinfree.com/lecture/language/112_java_4.html#m1
 * [객체지향]
 * 객체지향이란 현실 세계의 객체 모델을 바탕으로 프로그램을 구조화하고 개발하는 프로그래밍 기법을 말합니다.
 * 전통적인 프로그래밍 언어는 크게 객체지향 프로그래밍 언어(Object-Oriented Programming Language)와
 * 절차지향 프로그래밍 언어(Procedure-Oriented Programming Language)로 구분 되었습니다.
 *
 * 이는 과거 프로그래밍 언어의 구조적 특징에 따른 분류이며 최근에 널리 쓰이고 있는 프로그램 언어들은 기본적으로 객체지향에 기반을 두고 있습니다.
 * 또한 과거 세대 프로그래밍 언어 중 하나인 LISP에 적용되었던 함수형 언어(Functional Programming Language)의 개념이 보편적으로 확대되고 있으며
 * 자바의 경우에도 JDK8 에서 부터 이러한 최신 경향을 반영하기 시작했습니다.
 *
 * [객체(Object)]
 * 객체는 영어로 Object 가 됩니다. 사전적인 의미로는 오감을 통해 알수 있는 물건, 물체가 됩니다. 즉, 우리눈에 보이는 모든 것들이 객체 입니다
 * 일반적으로 객체는 해당 객체가 가지고 있는 속성과 객체가 할 수 있는 동작으로 설명할 수 있습니다.
 *
 * # 속성
 * - 색상: 빨간색
 * - 제조사: 현대
 * - 모델명: 소나타
 * - 출력: 180 마력
 * - 타이어: 17인치
 * ...
 *
 * # 동작
 * - 시동: 엔진을 동작 시킴
 * - 전진: 차를 앞으로 움직이게 함
 * - 후진: 차를 뒤로 움직이게 함
 * - 브레이크: 속도를 감소 시킴
 * ...
 *
 *
 * 이처럼 객체는 실제 우리눈에 보이는 대상이며 구체적인 값을 가지고 있습니다.
 * 그런데 앞에서 정의한 빨간색 소나타 뿐만 아니고 파란색 소나타도 있고 검은색 제네시스도 있고 흰색 BMW 도 있습니다.
 * 즉 공통적인 성질을 가지고 있지만 구체적인 값들이 다른 여러 객체가 있을 수 있기 때문에 공통적인 속성과 동작을 가지는 상위 개념을 정의할 수 있는데 그것이 바로 클래스 입니다.
 *
 * [클래스(Class)]
 * 클래스는 객체를 정의하기 위한 틀로써 표현하고자 하는 객체들의 속성과 동작을 정의하고 있습니다. 앞의 소나타 예에서 소나타는 Car 라고 하는 클래스로 정의할 수 있는 것입니다.
 * 실제 프로그램 안에서 속성은 필드(멤버변수)의 형태로 동작은 메서드의 형태로 표현되게 됩니다. 이해를 돕기위해 구조를 조금 단순화해서 자동차 클래스를 구현하면 다음과 같습니다.
 * **/

// 카라는 클래스를 만들것이다.
// 카 클래스에 어떤 속성들을 정의를 해야겠죠?
// 필드의 속성 멤버변수로 쓰이는 필드를 private을 쓰는게 좋다
// 객채 외부에서 다른 멤버변수를 사용할 수 없게 한다.
// getter, setter를 메서드를 통해서 접근 가능하게 해줘야 한다.
// 일단 두개의 속성을 넣겠다,
//보통 자동차의 성능은 마력으로 나타나겟죠
// 이차가 얼마나 빨리 가는지에 대한 스피드 필드 추가

public class Car {
    private String model;
    private String color;
    private int power;
    private int curSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        // 현재 인스턴스가 가지고 있는 model에 파라미터로 받은 스트링 타입의 모델의 값을 넣어 주겠다.
        // 여러가지 유연성을 가지기 때문에 게터 세터 구조를 사용하게 된다.
        // 예를 들면 멤버십 회원이면 모델 이름을 커스텀하게 사용할 수 있게 하도록 해줄 수 있다.
//        if (membership?) {
//            this.model = "VIP" + model;
//        }

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCurSpeed() {
        return curSpeed;
    }

    public void setCurSpeed(int curSpeed) {
        this.curSpeed = curSpeed;
    }
// 생성자를 만들어야 한다.
    //생성자는 클래스 이름과 동일한 이름으르 만들어진다
    // 얘는 리턴값이 없다.
    // 파라미터가 없는 생성자는 디폴트 생성자라고 부르고, 옵셔널이에요

    public Car() {
        // 현재 스피드를 0으로 초기화
        // 모든 자동차가 처음 만들어지면 속도가 0인 샅애로 만들어라
        curSpeed = 0;
    }

    public Car(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }
    //동작 정의
    public void go() {
        // 자동차를 전진 시키는 메소드
        if (power < 200) {
            //200마력 이한의 자동차는 go라는 메소드를 호출 할 수 있다.
            // 현재 속도를 10만큼 증가시킨다.
            curSpeed += 10;
        } else if (power >= 200) {
            // 가속 패달을 밟았을때 200마력 이상이면 스피드를 20만큼 증가시켜준다.
            curSpeed += 20;
        }

        System.out.printf("Accelerate %s, Current Speed %d\n", model, curSpeed);
    }

    //자동차를 멈추게하는 스피드
    public void stop() {
        curSpeed = 0;
    }
}

