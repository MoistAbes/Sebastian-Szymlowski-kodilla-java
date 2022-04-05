package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        /*
        Product product = new Product("Wino");
        Product product1 = new Product("Piwo");
        Product product2 = new Product("Wodka");

         */

        Item item = new Item(new BigDecimal(120), 3, new BigDecimal(33));
        Item item1 = new Item(new BigDecimal(100), 2, new BigDecimal(22));
        Item item2 = new Item(new BigDecimal(90), 6, new BigDecimal(13));
        Item item3 = new Item(new BigDecimal(95), 33, new BigDecimal(2));
        Item item4 = new Item(new BigDecimal(94), 32, new BigDecimal(1));



        Invoice invoice = new Invoice("1111");
        item.setInvoice(invoice);
        invoice.getItems().add(item);


        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.deleteById(id);
    }

}
