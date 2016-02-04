package com.acacia.identitypipeline;

import com.acacia.sdk.AbstractTransform;
import com.google.auto.service.AutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@AutoService(AbstractTransform.class)
public class IdentityPipeline extends AbstractTransform  {

    private static final Logger LOG = LoggerFactory.getLogger(IdentityPipeline.class);


    @Override
    public String transform(String s) {

        LOG.info(s);
        System.out.println("sysout: " + s);

        return s;
    }

    public IdentityPipeline() {
        super();
    }
}

