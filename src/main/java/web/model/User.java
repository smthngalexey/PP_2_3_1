package web.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "Age")
    private int age;

    public User() {
    }

    public User(Long id, String userName, String sex, int age) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User: " +
                id + " " +
                "- " + userName +
                ", sex='" + sex + '\'' +
                ", " + age +
                " years}";
    }
}
