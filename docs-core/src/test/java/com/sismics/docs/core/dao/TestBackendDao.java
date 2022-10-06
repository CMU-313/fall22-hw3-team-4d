package com.sismics.docs.core.dao;

import com.sismics.docs.core.dao.dto.DocumentDto;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class TestBackendDao{
    @Test
    public void testBackendDao() throws Exception {
            /// Document with proper rating
            DocumentDto document = new DocumentDto();
            document.setTitle("Alex Barrios");
            document.setDescription("Junior @ Carnegie Mellon");
            document.setRating("5");
            document.setSubject("Student Application");
            document.setIdentifier("ID-2016-08-00001");
            document.setPublisher("My Publisher, Inc.");
            document.setFormat("A4 standard ISO format");
            document.setType("Image");
            document.setCoverage("France");
            document.setRights("Public Domain");
            document.setLanguage("en");
            document.setCreator("user1");
            document.setCreateTimestamp(new Date().getTime());
        
            Assert.assertEquals("Alex Barrios", document.getTitle());
            Assert.assertEquals("5", document.getRating());
        }

    @Test
    public void testBackendDao2() throws Exception {
            // Document with NULL rating and description
            DocumentDto document2 = new DocumentDto();
            document2.setTitle("Xinyu");
            document2.setSubject("Student Application");
            document2.setIdentifier("ID-2016-09-00001");
            document2.setPublisher("My Publisher 2, Inc.");
            document2.setFormat("A4 standard ISO format");
            document2.setType("Image");
            document2.setCoverage("France");
            document2.setRights("Public Domain");
            document2.setLanguage("en");
            document2.setCreator("user1");
            document2.setCreateTimestamp(new Date().getTime());
        
            Assert.assertEquals("Xinyu", document2.getTitle());
            Assert.assertNull(document2.getRating());
            Assert.assertNull(document2.getDescription());
        }    
    }





