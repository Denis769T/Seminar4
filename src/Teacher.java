public class Teacher extends User{
    private  Long teacherId;

    public Teacher(Integer teacherId, String surname, String firstname, String patronymic) {
        super(surname, firstname, patronymic);
         }
    public Long getTeacherId() {
        return teacherId;
    }


}
