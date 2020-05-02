package mo.ed.aad.mydatabindingimpelementation.androidWave.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContactResponse {

    @SerializedName("page")
    @Expose
    private Integer page;

    @SerializedName("per_page")
    @Expose
    private Integer per_page;

    @SerializedName("total")
    @Expose
    private Integer total;

    @SerializedName("total_pages")
    @Expose
    private Integer total_pages;

    @SerializedName("data")
    @Expose
    private List<Contact> contacts=null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}