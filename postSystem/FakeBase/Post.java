package ru.first.spring.postSystem.FakeBase;

public class Post
{
    private String imgUrl;
    private String title;
    private int price;
    private String type_of_post;

    public Post()
    {

    }
    public Post(String imgUrl, String title, int price, String type_of_post) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.price = price;
        this.type_of_post = type_of_post;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTypeOfPost() {
        return type_of_post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
