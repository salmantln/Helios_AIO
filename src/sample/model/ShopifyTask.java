package sample.model;

import javafx.beans.property.SimpleStringProperty;
import sample.MainApplication;

public class ShopifyTask {
    private SimpleStringProperty id;
    private SimpleStringProperty item;
    private SimpleStringProperty site;
    private Billing.ProfileObject profile;
//    private String profileName;
    private SimpleStringProperty profileName;
    private SimpleStringProperty size;

    //Status Information
    private SimpleStringProperty status;
    private final SimpleStringProperty statusRunning;
    private final SimpleStringProperty foundItem;
    private final SimpleStringProperty fetchingVariants;
    private final SimpleStringProperty addingToCart;
    private final SimpleStringProperty checkout;
    private final SimpleStringProperty checkedOut;
    private final SimpleStringProperty reCaptchaToken;
    private final SimpleStringProperty startTimer;
    private final SimpleStringProperty autoStart;
    private final SimpleStringProperty itemNotFound;
    private final SimpleStringProperty errorOccured;


    public ShopifyTask(String id, String storeInput, String sizeInput, String productInputs, String proxyInput, String billingInput, SimpleStringProperty statusRunning) {
        this(null, null, null, null, null, null);

    }


    //
    public ShopifyTask(String id, String site, String size, String item
                    , String profileName,
                       String status) {
        this.id = new SimpleStringProperty(id);
        this.item = new SimpleStringProperty(item);
        this.site = new SimpleStringProperty(site);
//        this.billingProfile = new SimpleStringProperty(billingProfile);
        this.size = new SimpleStringProperty(size);
        this.status = new SimpleStringProperty(status);
        this.profileName = new SimpleStringProperty(profileName);
        profile = MainApplication.profiles.get(profileName);

        this.status = new SimpleStringProperty("Ready");
        this.statusRunning = new SimpleStringProperty("Running");
        this.errorOccured = new SimpleStringProperty("Error occurred");
        this.foundItem = new SimpleStringProperty("Item found");
        this.itemNotFound = new SimpleStringProperty("Item not found");
        this.addingToCart = new SimpleStringProperty("Adding to cart...");
        this.fetchingVariants = new SimpleStringProperty("Fetching variants.");
        this.checkout = new SimpleStringProperty("Checking out");
        this.reCaptchaToken = new SimpleStringProperty("Captcha required");
        this.checkedOut = new SimpleStringProperty("Check your email");
        this.startTimer = new SimpleStringProperty("Launching at: " + Task.getKeywordInfo().getStartTimer());
        this.autoStart = new SimpleStringProperty("Launching at: 11:00:00");

    }


    @Override
    public String toString() {
        return "ShopifyTask{" +
                "id=" + id +
                ", item=" + item +
                ", site=" + site +
//                ", billingProfile=" + billingProfile +
//                ",  Profile=" + profile +
                ",  profileName=" + profileName +
                ", size=" + size +
                ", status=" + status +
//                ", statusRunning=" + statusRunning +
//                ", foundItem=" + foundItem +
//                ", fetchingVariants=" + fetchingVariants +
//                ", addingToCart=" + addingToCart +
//                ", checkout=" + checkout +
//                ", checkedOut=" + checkedOut +
//                ", reCaptchaToken=" + reCaptchaToken +
//                ", startTimer=" + startTimer +
//                ", autoStart=" + autoStart +
//                ", itemNotFound=" + itemNotFound +
//                ", errorOccured=" + errorOccured +
                '}'
                ;
    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public String getSite() {
        return site.get();
    }

    public SimpleStringProperty siteProperty() {
        return site;
    }
    //model billingProfile getter

//    public SimpleStringProperty getBillingProfile() {
//        return billingProfile;
//    }


//    public String getBillingProfile() {
//        return billingProfile.get();
//    }
//
//    public SimpleStringProperty billingProfileProperty() {
//        return billingProfile;
//    }

    public String getSize() {
        return size.get();
    }

    public SimpleStringProperty sizeProperty() {
        return size;
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public String getStatusRunning() {
        return statusRunning.get();
    }

    public SimpleStringProperty statusRunningProperty() {
        return statusRunning;
    }

    public String getFoundItem() {
        return foundItem.get();
    }

    public SimpleStringProperty foundItemProperty() {
        return foundItem;
    }

    public String getFetchingVariants() {
        return fetchingVariants.get();
    }

    public SimpleStringProperty fetchingVariantsProperty() {
        return fetchingVariants;
    }

    public String getAddingToCart() {
        return addingToCart.get();
    }

    public SimpleStringProperty addingToCartProperty() {
        return addingToCart;
    }

    public String getCheckout() {
        return checkout.get();
    }

    public SimpleStringProperty checkoutProperty() {
        return checkout;
    }

    public String getCheckedOut() {
        return checkedOut.get();
    }

    public SimpleStringProperty checkedOutProperty() {
        return checkedOut;
    }

    public String getReCaptchaToken() {
        return reCaptchaToken.get();
    }

    public SimpleStringProperty reCaptchaTokenProperty() {
        return reCaptchaToken;
    }

    public String getStartTimer() {
        return startTimer.get();
    }

    public SimpleStringProperty startTimerProperty() {
        return startTimer;
    }

    public String getAutoStart() {
        return autoStart.get();
    }

    public SimpleStringProperty autoStartProperty() {
        return autoStart;
    }

    public String getItemNotFound() {
        return itemNotFound.get();
    }

    public SimpleStringProperty itemNotFoundProperty() {
        return itemNotFound;
    }

    public String getErrorOccured() {
        return errorOccured.get();
    }

    public SimpleStringProperty errorOccuredProperty() {
        return errorOccured;
    }

    public String getItem() {
        return item.get();
    }

    public void setItem(String item) {
        this.item.set(item);
    }

    public void setId(String id) {
        this.id.set(id);
    }


    //Met simpleproperty gemaakt.
//    public void setBillingProfile(String billingProfile) {
//        this.billingProfile.set(billingProfile);
//    }


    //met billing Model gemaakt

    public SimpleStringProperty itemProperty() {
        return item;
    }

//    public SimpleStringProperty billingProfileProperty() {
//        return billingProfile;
//    }
//
//    public void setBillingProfile(String billingProfile) {
//        this.billingProfile.set(billingProfile);
//    }




    /*
    Dit is een test om te kijken of de setters werken.
     */

    public void setSite(String site) {
        this.site.set(site);
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public void setStatusRunning(String statusRunning) {
        this.statusRunning.set(statusRunning);
    }

    public void setFoundItem(String foundItem) {
        this.foundItem.set(foundItem);
    }

    public void setFetchingVariants(String fetchingVariants) {
        this.fetchingVariants.set(fetchingVariants);
    }

    public void setAddingToCart(String addingToCart) {
        this.addingToCart.set(addingToCart);
    }

    public void setCheckout(String checkout) {
        this.checkout.set(checkout);
    }

    public void setCheckedOut(String checkedOut) {
        this.checkedOut.set(checkedOut);
    }

    public void setReCaptchaToken(String reCaptchaToken) {
        this.reCaptchaToken.set(reCaptchaToken);
    }

    public void setStartTimer(String startTimer) {
        this.startTimer.set(startTimer);
    }

    public void setAutoStart(String autoStart) {
        this.autoStart.set(autoStart);
    }

    public void setItemNotFound(String itemNotFound) {
        this.itemNotFound.set(itemNotFound);
    }

    public void setErrorOccured(String errorOccured) {
        this.errorOccured.set(errorOccured);
    }

    public Billing.ProfileObject getProfile() {
        return profile;
    }

    public SimpleStringProperty profileNameProperty() {
        return profileName;
    }
}

