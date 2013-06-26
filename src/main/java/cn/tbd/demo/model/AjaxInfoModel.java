package cn.tbd.demo.model;


/**
 * For AJAX commit.
 */
public class AjaxInfoModel {

    public static final String STATUS_YES = "y";
    public static final String STATUS_NO = "n";

    private String info = "Success";
    private String status = AjaxInfoModel.STATUS_YES;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
