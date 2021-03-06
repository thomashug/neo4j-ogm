/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.neo4j.ogm.domain.convertible.date;

import java.util.Date;

import org.neo4j.ogm.typeconversion.AttributeConverter;
import org.neo4j.ogm.typeconversion.DateStringConverter;

/**
 * @author Vince Bickers
 */
public class DateNumericStringConverter implements AttributeConverter<Date, String> {

    private final DateStringConverter converter = new DateStringConverter("yyyyMMddhhmmss");

    @Override
    public String toGraphProperty(Date value) {
        return converter.toGraphProperty(value);
    }

    @Override
    public Date toEntityAttribute(String value) {
        return converter.toEntityAttribute(value);
    }
}
