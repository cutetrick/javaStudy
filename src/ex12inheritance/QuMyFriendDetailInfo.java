package ex12inheritance;

class FriendInfo {
    private String name;
    int age;

    public FriendInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showMyFriendInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}

class MyFriendDetailInfo extends FriendInfo {
    private String addr;
    private String phone;

    public MyFriendDetailInfo(String name, int age, String addr, String phone) {
        super(name, age);  
        this.addr = addr;
        this.phone = phone;
    }

    public void showMyFriendDetailInfo() {
        showMyFriendInfo(); 
        System.out.println("주소: " + addr);
        System.out.println("전화: " + phone);
    }
}

public class QuMyFriendDetailInfo {
    public static void main(String[] args) {
        MyFriendDetailInfo friend = new MyFriendDetailInfo("이순신", 100, "성균관", "010-1000-8888");
        friend.showMyFriendDetailInfo();
    }
}