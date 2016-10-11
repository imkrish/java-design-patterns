package creational_patterns.factory_method;

/**
 * Created by imKrish on 11/10/16.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {

        switch (siteType) {
            case BLOG: {
                return new Blog();
            }

            case SHOP: {
                return new Shop();
            }

            default: {
                return null;
            }
        }
    }
}
