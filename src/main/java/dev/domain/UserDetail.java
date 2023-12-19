package dev.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_detail")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserDetail() {
    }

    public UserDetail(int id, String fatherName, String motherName, User user) {
        this.id = id;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
