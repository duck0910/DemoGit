/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demogit;

/**
 *
 * @author TUYET NGAN
 */
public class DemoGit {

    private String ProductIDString, ProductName;

    public DemoGit() {
    }

    public DemoGit(String ProductIDString, String ProductName) {
        this.ProductIDString = ProductIDString;
        this.ProductName = ProductName;
    }

    public String getProductIDString() {
        return ProductIDString;
    }

    public void setProductIDString(String ProductIDString) {
        this.ProductIDString = ProductIDString;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    
}
