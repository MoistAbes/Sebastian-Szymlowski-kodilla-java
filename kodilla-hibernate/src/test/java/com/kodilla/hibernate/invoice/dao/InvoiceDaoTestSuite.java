package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

//17.3
@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {


    @Autowired
    private InvoiceDao invoiceDao;

    //17.3
    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Wino");

        Item item = new Item(new BigDecimal(120), 3, new BigDecimal(33));
        Item item1 = new Item(new BigDecimal(100), 2, new BigDecimal(22));
        Item item2 = new Item(new BigDecimal(90), 6, new BigDecimal(13));

        product.getItems().add(item);
        product.getItems().add(item1);
        product.getItems().add(item2);

        item.setProduct(product);
        item1.setProduct(product);
        item2.setProduct(product);

        Invoice invoice = new Invoice("111");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }



}


