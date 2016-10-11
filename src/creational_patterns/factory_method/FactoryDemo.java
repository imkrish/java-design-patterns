package creational_patterns.factory_method;

/**
 * Created by imKrish on 11/10/16.
 */
public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.print(site.getPages());
    }
}
