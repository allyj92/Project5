package reference.selfpractice;

public class EX1 {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("아메리카노","핫");
        Coffee coffee2 = new Coffee("카푸치노","아이스");
        Coffee coffee3 = new Coffee("카페모카","핫");

        Cake cake1 = new Cake("무스 케이크","1조각");
        Cake cake2 = new Cake("뉴욕 치즈 케이크","2조각");
        Cake cake3 = new Cake("슈풀레 치즈 케이크","3조각");

        Menu set1 = new Menu("세트1", 9800,coffee1,cake1);
        Menu set2 = new Menu("세트2", 9800,coffee2,cake2);
        Menu set3 = new Menu("세트3", 9800,coffee3,cake3);

        System.out.println("메뉴 이름: " + set1.getName());
        System.out.println("가격: " + set1.getPrice() + "원");
        System.out.println("커피 종류: " + set1.getCoffee().getMenuName());
        System.out.println("커피 온도: " + set1.getCoffee().getTempearture());
        System.out.println("케이크 종류: " + set1.getCake().getMenuName());
        System.out.println("케이크 용량: " + set1.getCake().getPiece());

        System.out.println();

        System.out.println("메뉴 이름: " + set2.getName());
        System.out.println("가격: " + set2.getPrice() + "원");
        System.out.println("커피 종류: " + set2.getCoffee().getMenuName());
        System.out.println("커피 온도: " + set2.getCoffee().getTempearture());
        System.out.println("케이크 종류: " + set2.getCake().getMenuName());
        System.out.println("케이크 용량: " + set2.getCake().getPiece());

        System.out.println();

        System.out.println("메뉴 이름: " + set3.getName());
        System.out.println("가격: " + set3.getPrice() + "원");
        System.out.println("커피 종류: " + set3.getCoffee().getMenuName());
        System.out.println("커피 온도: " + set3.getCoffee().getTempearture());
        System.out.println("케이크 종류: " + set3.getCake().getMenuName());
        System.out.println("케이크 용량: " + set3.getCake().getPiece());



    }
}

class Menu{
    private String name;
    private int price;
    Coffee coffee;
    Cake cake;

    public Menu(String name, int price, Coffee coffee, Cake cake) {
        this.name = name;
        this.price = price;
        this.coffee = coffee;
        this.cake = cake;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public Cake getCake() {
        return cake;
    }
}

class Coffee{
    private String menuName;
    private String tempearture;

    public Coffee(String menuName, String tempearture) {
        this.menuName = menuName;
        this.tempearture = tempearture;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getTempearture() {
        return tempearture;
    }
}

class Cake{
    private String menuName;
    private String piece;

    public Cake(String menuName, String piece) {
        this.menuName = menuName;
        this.piece = piece;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getPiece() {
        return piece;
    }
}


