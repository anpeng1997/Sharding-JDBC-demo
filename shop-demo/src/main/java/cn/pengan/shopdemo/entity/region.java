package cn.pengan.shopdemo.entity;

/**
 * 地理区域信息
 */
public class region {

    private Long id;

    /**
     * 地理区域编码
     */
    private String regionCode;

    /**
     * 地理区域名称
     */
    private String regionName;

    /**
     * 地理区域级别(省、市、县)
     */
    private int level;

    /**
     * 上级地理区域编码
     */
    private String parentRegionCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getParentRegionCode() {
        return parentRegionCode;
    }

    public void setParentRegionCode(String parentRegionCode) {
        this.parentRegionCode = parentRegionCode;
    }

    @Override
    public String toString() {
        return "region{" +
                "id=" + id +
                ", regionCode='" + regionCode + '\'' +
                ", regionName='" + regionName + '\'' +
                ", level=" + level +
                ", parentRegionCode='" + parentRegionCode + '\'' +
                '}';
    }
}
