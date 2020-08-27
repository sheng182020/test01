package day16.Test10;

class Person{
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        if (sex=="男"|sex=="女"){
            this.sex = sex;
        }else{
            this.sex = null;
        }
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex=="男"|sex=="女"){
            this.sex = sex;
        }else{
            this.sex = null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
