package com.testing.unittesth2.service;

import com.testing.unittesth2.UnitTestH2Application;
import com.testing.unittesth2.entities.GenericEntity;
import com.testing.unittesth2.repository.GenericEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenericServiceTest {

    @Autowired
    private GenericService genericService;

    @Autowired
    private GenericEntityRepository genericEntityRepository;

    @Test
    public void testCallToH2DB() {

        genericEntityRepository.save(new GenericEntity("test"));
        List<GenericEntity> genericServices = genericService.getAllValues();
        assertNotNull(genericServices);
    }
}
