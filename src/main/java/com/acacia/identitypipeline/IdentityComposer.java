package com.acacia.identitypipeline;

import com.acacia.sdk.AbstractTransform;
import com.acacia.sdk.AbstractTransformComposer;
import com.google.auto.service.AutoService;

import java.util.ArrayList;
import java.util.List;


@AutoService(AbstractTransformComposer.class)
public class IdentityComposer extends AbstractTransformComposer {

    List<AbstractTransform> transforms = null;


    public IdentityComposer(){
        super();

    }

    @Override
    public List<AbstractTransform> getOrderedTransforms() {
        if(transforms == null) {
            transforms = new ArrayList<>();
            transforms.add(new IdentityPipeline());
        }

        return transforms;
    }
}
