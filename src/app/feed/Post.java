package app.feed;

import app.user.User;

public class Post {
    private User author;
    private String content;
    private int likes = 0;

    // main system of likes
    public void like(){
        likes++;
    }

        public Post(User author, String content){
            this.author = author;
            this.content = content;
        }
        public User getAuthor(){
            return author;
        }
        public String getContent(){
            return content;
        }
        public int getLikes(){
        return likes;
        }
}
