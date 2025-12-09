//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",'4', "말티즈");
        Dog dog2 = new Dog("초코",'7', "진돗개");
        Dog dog3 = new Dog("뭉치",'7', "푸들");
        System.out.println("dog = " + dog.name + dog.breed);
        System.out.println("dog2 = " + dog2.name + dog2.breed);
        System.out.println("dog3 = " + dog3.name + dog3.breed);

    }
}