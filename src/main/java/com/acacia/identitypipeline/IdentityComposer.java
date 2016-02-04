package com.acacia.identitypipeline;

import com.acacia.sdk.AbstractTransform;
import com.acacia.sdk.AbstractTransformComposer;
import com.google.auto.service.AutoService;

import java.util.ArrayList;
import java.util.List;


@AutoService(AbstractTransformComposer.class)
public class IdentityComposer extends AbstractTransformComposer {

    List<AbstractTransform> transforms = new ArrayList<>();


    public IdentityComposer(){
        super();
        transforms.add(new IdentityPipeline());

    }

    @Override
    public List<AbstractTransform> getOrderedTransforms() {
        return transforms;
    }
}
