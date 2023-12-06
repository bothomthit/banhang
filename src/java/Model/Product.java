/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Product {
    private String productID;
    private String productName;
    private String productType;
    private double productPrice;
    private String productImg;
    private boolean isTrend; 
    private boolean isPopular;  
    private boolean isSaleoff;

    public Product(String productID, String productName, String productType, double productPrice, String productImg, boolean isTrend, boolean isPopular, boolean isSaleoff) {
        super();
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.productImg = productImg;
        this.isTrend = isTrend;
        this.isPopular = isPopular;
        this.isSaleoff = isSaleoff;
    }

    /**
     * Get the value of isSaleoff
     *
     * @return the value of isSaleoff
     */
    public boolean isIsSaleoff() {
        return isSaleoff;
    }

    /**
     * Set the value of isSaleoff
     *
     * @param isSaleoff new value of isSaleoff
     */
    public void setIsSaleoff(boolean isSaleoff) {
        this.isSaleoff = isSaleoff;
    }


    /**
     * Get the value of isPopular
     *
     * @return the value of isPopular
     */
    public boolean isIsPopular() {
        return isPopular;
    }

    /**
     * Set the value of isPopular
     *
     * @param isPopular new value of isPopular
     */
    public void setIsPopular(boolean isPopular) {
        this.isPopular = isPopular;
    }


    /**
     * Get the value of isTrend
     *
     * @return the value of isTrend
     */
    public boolean isIsTrend() {
        return isTrend;
    }

    /**
     * Set the value of isTrend
     *
     * @param isTrend new value of isTrend
     */
    public void setIsTrend(boolean isTrend) {
        this.isTrend = isTrend;
    }


    /**
     * Get the value of productImg
     *
     * @return the value of productImg
     */
    public String getProductImg() {
        return productImg;
    }

    /**
     * Set the value of productImg
     *
     * @param productImg new value of productImg
     */
    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    /**
     * Get the value of productPrice
     *
     * @return the value of productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Set the value of productPrice
     *
     * @param productPrice new value of productPrice
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    /**
     * Get the value of productType
     *
     * @return the value of productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Set the value of productType
     *
     * @param productType new value of productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Get the value of productName
     *
     * @return the value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Set the value of productName
     *
     * @param productName new value of productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    

    /**
     * Get the value of productID
     *
     * @return the value of productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Set the value of productID
     *
     * @param productID new value of productID
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

}
