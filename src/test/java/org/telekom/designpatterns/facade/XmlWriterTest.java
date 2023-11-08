package org.telekom.designpatterns.facade;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class XmlWriterTest {

    @Test
    public void testWrite(){

        Employee employee = new Employee(11L,"John Doe");
        XmlWriter xmlWriter = new XmlWriter();
        String xml = xmlWriter.writeXml(employee);

        System.out.println(xml);

        assertThat(xml.contains("<name>John Doe</name>"), equalTo(true));

    }
}
