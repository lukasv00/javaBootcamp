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
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("apple");
        Product product2 = new Product("water");
        Product product3 = new Product("mop");

        Item item1 = new Item(product1, new BigDecimal(12), 2);
        Item item2 = new Item(product1, new BigDecimal(12), 5);
        Item item3 = new Item(product2, new BigDecimal(29), 1);
        Item item4 = new Item(product3, new BigDecimal(132), 1);

        List<Item> bucket1 = new ArrayList<>();
        bucket1.add(item1);
        bucket1.add(item3);

        List<Item> bucket2 = new ArrayList<>();
        bucket2.add(item2);
        bucket2.add(item4);
        bucket2.add(item3);

        Invoice invoice1 = new Invoice("1",bucket1);
        Invoice invoice2 = new Invoice("2",bucket2);

        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();

        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();
        itemDao.save(item4);
        int item4Id = item4.getId();

        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();


        //Then
        Assert.assertNotEquals(0, invoice1);
        Assert.assertNotEquals(0, invoice2);

        //CleanUp
        /*invoiceDao.deleteAll();
        productDao.deleteAll();
        itemDao.deleteAll();
        */
    }
}
