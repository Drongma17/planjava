package codingcrack.functionalInterfacejava8;

import java.util.function.Supplier;

public interface SupplierInterface {


    String hello();
}


class SupplierMain{
    public static void main(String[] args) {

      Supplier<String> Supplier = ()-> "Hello world ";
        System.out.println(Supplier.get());

        SupplierInterface Suppliers = ()-> "this is hello function ";
        System.out.println(Suppliers.hello());
    }
}