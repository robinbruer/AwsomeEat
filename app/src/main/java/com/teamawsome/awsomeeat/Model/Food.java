package com.teamawsome.awsomeeat.Model;

public class Food {

      private String Name,Imag,Description,Price,Discount,MenuId;

    public Food() {

    }

    public Food(String name, String image, String description, String price, String discount, String menuId) {
        Name = name;
        Imag = image;
        Description = description;
        Price = price;
        Discount = discount;
        MenuId = menuId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Imag;
    }

    public void setImage(String imag) {
        Imag = imag;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
