public class MyListTest {
    public static void main(String[] args) {
        MyList<String> data = new MyList<String>();


        data.add("Ha noi");
        data.add(0, "Da nang");
        data.remove(1);

        data.remove("Da nang");
        data.add("Ho Chi Minh 1");
        data.add("Ho Chi Minh 2");
        data.add("Ho Chi Minh 3");
        data.add(0,"Ho Chi Minh 0");

        data.showElement();



    }
}
