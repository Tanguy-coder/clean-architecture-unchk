package com.unchk.Clean_architecture.Domain.Response;




public class CategoryResponse {
    private Long id;
    private String name;
    private String image;
    public Long getId(Long id) {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
