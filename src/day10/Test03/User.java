package day10.Test03;

public class User {
    String sort;
    int id;

    public User() {
    }

    public User(String sort, int id) {
        this.sort = sort;
        this.id = id;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
