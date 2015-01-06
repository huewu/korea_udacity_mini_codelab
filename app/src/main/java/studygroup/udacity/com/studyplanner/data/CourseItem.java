package studygroup.udacity.com.studyplanner.data;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class CourseItem {

    public static List<CourseItem> ITEMS = new ArrayList<CourseItem>();
    static {
        // Add 3 sample items.
        ITEMS.add(new CourseItem("1", "Item 1"));
        ITEMS.add(new CourseItem("2", "Item 2"));
        ITEMS.add(new CourseItem("3", "Item 3"));
    }

    /**
     * A dummy item representing a piece of content.
     */
    public String id;
    public String content;

    public CourseItem(String id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}