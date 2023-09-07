class Student {
    private String name;
    private String birthday;
    private String course;
    private int lrn;

    public Student(String name, String birthday, String course, int lrn) {
        this.name = name;
        this.birthday = birthday;
        this.course = course;
        this.lrn = lrn;
    }

    public String getName() {
        return name;
    }

    public int getBirthday(){
    return birthday;
    }
    
    public String getCourse() {
        return course;
    }

    public int getlrn(){
        return lrn;
    }


}