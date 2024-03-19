import java.util.ArrayList;
import java.util.Scanner;

class User {
    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class Post {
    private final User author;
    private final String content;
    private final ArrayList<Comment> comments;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public void displayPost() {
        System.out.println("Author: " + author.getUsername());
        System.out.println("Content: " + content);
        System.out.println("Comments:");

        for (Comment comment : comments) {
            comment.displayComment();
        }

        System.out.println();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}

class Comment {
    private final User commenter;
    private final String text;

    public Comment(User commenter, String text) {
        this.commenter = commenter;
        this.text = text;
    }

    public void displayComment() {
        System.out.println("Commenter: " + commenter.getUsername());
        System.out.println("Text: " + text);
        System.out.println();
    }
}

public class SocialMediaSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Post post1 = new Post(user1, "This is my first post!");
        Post post2 = new Post(user2, "Hello, world!");

        Comment comment1 = new Comment(user2, "Great post, Alice!");
        Comment comment2 = new Comment(user1, "Thanks, Bob!");

        post1.addComment(comment1);
        post2.addComment(comment2);

        post1.displayPost();
        post2.displayPost();

        System.out.print("Enter your username: ");
        String newUsername = scanner.nextLine();
        User newUser = new User(newUsername);

        System.out.print("Enter your post content: ");
        String newPostContent = scanner.nextLine();
        Post newPost = new Post(newUser, newPostContent);

        System.out.println("New post created!");
        newPost.displayPost();

        scanner.close();
    }
}
