package studygroup.udacity.com.studyplanner.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class CourseDummy {

    public static List<CourseDummy> ITEMS = new ArrayList<CourseDummy>();
    static {
        // Add 3 sample items.
        ITEMS.add(new CourseDummy("1", "Item 1"));
        ITEMS.add(new CourseDummy("2", "Item 2"));
        ITEMS.add(new CourseDummy("3", "Item 3"));
    }

    /**
     * A dummy item representing a piece of content.
     */
    public String id;
    public String content;

    public CourseDummy(String id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}