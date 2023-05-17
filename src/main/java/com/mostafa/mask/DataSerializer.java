package com.mostafa.mask;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.mask.ProtectDataSerializer.java: PiiDataMasking-SpringBoot
 * @CreationDate 5/17/2023 3:54 PM
 */
public class DataSerializer extends JsonSerializer {
    @Override
    public void serialize(Object obj, JsonGenerator gen, SerializerProvider provider) throws IOException {
        String pii = obj.toString().replaceAll("\\w(?=\\w{4})", "x");
        gen.writeString(pii);
    }
}
