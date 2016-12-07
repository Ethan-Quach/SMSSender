package edu.orangecoastcollege.cs273.smssender;

public class Contact {
    private int mId;
    private String mName;
    private String mPhone;

    public Contact(){
        this(-1, "", "");
    }

    public Contact(int id, String name, String phone)
    {
        mId = id;
        mName = name;
        mPhone = phone;
    }

    public Contact(String name, String phone) {
        mId = -1;
        mName = name;
        mPhone = phone;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Id=" + mId +
                ", Name='" + mName + '\'' +
                ", Phone='" + mPhone + '\'' +
                '}';
    }
}
