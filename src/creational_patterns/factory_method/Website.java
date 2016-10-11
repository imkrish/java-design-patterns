package creational_patterns.factory_method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imKrish on 11/10/16.
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    // Factory method
    protected abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
