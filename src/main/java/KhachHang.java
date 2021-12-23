import java.io.Serializable;

public class KhachHang implements Serializable {
    String name, birthday, address, img;


    public KhachHang() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public KhachHang(String name, String birthday, String address, String img) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
