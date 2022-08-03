package com.terra.entity;

import org.springframework.stereotype.Component;

@Component
public interface ProcessingService {

    int processingFee();
    int duration();
}