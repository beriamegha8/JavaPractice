import java.util.Date;

// Base class for all posts
abstract class Posttt {
    private String title;
    private String content;
    private Date dateCreated;

    public Posttt(String title, String content) {
        this.title = title;
        this.content = content;
        this.dateCreated = new Date();
    }

    // Abstract method to be overridden by subclasses
    public abstract void publish();

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}

// Subclass representing a text post
class TextPost extends Posttt {
    private String author;

    public TextPost(String title, String content, String author) {
        super(title, content);
        this.author = author;
    }

    // Override the publish method to handle text post publishing
    @Override
    public void publish() {
        System.out.println("Text post published by " + author + ":\n" +
                "Title: " + getTitle() + "\n" +
                "Content: " + getContent());
    }
}

// Subclass representing an image post
class ImagePost extends Posttt {
    private String imageUrl;

    public ImagePost(String title, String content, String imageUrl) {
        super(title, content);
        this.imageUrl = imageUrl;
    }

    // Override the publish method to handle image post publishing
    @Override
    public void publish() {
        System.out.println("Image post published:\n" +
                "Title: " + getTitle() + "\n" +
                "Content: " + getContent() + "\n" +
                "Image URL: " + imageUrl);
    }
}

// Subclass representing a video post
class VideoPost extends Posttt {
    private String videoUrl;

    public VideoPost(String title, String content, String videoUrl) {
        super(title, content);
        this.videoUrl = videoUrl;
    }

    // Override the publish method to handle video post publishing
    @Override
    public void publish() {
        System.out.println("Video post published:\n" +
                "Title: " + getTitle() + "\n" +
                "Content: " + getContent() + "\n" +
                "Video URL: " + videoUrl);
    }
}

// Main class to test the Posttt subclasses
public class Postt {
    public static void main(String[] args) {
        // Example usage
        TextPost textPost = new TextPost("Text Posttt", "This is a text post content.", "John Doe");
        textPost.publish();

        ImagePost imagePost = new ImagePost("Image Posttt", "This is an image post content.", "https://example.com/image.jpg");
        imagePost.publish();

        VideoPost videoPost = new VideoPost("Video Posttt", "This is a video post content.", "https://example.com/video.mp4");
        videoPost.publish();
    }
}
