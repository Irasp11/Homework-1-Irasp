package Student_Irasp_HW_1;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double avergeMark) {
        super(firstName, lastName, group, avergeMark);

        @Override
        public String getScholarship () {
            String money;
            if(averageMark() == 5) {
                money = "сумма 2500 грн";
            } else {
                money = "2200 грн";
            }

            return "Aspirant " + getFirstName() + " take " + money;
        }
    }

}


