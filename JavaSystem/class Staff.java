class Staff{
    private String staffName;
    private String staffBirthday;
    private String staffPosition;

    public Staff(String staffName, String staffBirthday, String staffPosition){
        this.staffName = staffName;
        this.staffBirthday = staffBirthday;
        this.staffPosition = staffPosition;
    }

    public String getName() {
      return staffName;
    }

    public int getBirthday(){
      return staffBirthday;
    }
    
    public String getPosition() {
      return staffPosition;
    }
}