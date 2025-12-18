package src.app.feed;

import java.util.ArrayList;
import src.app.user.User;

public class Feed {
    private ArrayList<Post> posts = new ArrayList<>();

    public void addPost(Post post){
        posts.add(post);
    }

    // Creates a method to display all posts in the feed
    public void show(){
        System.out.println("\n-----FEED-----");

        // Variable to track the last author displayed
        User lastAuthor = null;

        for (Post post : posts) {
            User currentAuthor = post.getAuthor();

        // Displays the author's name only if it's different from the last displayed author
        if (lastAuthor == null || !currentAuthor.equals(lastAuthor)) {
            System.out.println(post.getAuthor().getName());
        }
        System.out.println("  " + post.getContent());

        // Update the lastAuthor to the current one
        lastAuthor = currentAuthor;
        }
    }
}
