public class Staticc {
    public static void main(String[] args) {
        
        Friends friend1 = new Friends("Spongebob");
        Friends friend2 = new Friends("Patrick");
        Friends friend3 = new Friends("Squidward");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);

        Friends.showFriends();

    }
}
