package src.app;

import src.app.feed.Feed;
import src.app.feed.Post;
import src.app.user.User;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        HashMap<String, User> users = new HashMap<>();
        Feed feed = new Feed();

        while (true) {
            System.out.println("Username (or 'exit')");
            String userName = scanner.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                break;}

                User user = users.containsKey(userName)
                    ?users.get(userName)
                    : new User(userName);
                    users.put(userName, user);

                System.out.println("Write a post: ");
                String content = scanner.nextLine();
                feed.addPost(new Post(user, content));
            }

        feed.show();
        scanner.close();
    }
}