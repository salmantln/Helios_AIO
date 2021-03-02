package sample.model;

import sample.controller.Controller;
import sample.view.View;

public class Task extends Controller {

    /**
     * MODEL FOR SAVING INFORMATION
     */
    private final static Task model = new Task();

    private String keywords;
    private String size;
    private String proxyList;
    private String billingList;
    private String store;
    private int totalTasks;
    private int checkoutDelay;
    private String startTimer;
    private String profileLoader;
    private boolean hasRunStarted = false;

    public static Task getKeywordInfo() {
        return model;
    }


    public String getKeywords() {
        return keywords;
    }

    public String getSize() {
        return size;
    }

    public String getProxyList() {
        return proxyList;
    }

    public String getBillingList() {
        return billingList;
    }

    public String getStore() {
        return store;
    }

    public int getTotalTasks() {
        return totalTasks;
    }

    public int getCheckoutDelay() {
        return checkoutDelay;
    }

    public boolean isHasRunStarted() {
        return hasRunStarted;
    }

    public static Task getModel() {
        return model;
    }

    public String getStartTimer() {
        return startTimer;
    }

    public String getProfileLoader() {
        return profileLoader;
    }

    public void setTotalTasks(int totalTaskID) {
        this.totalTasks = totalTaskID;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setProxyList(String proxyList) {
        this.proxyList = proxyList;
    }

    public void setBillingList(String billingList) {
        this.billingList = billingList;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setCheckoutDelay(int checkoutDelay) {
        this.checkoutDelay = checkoutDelay;
    }

    public void setStartTimer(String startTimer) {
        this.startTimer = startTimer;
    }

    public void setProfileLoader(String profileLoader) {
        this.profileLoader = profileLoader;
    }

    public void setHasRunStarted(boolean hasRunStarted) {
        this.hasRunStarted = hasRunStarted;
    }

    @Override
    public View getView() {
        return null;
    }

    @Override
    public String toString() {
        return "Task{" +
                "keywords='" + keywords + '\'' +
                ", size=" + size +
                ", proxyList='" + proxyList + '\'' +
                ", billingList='" + billingList + '\'' +
                ", store='" + store + '\'' +
                ", totalTasks=" + totalTasks +
                ", checkoutDelay=" + checkoutDelay +
                ", hasRunStarted=" + hasRunStarted +
                '}';
    }
}
