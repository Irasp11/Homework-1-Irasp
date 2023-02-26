package Student_Irasp_HW_1;

public class Student {
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    String firstName;
    String lastName;
    String group;
    double averageMark;

    public String getScholarship() {
        String firstName;
        String lastName;
        String group;
        double averageMark;
        public String getScholarship() {
        }
        String money = "";
        if (averageMark == 5.0) {
            money = "2000 грн";
        } else {
            money = "1900 грн";
        }
        return "Student " + this.firstName + " take " + money;
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup (String group){
            this.group = group;
        }

        public double getAverageMark () {
            return averageMark;
        }

        public void setAverageMark(double averageMark){
            this.averageMark = averageMark;
        }
    }
}
