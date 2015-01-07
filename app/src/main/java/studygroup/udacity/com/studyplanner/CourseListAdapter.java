package studygroup.udacity.com.studyplanner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import studygroup.udacity.com.studyplanner.data.CourseDummy;

public class CourseListAdapter extends ArrayAdapter<CourseDummy> {

    public CourseListAdapter(Context context) {
        super(context, R.layout.course_list_item, R.id.course_title);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
