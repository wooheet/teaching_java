
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

