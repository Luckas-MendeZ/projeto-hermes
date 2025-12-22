package main.java.app.feed;

import java.util.ArrayList;

import main.java.app.user.User;

public class Feed {
    private ArrayList<Post> posts = new ArrayList<>();

    public void addPost(Post post){
        posts.add(post);
    }

    // Creates a method to display all posts in the feed
    public void listPosts(){
        System.out.println("\n-----FEED-----");

        // Variable to track the last author displayed
        User lastAuthor = null;

        // post counter
        int counter = 0;

        for (Post post : posts) {

            User currentAuthor = post.getAuthor();

        // Displays the author's name only if it's different from the last displayed author
        if (lastAuthor == null || !currentAuthor.equals(lastAuthor)) {
            System.out.println("Author: " + post.getAuthor().getName());
        }
        System.out.println("["+counter+"]  " + post.getContent() + " | Likes: " + post.getLikes());

            counter++;

        // Update the lastAuthor to the current one
        lastAuthor = currentAuthor;
        }
    }
}
