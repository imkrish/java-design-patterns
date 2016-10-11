package creational_patterns.factory_method;

/**
 * Created by imKrish on 11/10/16.
 */
public class Blog extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
