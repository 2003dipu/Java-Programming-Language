// Project: Java static keyword
//static = modifier. A single copy of a variable/method is created and shared.
// The class "owns" the static member

public class jStaticKW {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Turzo Singha");
        Friend friend2 = new Friend("Shrabanta Singha");
        Friend friend3 = new Friend("James Clear");
        Friend friend4 = new Friend("Yuval Noah Harari");

        Friend.displayFriends();        

    }
}
