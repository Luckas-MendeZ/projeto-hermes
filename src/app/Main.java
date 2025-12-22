package app;

import app.feed.Feed;
import app.feed.Post;
import app.user.User;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Stores previously created users by name to prevent duplication
        HashMap<String, User> users = new HashMap<>();
        // Main feed
        Feed feed = new Feed();

        while (true) {
            System.out.println("Username (or 'exit')");
            String userName = scanner.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                break;}

                //A user is created only if they don't already exist
                // ? retrieves an existing user
                // : creates a new user
                User user = users.containsKey(userName)
                    ?users.get(userName)
                    : new User(userName);
                    users.put(userName, user);

                System.out.println("Write a post: ");
                String content = scanner.nextLine();
                feed.addPost(new Post(user, content));
            }

        // displays all posts in the feed
        feed.listPosts();
        scanner.close();
    }
}