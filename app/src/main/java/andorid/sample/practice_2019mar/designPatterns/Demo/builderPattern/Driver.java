package andorid.sample.practice_2019mar.designPatterns.Demo.builderPattern;

import android.util.Log;

public class Driver {

    public void buildCollege() {
        College college = new College.Student("GVIT","VTU",1234)
                .setLectCount(100)
                .build();
        Log.d("BuilderPattern",""+college.getColName()+college.getUniversity()+college.getRegId());
    }
}
