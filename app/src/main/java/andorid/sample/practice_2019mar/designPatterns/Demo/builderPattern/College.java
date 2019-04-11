package andorid.sample.practice_2019mar.designPatterns.Demo.builderPattern;

//Vehicle.VehicleBuilder("","").set.set.build();

public class College {

    private String colName, university;
    private int regId;

    private College(Student student) {
        this.colName = student.colName;
        this.university = student.university;
        this.regId = student.regId;
    }

    public String getColName() {
        return colName;
    }

    public String getUniversity() {
        return university;
    }

    public int getRegId() {
        return regId;
    }

    public static class Student {

        private String colName, university;
        private int regId;
        private int count;
        private int lecCount;

        public Student(String colName, String university, int regId) {
            this.colName = colName;
            this.university = university;
            this.regId = regId;
        }

        public Student setStudentCount(int coutn) {
            this.count = count;
            return this;
        }

        public Student setLectCount(int lecCount) {
            this.lecCount = lecCount;
            return this;
        }

        public College build() {
            return new College(this);
        }
    }

}
