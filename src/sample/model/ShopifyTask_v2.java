package sample.model;

import javafx.beans.property.SimpleStringProperty;

public class ShopifyTask_v2 {
    private SimpleStringProperty id;
    private SimpleStringProperty item;
    private SimpleStringProperty site;
    private Billing billingProfile;
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

    public ShopifyTask_v2() {
        this(null, null, null, null, null, null);

    }

    public ShopifyTask_v2(String id, String item, String site,
                       Billing billingProfile, String size,
                       String status) {
        this.id = new SimpleStringProperty(id);
        this.item = new SimpleStringProperty(item);
        this.site = new SimpleStringProperty(site);
        this.billingProfile = billingProfile;
        this.size = new SimpleStringProperty(size);
        this.status = new SimpleStringProperty(status);

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

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getItem() {
        return item.get();
    }

    public SimpleStringProperty itemProperty() {
        return item;
    }

    public void setItem(String item) {
        this.item.set(item);
    }

    public String getSite() {
        return site.get();
    }

    public SimpleStringProperty siteProperty() {
        return site;
    }

    public void setSite(String site) {
        this.site.set(site);
    }

    public Billing getBillingProfile() {
        return billingProfile;
    }

    public void setBillingProfile(Billing billingProfile) {
        this.billingProfile = billingProfile;
    }

    public String getSize() {
        return size.get();
    }

    public SimpleStringProperty sizeProperty() {
        return size;
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getStatusRunning() {
        return statusRunning.get();
    }

    public SimpleStringProperty statusRunningProperty() {
        return statusRunning;
    }

    public void setStatusRunning(String statusRunning) {
        this.statusRunning.set(statusRunning);
    }

    public String getFoundItem() {
        return foundItem.get();
    }

    public SimpleStringProperty foundItemProperty() {
        return foundItem;
    }

    public void setFoundItem(String foundItem) {
        this.foundItem.set(foundItem);
    }

    public String getFetchingVariants() {
        return fetchingVariants.get();
    }

    public SimpleStringProperty fetchingVariantsProperty() {
        return fetchingVariants;
    }

    public void setFetchingVariants(String fetchingVariants) {
        this.fetchingVariants.set(fetchingVariants);
    }

    public String getAddingToCart() {
        return addingToCart.get();
    }

    public SimpleStringProperty addingToCartProperty() {
        return addingToCart;
    }

    public void setAddingToCart(String addingToCart) {
        this.addingToCart.set(addingToCart);
    }

    public String getCheckout() {
        return checkout.get();
    }

    public SimpleStringProperty checkoutProperty() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout.set(checkout);
    }

    public String getCheckedOut() {
        return checkedOut.get();
    }

    public SimpleStringProperty checkedOutProperty() {
        return checkedOut;
    }

    public void setCheckedOut(String checkedOut) {
        this.checkedOut.set(checkedOut);
    }

    public String getReCaptchaToken() {
        return reCaptchaToken.get();
    }

    public SimpleStringProperty reCaptchaTokenProperty() {
        return reCaptchaToken;
    }

    public void setReCaptchaToken(String reCaptchaToken) {
        this.reCaptchaToken.set(reCaptchaToken);
    }

    public String getStartTimer() {
        return startTimer.get();
    }

    public SimpleStringProperty startTimerProperty() {
        return startTimer;
    }

    public void setStartTimer(String startTimer) {
        this.startTimer.set(startTimer);
    }

    public String getAutoStart() {
        return autoStart.get();
    }

    public SimpleStringProperty autoStartProperty() {
        return autoStart;
    }

    public void setAutoStart(String autoStart) {
        this.autoStart.set(autoStart);
    }

    public String getItemNotFound() {
        return itemNotFound.get();
    }

    public SimpleStringProperty itemNotFoundProperty() {
        return itemNotFound;
    }

    public void setItemNotFound(String itemNotFound) {
        this.itemNotFound.set(itemNotFound);
    }

    public String getErrorOccured() {
        return errorOccured.get();
    }

    public SimpleStringProperty errorOccuredProperty() {
        return errorOccured;
    }

    public void setErrorOccured(String errorOccured) {
        this.errorOccured.set(errorOccured);
    }
}
