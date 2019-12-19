package com.kodilla.hibernate.invoce.dao;


import com.kodilla.hibernate.invoce.Invoice;
import com.kodilla.hibernate.invoce.Item;
import com.kodilla.hibernate.invoce.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void wtestInvoiceDaoSave() {
        //Given
        Product product1 = new Product("apple");



        Item item1 = new Item(new BigDecimal(12), 2);
        item1.setProduct(product1);


        List<Item> bucket1 = new ArrayList<>();
        bucket1.add(item1);

        Invoice invoice1 = new Invoice("1",bucket1);

        //When

        invoiceDao.save(invoice1);


        Iterable<Product> all = productDao.findAll();
        //Then
        Assert.assertNotEquals(0, invoice1);
    }
}
