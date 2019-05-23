
package AppLogin;


public enum option {
    Admin,Student;

    private option() {
    }
    private String val(){
        return name();
       
    }
    public  static option fromvalue(String v){
        return valueOf(v);
    }
}
