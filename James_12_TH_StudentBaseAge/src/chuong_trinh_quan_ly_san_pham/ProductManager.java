package chuong_trinh_quan_ly_san_pham;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ProductManager {
    private static ArrayList<Product> products = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void addProduct(Product product){
            products.add(product);
    }
    public static void add(){
        System.out.println("Nhap id");
        String id = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap ten");
        String name = sc.nextLine();
        System.out.println("Nhap so luong");
        int soluong = sc.nextInt();
        System.out.println("Nhap gia");
        double crice = sc.nextDouble();
        Product product = new Product(id,name,soluong,crice);
        addProduct(product);
    }
    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    public static void removeProduct(String id){
        for(Product product: products){
            if (product.getId().equals(id)){
                products.remove(product);

            }else {
                System.out.println("Khong tim thay san pham muon xoa");
            }
        }
    }
    public static void updateProduct(String id){
        for(Product product: products){
            if (product.getId().equals(id)){
                product.setId(id);
                System.out.println("Nhap vao ten");
                String name = sc.nextLine();
                product.setName(name);
                System.out.println("Nhap vao so luong");
                int soLuong = sc.nextInt();
                product.setQuantity(soLuong);
                System.out.println("Nhap vao gia");
                double price = sc.nextDouble();
                product.setPrice(price);


            }else {
                System.out.println("Khong tim thay san pham muon xoa");
            }
        }
    }
    public static void displayProduct(){
        for(Product product: products){
            System.out.println(product.toString());
        }
    }
    public static void findProductByName(String name){
        for (Product product: products){
            if(product.getName().equals(name)){
                System.out.println(product.toString());
            }else {
                System.out.println("No product find");
            }
        }
    }
    public static void sortProductByPrice(){

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(),p2.getPrice());
            }
        });

    }
}
