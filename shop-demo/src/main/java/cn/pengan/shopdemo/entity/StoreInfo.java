package cn.pengan.shopdemo.entity;

/**
 * 店铺信息
 */
public class StoreInfo {

    private Long id;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 信誉等级
     */
    private int reputation;

    /**
     * 店铺所在地
     */
    private String regionCode;

    /**
     * 店铺所在地名称
     */
    private String regionName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "StoreInfo{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", reputation=" + reputation +
                ", regionCode='" + regionCode + '\'' +
                ", regionName='" + regionName + '\'' +
                '}';
    }
}
