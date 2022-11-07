package model;

public abstract class User {

    private String nickname;
    private String id;
    private Date bondingDate;



    public User(String nickname, String id, Date bondingDate) {
        this.nickname = nickname;
        this.id = id;
        this.bondingDate = bondingDate;

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBondingDate() {
        return bondingDate;
    }

    public void setBondingDate(Date bondingDate) {
        this.bondingDate = bondingDate;
    }

}
