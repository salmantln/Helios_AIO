package sample.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class DeepLink {

    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("link")
    @Expose
    private String link;

    /**
     * No args constructor for use in serialization
     *
     */
    public DeepLink() {
    }

    /**
     *
     * @param link
     * @param locale
     */
    public DeepLink(String locale, String link) {
        super();
        this.locale = locale;
        this.link = link;
    }

    @Override
    public String toString() {
        return "DeepLink{" +
                "locale='" + locale + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}


public class FootlockerModule {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("deepLinks")
    @Expose
    private List<DeepLink> deepLinks = null;
    @SerializedName("releaseDatetime")
    @Expose
    private String releaseDatetime;
    @SerializedName("colors")
    @Expose
    private String colors;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("brandImage")
    @Expose
    private String brandImage;
    @SerializedName("baseID")
    @Expose
    private String baseID;
    @SerializedName("hasStock")
    @Expose
    private String hasStock;
    @SerializedName("hasImage")
    @Expose
    private String hasImage;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("manufacturerSku")
    @Expose
    private String manufacturerSku;

    /**
     * No args constructor for use in serialization
     *
     */
    public FootlockerModule() {
    }

    /**
     *
     * @param hasStock
     * @param image
     * @param gender
     * @param brandImage
     * @param manufacturerSku
     * @param hasImage
     * @param deepLinks
     * @param baseID
     * @param colors
     * @param name
     * @param id
     * @param brand
     * @param releaseDatetime
     */
    public FootlockerModule(String id, String image, List<DeepLink> deepLinks, String releaseDatetime, String colors, String name, String brand, String brandImage, String baseID, String hasStock, String hasImage, String gender, String manufacturerSku) {
        super();
        this.id = id;
        this.image = image;
        this.deepLinks = deepLinks;
        this.releaseDatetime = releaseDatetime;
        this.colors = colors;
        this.name = name;
        this.brand = brand;
        this.brandImage = brandImage;
        this.baseID = baseID;
        this.hasStock = hasStock;
        this.hasImage = hasImage;
        this.gender = gender;
        this.manufacturerSku = manufacturerSku;
    }

    @Override
    public String toString() {
        return "FootlockerModule{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", deepLinks=" + deepLinks +
                ", releaseDatetime='" + releaseDatetime + '\'' +
                ", colors='" + colors + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", brandImage='" + brandImage + '\'' +
                ", baseID='" + baseID + '\'' +
                ", hasStock='" + hasStock + '\'' +
                ", hasImage='" + hasImage + '\'' +
                ", gender='" + gender + '\'' +
                ", manufacturerSku='" + manufacturerSku + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<DeepLink> getDeepLinks() {
        return deepLinks;
    }

    public void setDeepLinks(List<DeepLink> deepLinks) {
        this.deepLinks = deepLinks;
    }

    public String getReleaseDatetime() {
        return releaseDatetime;
    }

    public void setReleaseDatetime(String releaseDatetime) {
        this.releaseDatetime = releaseDatetime;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getBaseID() {
        return baseID;
    }

    public void setBaseID(String baseID) {
        this.baseID = baseID;
    }

    public String getHasStock() {
        return hasStock;
    }

    public void setHasStock(String hasStock) {
        this.hasStock = hasStock;
    }

    public String getHasImage() {
        return hasImage;
    }

    public void setHasImage(String hasImage) {
        this.hasImage = hasImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getManufacturerSku() {
        return manufacturerSku;
    }

    public void setManufacturerSku(String manufacturerSku) {
        this.manufacturerSku = manufacturerSku;
    }

}

