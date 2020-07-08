package cn.pengan.shopdemo.entity;


import java.math.BigDecimal;

/**
 * 商品基本信息
 */
public class ProductInfo {


    private Long productInfoId;

    /**
     * 所属店铺id
     */
    private Long storeInfoId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 规格
     */
    private String spec;

    /**
     * 产地
     */
    private String regionCode;


    /**
     * 商品价格
     */
    private BigDecimal price;


    /**
     * 商品图片
     */
    private String imageUrl;


    ////////////////////////////////关联信息/////////////////////////////////////////

    /**
     * 商品描述
     */
    private String descript;


    /**
     * 产地名称
     */
    private String placeOfOrigin;


    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺信誉等级
     */
    private int reputation;

    /**
     * 店铺所在地名称
     */
    private String storeRegionName;

    public Long getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Long productInfoId) {
        this.productInfoId = productInfoId;
    }

    public Long getStoreInfoId() {
        return storeInfoId;
    }

    public void setStoreInfoId(Long storeInfoId) {
        this.storeInfoId = storeInfoId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getStoreRegionName() {
        return storeRegionName;
    }

    public void setStoreRegionName(String storeRegionName) {
        this.storeRegionName = storeRegionName;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productInfoId=" + productInfoId +
                ", storeInfoId=" + storeInfoId +
                ", productName='" + productName + '\'' +
                ", spec='" + spec + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", descript='" + descript + '\'' +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", storeName='" + storeName + '\'' +
                ", reputation=" + reputation +
                ", storeRegionName='" + storeRegionName + '\'' +
                '}';
    }
}
