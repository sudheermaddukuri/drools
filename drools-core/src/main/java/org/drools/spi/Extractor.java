package org.drools.spi;

/*
 * Copyright 2005 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.Serializable;

import org.drools.base.ValueType;

public interface Extractor
    extends
    Serializable {

    public Object getValue(Object object);

    public char getCharValue(Object object);

    public int getIntValue(Object object);

    public byte getByteValue(Object object);

    public short getShortValue(Object object);

    public long getLongValue(Object object);

    public float getFloatValue(Object object);

    public double getDoubleValue(Object object);

    public boolean getBooleanValue(Object object);

    public ValueType getValueType();

    public Class getExtractToClass();

}