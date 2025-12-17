package src.app.feed;

import java.util.ArrayList;

public class Feed {
    private ArrayList<Post> posts = new ArrayList<>();

    public void addPost(Post post){
        posts.add(post);
    }
    public void show(){
        System.out.println("\n-----FEED-----");
        for (Post post : posts){
            System.out.println(
                post.getAuthor().getName() + ": " + post.getContent());
        }
    }
}
