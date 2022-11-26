package bll;

public class Student {
    private String id;
    private String num;
    private String name;
    private float score;
    public static int count = 0;

    public static void setCount() {
        Student.count++;
    }

    public static int getCount() {
        return count;
    }

    public Student() {
    }
    public Student(String id, String num, String name, float score) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return this.id;
    }
    public String getNum() {return this.num;}
    public String getName() {
        return this.name;
    }
    public float getScore() {
        return this.score;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(float score) {
        this.score = score;
    }
}
